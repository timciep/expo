package expo.modules.splashscreen

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import expo.modules.core.interfaces.Package
import expo.modules.core.interfaces.ReactActivityLifecycleListener
import expo.modules.core.interfaces.SingletonModule
import expo.modules.splashscreen.SplashScreenManager.registerOnActivity


class SplashScreenPackage : Package {



  override fun createReactActivityLifecycleListeners(activityContext: Context): List<ReactActivityLifecycleListener> {
    return listOf(object : ReactActivityLifecycleListener {
      override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
        super.onCreate(activity, savedInstanceState)
        registerOnActivity(activity);
      }
    })
  }
//
//
//    /**
//   * Searches for RootView that conforms to class given via [SplashScreen.show].
//   * If [rootView] is already found this method is noop.
//   */
//  private fun searchForRootView() {
//    if (rootView != null) {
//      return
//    }
//    // RootView is successfully found in first check (nearly impossible for first call)
//    findRootView(contentView)?.let { return@searchForRootView handleRootView(it) }
//    handler.postDelayed({ searchForRootView() }, SEARCH_FOR_ROOT_VIEW_INTERVAL)
//  }
//
//  private fun findRootView(view: View): ViewGroup? {
//    if (rootViewClass.isInstance(view)) {
//      return view as ViewGroup
//    }
//    if (view != splashScreenView && view is ViewGroup) {
//      for (idx in 0 until view.childCount) {
//        findRootView(view.getChildAt(idx))?.let { return@findRootView it }
//      }
//    }
//    return null
//  }
//
//  private fun handleRootView(view: ViewGroup) {
//    rootView = view
//    if ((rootView?.childCount ?: 0) > 0) {
//      if (autoHideEnabled) {
//        hideSplashScreen()
//      }
//    }
//    view.setOnHierarchyChangeListener(object : ViewGroup.OnHierarchyChangeListener {
//      override fun onChildViewRemoved(parent: View, child: View) {
//        // TODO: ensure mechanism for detecting reloading view hierarchy works (reload button)
//        if (rootView?.childCount == 0) {
//          showSplashScreen()
//        }
//      }
//
//      override fun onChildViewAdded(parent: View, child: View) {
//        // react only to first child
//        if (rootView?.childCount == 1) {
//          if (autoHideEnabled) {
//            hideSplashScreen()
//          }
//        }
//      }
//    })

}
