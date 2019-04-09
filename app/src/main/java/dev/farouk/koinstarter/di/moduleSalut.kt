package dev.farouk.koinstarter.di

import dev.farouk.koinstarter.Salut
import org.koin.dsl.module

val moduleSalut = module {
    // provides single instance of Salut
    single { Salut() }
}