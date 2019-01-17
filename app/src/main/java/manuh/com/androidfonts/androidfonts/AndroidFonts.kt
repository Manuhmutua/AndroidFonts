package manuh.com.androidfonts.androidfonts

import android.app.Application
import manuh.com.androidfonts.utils.TypefaceUtil


class AndroidFonts : Application() {
    override fun onCreate() {
        super.onCreate()
        TypefaceUtil.overrideFont(
            applicationContext,
            "SERIF",
            "fonts/oxygen.ttf" // font from assets: "assets/fonts/oxygen.ttf
        )
    }
}