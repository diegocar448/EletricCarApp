package br.com.diegocar.eletriccarapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  preco: EditText
    lateinit var  kmPercorrido: EditText
    lateinit var  btnCalcular: Button
    lateinit var  resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView(){
        preco = findViewById<EditText>(R.id.et_preco_kwh)
        kmPercorrido = findViewById<EditText>(R.id.et_km_percorrido)
        resultado = findViewById<TextView>(R.id.tv_resultado)
        btnCalcular = findViewById<Button>(R.id.btn_calcular)
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener{
            calcular()
        }
    }

    fun calcular(){
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()

        val result = preco / km

        resultado.text = result.toString()
    }
}

