package expo.modules.splashscreen

import expo.modules.kotlin.Promise
import expo.modules.kotlin.exception.Exceptions
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

// Below import must be kept unversioned even in versioned code to provide a redirection from
// versioned code realm to unversioned code realm.
// Without this import any `SplashScreen.anyMethodName(...)` invocation on JS side ends up
// in versioned SplashScreen kotlin object that stores no information about the ExperienceActivity.

class SplashScreenModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoSplashScreen")

    AsyncFunction("preventAutoHideAsync") { promise: Promise ->
     SplashScreenManager.preventAutoHide()

//      SplashScreen.preventAutoHide(
//        currentActivity,
//        { hasEffect -> promise.resolve(hasEffect) },
//        { m -> promise.reject(PreventAutoHideException(m)) }
//      )
    }

    AsyncFunction("hideAsync") { promise: Promise ->
      SplashScreenManager.hide()

//      SplashScreen.hide(
//        currentActivity,
//        { hasEffect -> promise.resolve(hasEffect) },
//        { m -> promise.reject(HideAsyncException(m)) }
//      )
    }
  }
}
