package com.yudo.dortislemkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun topla(view : View){
        var editText = findViewById<TextView>(R.id.editText)
        sayi1 = editText.text.toString().toIntOrNull()

        var editText2 = findViewById<TextView>(R.id.editText2)
         sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            var textView =findViewById<TextView>(R.id.textView)
            textView.text ="Sayı girmeyi unutmayınız."

        }else{
             sonuc = sayi1!! + sayi2!!

            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sonuç ${sonuc}"

        }

    }
    fun cikar(view: View){
        var editText = findViewById<TextView>(R.id.editText)
         sayi1 = editText.text.toString().toIntOrNull()

        var editText2 = findViewById<TextView>(R.id.editText2)
        sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sayı girmeyi unutmayınız."
        }else{

             sonuc = sayi1!! - sayi2!!

            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sonuç ${sonuc}"
        }


    }
    fun bol(view: View){
        var editText = findViewById<TextView>(R.id.editText)
         sayi1 = editText.text.toString().toIntOrNull()

        var editText2 = findViewById<TextView>(R.id.editText2)
         sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sayı girmeyi unutmayınız."
        }else{

            sonuc = sayi1!! / sayi2!!

            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sonuç ${sonuc}"
        }


    }
    fun carp(view: View){
        var editText = findViewById<TextView>(R.id.editText)
         sayi1 = editText.text.toString().toIntOrNull()

        var editText2 = findViewById<TextView>(R.id.editText2)
         sayi2 = editText2.text.toString().toIntOrNull()

        if(sayi1 == null || sayi2 == null){
            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sayı girmeyi unutmayınız."
        }else{

            sonuc = sayi1!! * sayi2!!

            var textView = findViewById<TextView>(R.id.textView)
            textView.text = "Sonuç ${sonuc}"
        }


    }

}





