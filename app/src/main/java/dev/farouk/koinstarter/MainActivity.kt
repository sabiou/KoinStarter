package dev.farouk.koinstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.farouk.koinstarter.viewmodel.SalutViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val salutViewModel: SalutViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = salutViewModel.saluerKoin()
    }
}