package dev.farouk.koinstarter.di

import dev.farouk.koinstarter.SalutRepository
import dev.farouk.koinstarter.SalutRepositoryImpl
import dev.farouk.koinstarter.viewmodel.SalutViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // provides single instance of SalutRepository
    single<SalutRepository> { SalutRepositoryImpl() }

    // instance of SalutViewModel
    viewModel {
        SalutViewModel(get())
    }
}