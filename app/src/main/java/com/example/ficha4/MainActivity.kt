package com.example.ficha4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ficha4.databinding.ActivityMainBinding
/*
import net.objecthunter.exp4j.Expression;
import com.objecthunter.exp4j.ExpressionBuilder;
*/

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart(){
        super.onStart()
        binding.button1.setOnClickListener{
            Log.i(TAG, "Click no botão 1")
            if(binding.textVisor.text == "0"){
                binding.textVisor.text = "1"
            }else{
                binding.textVisor.append("1")
            }
        }
        binding.buttonAdition.setOnClickListener{
            Log.i(TAG, "Click no botão +")
            binding.textVisor.append("+")
        }
        binding.buttonEquals.setOnClickListener{
            Log.i(TAG,"Click no botão =")
            var expression = ExpressionBuilder(
                binding.textVisor.text.toString()
            ).build()
            binding.textVisor.text = expression.evaluate().toString()
            Log.i(TAG, "O resultado é ${binding.textVisor.text}")
        }
    }
}

private val TAG = MainActivity::class.java.simpleName





