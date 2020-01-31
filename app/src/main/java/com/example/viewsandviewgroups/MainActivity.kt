package com.example.viewsandviewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onGenerateLabel(view: View) {
        val firstName = etFirstName.text.toString()
        val lastName = etLastName.text.toString()
        val street = etStreetAddress.text.toString()
        val city = etCity.text.toString()
        val state = etState.text.toString()
        val zip =etZip.text.toString()

        val person = Person(firstName, lastName)
        val address = Address(street, city, state, zip)

        Log.d("TAG", person.toString())
        Log.d("TAG", address.toString())

    }
}
