package com.example.adminwavesoffood


import com.example.adminwavesoffood.adapter.DeliveryAdapter
import com.example.adminwavesoffood.databinding.ActivityOutForDeliveryBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class OutForDeliveryActivity : AppCompatActivity() {
    private val binding:ActivityOutForDeliveryBinding by lazy {
        ActivityOutForDeliveryBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        val customerName = arrayListOf(
            "John Doe",
            "Jane Smith",
            "Mike Johnson",
        )
        val moneyStatus = arrayListOf(
            "received",
            "notReceived",
            "Pending"
        )
        val adapter = DeliveryAdapter(customerName, moneyStatus)
        binding.deliveryRecyclerView.adapter = adapter
        binding.deliveryRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}