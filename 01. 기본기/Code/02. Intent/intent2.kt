package org.worldskills.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.worldskills.myapplication.databinding.ActivityIntent2Binding
import org.worldskills.myapplication.databinding.ActivityIntentBinding

class intent2 : AppCompatActivity() {
    private lateinit var binding: ActivityIntent2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntent2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.result.setOnClickListener {

            val number1 = intent.getIntExtra("number1",0)
            val number2 = intent.getIntExtra("number2",0)

            Log.d("number",""+number1)
            Log.d("number",""+number2)

            val result = number1 + number2;
            val result_intent = Intent();
            result_intent.putExtra("result",result)
            setResult(Activity.RESULT_OK,result_intent)
            finish() //intent2가 종료됨 ==> intent2를 호출한 intent1으로 복귀
        }
    }
}