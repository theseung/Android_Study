package org.worldskills.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import org.worldskills.myapplication.databinding.ActivityListenerBinding
import org.worldskills.myapplication.databinding.ActivityMainBinding

class Listener : AppCompatActivity() {
    private lateinit var binding: ActivityListenerBinding

    var number = 10;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListenerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hello.setText(""+number)

        binding.hello.setOnClickListener {
            Log.d("listener","hello")
            number++;
            binding.hello.setText(""+number)
            binding.imageview.setImageResource(R.drawable.ic_launcher_background)
        }

    }

    fun onClick(v: View) {
        Log.d("tag","hello")
    }
}