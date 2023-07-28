package pe.edu.barcomego.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import pe.edu.barcomego.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textInputEmail.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateEmailPass(text.toString(), binding.textInputPass.editText?.text.toString())
        }
        binding.textInputPass.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validateEmailPass(binding.textInputEmail.editText?.text.toString(), text.toString())
        }

        binding.btnLogin.setOnClickListener {
            val ventanamenu = Intent(this, MainActivity::class.java)
            startActivity(ventanamenu)
            Toast.makeText(this, "Ingreso al Menu", Toast.LENGTH_SHORT).show()
        }

    }

    private fun validateEmailPass(email:String, password:String): Boolean {
        val validateEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email == "ejemplo@idat.edu.pe"
        val validatePass = password.length >= 6 && password == "123456"
        return validateEmail && validatePass
    }
}