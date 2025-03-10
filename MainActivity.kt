package my.poject2.helloapp

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
     val tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        val btnClickMe = findViewById<Button>(R.id.btn_click_me)
        btnClickMe.setOnClickListener{
            if (TextUtils.isEmpty(tvGreeting.text)) {
                tvGreeting.text = "Здорова,Тук!"
            }else{
                Toast.makeText(this,"Хватит,сколько можно  нажимать!", Toast.LENGTH_LONG).show()
            }
        }
    }
}