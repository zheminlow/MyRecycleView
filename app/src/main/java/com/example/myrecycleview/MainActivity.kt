package com.example.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleview.data.MyAdapter
import com.example.myrecycleview.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Pen", 2.50, R.drawable.ic_baseline_brush_24),
            Product("Computer", 2250.50, R.drawable.ic_baseline_camera_24),
            Product("Laptop", 3200.00, R.drawable.ic_baseline_brush_24),
            Product("Mic", 200.00, R.drawable.ic_baseline_brush_24),
            Product("KeyBoard", 500.00, R.drawable.ic_baseline_brush_24),
            Product("Mouse", 250.00, R.drawable.ic_baseline_brush_24),

            )

        val recyclerView:RecyclerView = findViewById(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)
    }
}