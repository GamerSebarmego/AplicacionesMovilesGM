package pe.edu.barcomego.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pe.edu.barcomego.databinding.ActivityInitialBinding

class InitialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInitialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogeate.setOnClickListener {
            val ventanalogin = Intent(this, LoginActivity::class.java)
            startActivity(ventanalogin)
            Toast.makeText(this, "Ingreso al Login", Toast.LENGTH_SHORT).show()
        }
    }
}