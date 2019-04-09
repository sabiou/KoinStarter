package dev.farouk.koinstarter

import android.app.Application
import dev.farouk.koinstarter.di.moduleSalut
import org.koin.core.context.startKoin

class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // start koin
        startKoin {
            modules(moduleSalut)
        }
    }
}