package com.example.rizkymaulana191011402105listview
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cars = arrayOf(
            "Toyota",
            "Daihatsu",
            "Mitsubishi",
            "Ford",
            "Hyundai",
            "Jeep",
            "BMW",
            "Mercedez Benz",
            "Volkswagen"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cars)

        LV_item.adapter = adapter
        LV_item.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "this is a ${cars[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}