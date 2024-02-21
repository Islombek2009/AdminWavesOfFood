package com.example.adminwavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminwavesoffood.adapter.PendingOrderAdapter
import com.example.adminwavesoffood.databinding.ActivityPendingOrderBinding

class PendingOrderActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPendingOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendingOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.backButton.setOnClickListener {
                finish()
            }

            val orderedCustomerName = arrayListOf(
                "John Doe",
                "Jane Smith",
                "Mike Johnson",
            )
            val orderedQuantity = arrayListOf(
                "8",
                "6",
                "5"
            )
            val orderedFoodImage = arrayListOf(R.drawable.menu1,R.drawable.menu2,R.drawable.menu3,)
            val adapter = PendingOrderAdapter(orderedCustomerName, orderedQuantity,orderedFoodImage, this)
            binding.pendingOrderRecyclerView.adapter = adapter
            binding.pendingOrderRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}