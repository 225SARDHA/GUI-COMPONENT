package org.rajalakshmi.experiment1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        val tvText: TextView = findViewById(R.id.tvText)

        val btFontSize: Button = findViewById(R.id.btFontSize)
        val btFontColor: Button = findViewById(R.id.btFontColor)
        val btBackgroundColor: Button = findViewById(R.id.btBackgroundColor)
        var fontSize: Float = 5f
        var fontColor: Int = 0
        var backgroundcolor: Int = 0
        btFontSize.setOnClickListener {
            tvText.setTextSize(fontSize)
            fontSize = (fontSize + 5) % 50
        }
        btFontColor.setOnClickListener {
            when (fontColor % 3) {
                0 -> tvText.setTextColor(Color.MAGENTA)
                1 -> tvText.setTextColor(Color.GREEN)
                2 -> tvText.setTextColor(Color.DKGRAY)
            }
            fontColor++
        }
        btBackgroundColor.setOnClickListener {
            when (backgroundcolor % 3) {
                0 -> linearLayout.setBackgroundColor(Color.MAGENTA)
                1 -> linearLayout.setBackgroundColor(Color.GREEN)
                2 -> linearLayout.setBackgroundColor(Color.DKGRAY)
            }
            backgroundcolor++
        }
    }
}