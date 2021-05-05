package io.eskills.benarfaboulangerie

import android.R.attr.password
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class LoginActivitry : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activitry)
        val t = findViewById<TextView>(R.id.login_button)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        mAuth = FirebaseAuth.getInstance();
        t.setOnClickListener(View.OnClickListener {
            mAuth!!.signInWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(
                    this
                ) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        val mainIntent = Intent(this, MainActivity::class.java)
                        startActivity(mainIntent)
                    } else {
                        // If sign in fails, display a message to the user.
                        Toast.makeText(baseContext, "Login failed", Toast.LENGTH_SHORT).show()
                    }

                    // ...
                }

        })
    }
}