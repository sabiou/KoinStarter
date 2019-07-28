package dev.farouk.koinstarter

import android.app.Application
import dev.farouk.koinstarter.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // start koin
        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)
            modules(appModule)
        }
    }
}