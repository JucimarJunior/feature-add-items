package com.example.additem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtQuantity = 0;

        addItem.setOnClickListener {
            if (txtQuantity >= 19) {
                Toast.makeText(this@MainActivity, "Maior que 19 não permitido", Toast.LENGTH_SHORT)
                    .show()
            } else {
                txtQuantity++
                textView.text = txtQuantity.toString()
            }
        }

        removeItem.setOnClickListener {
            if (txtQuantity <= 0) {
                Toast.makeText(this@MainActivity, "Menor que 0 não permitido", Toast.LENGTH_SHORT)
                    .show()
            } else {
                txtQuantity--
                textView.text = txtQuantity.toString()
            }
        }
    }
}

