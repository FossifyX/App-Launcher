package com.simplemobiletools.applauncher

import android.support.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        Stetho.initializeWithDefaults(this)
    }
}
