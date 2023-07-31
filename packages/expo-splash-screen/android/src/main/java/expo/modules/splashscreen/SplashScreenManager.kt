package expo.modules.splashscreen

import android.app.Activity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

object SplashScreenManager {
    private var keepSplashOnScreen = true;

    fun registerOnActivity(activity: Activity) {
        activity.installSplashScreen().setKeepOnScreenCondition { keepSplashOnScreen }
    }

    fun preventAutoHide() {
        keepSplashOnScreen = true;
    }

    fun hide() {
        keepSplashOnScreen = false;
    }
}