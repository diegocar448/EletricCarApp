package br.com.diegocar.eletriccarapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    lateinit var  preco: EditText
    lateinit var  btnCalcular: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView(){
        preco = findViewById<EditText>(R.id.et_preco_kwh)
        btnCalcular = findViewById<Button>(R.id.btn_calcular)
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            val textDigitado = preco.text.toString()
            Log.d("texto digitado", textDigitado)
        }
    }
}

