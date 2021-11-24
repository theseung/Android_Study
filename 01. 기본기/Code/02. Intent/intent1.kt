package org.worldskills.myapplication

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import org.worldskills.myapplication.databinding.ActivityIntentBinding

class intent1 : AppCompatActivity() {
    private lateinit var binding: ActivityIntentBinding

    val intentResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == Activity.RESULT_OK){
            val res = it.data?.getIntExtra("result",0);
            Log.d("number",""+res);
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.changeActivity.setOnClickListener {

//            val intent = Intent(this@intent1, intent2::class.java)
//            intent.putExtra("number1",1)
//            intent.putExtra("number2",2)
//            intentResult.launch(intent);

            //암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
        }
    }
}