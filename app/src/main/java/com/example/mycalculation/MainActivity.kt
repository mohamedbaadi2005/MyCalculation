package com.example.mycalculation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mycalculation.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var res = ""
        binding.num01.setOnClickListener {
            binding.Result.append(binding.num01.text)
            res += binding.num01.text
        }
        binding.num02.setOnClickListener {
            binding.Result.append(binding.num02.text)
            res += binding.num02.text
        }
        binding.num03.setOnClickListener {
            binding.Result.append(binding.num03.text)
            res += binding.num03.text
        }
        binding.num04.setOnClickListener {
            binding.Result.append(binding.num04.text)
            res += binding.num04.text
        }
        binding.num05.setOnClickListener {
            binding.Result.append(binding.num05.text)
            res += binding.num05.text
        }
        binding.num06.setOnClickListener {
            binding.Result.append(binding.num06.text)
            res += binding.num06.text
        }
        binding.num07.setOnClickListener {
            binding.Result.append(binding.num07.text)
            res += binding.num07.text
        }
        binding.num08.setOnClickListener {
            binding.Result.append(binding.num08.text)
            res += binding.num08.text
        }
        binding.num09.setOnClickListener {
            binding.Result.append(binding.num09.text)
            res += binding.num09.text
        }
        binding.num0.setOnClickListener {
            binding.Result.append(binding.num0.text)
            res += binding.num0.text
        }
        binding.Plus.setOnClickListener {
            binding.Result.append(binding.Plus.text)
            res += binding.Plus.text
        }
        binding.Minus.setOnClickListener {
            binding.Result.append( binding.Minus.text)
            res += binding.Minus.text
        }
        binding.Times.setOnClickListener {
            binding.Result.append(binding.Times.text)
            res += binding.Times.text
        }
        binding.Devide.setOnClickListener {
            binding.Result.append(binding.Devide.text)
            res += binding.Devide.text
        }
        binding.Remove.setOnClickListener {
//            binding.Result.text.toString().removeSuffix(binding.Result.text[-1].toString())
            binding.Remove.setOnClickListener {
                if (res.isNotEmpty()) {
                    res = res.dropLast(1)
                    binding.Result.text = res
                }
            }
        }
        binding.Cbtn.setOnClickListener {
            binding.Result.text = ""
            binding.Operation.text = "0"
            res = ""
        }
        binding.Decimal.setOnClickListener { binding.Result.append(".") }
        binding.Equal.setOnClickListener {
            binding.Equal.setOnClickListener {
                try {
                    var res1 = ExpressionBuilder(res).build().evaluate()
                    binding.Operation.text = res1.toString()
                    binding.Result.text = ""
                    res = ""
                } catch (e: Exception) {
                    binding.Operation.text = "Error"
                    res = ""
                }
            }
            var res1 = ExpressionBuilder(res).build().evaluate()
            binding.Operation.text = res1.toString()
            binding.Result.text = ""
            res = ""

        }

    }
}