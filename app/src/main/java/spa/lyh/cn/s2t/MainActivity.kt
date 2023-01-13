package spa.lyh.cn.s2t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import spa.lyh.cn.s2t.utils.ContextProvider
import spa.lyh.cn.s2t.utils.Utils

class MainActivity : AppCompatActivity(),OnClickListener {
    lateinit var tv:TextView
    lateinit var et:EditText
    lateinit var fan:Button
    lateinit var jian:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        et = findViewById(R.id.et)
        fan = findViewById(R.id.fan)
        fan.setOnClickListener(this)
        jian = findViewById(R.id.jian)
        jian.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.fan -> tv.setText(Utils.S2T(et.text.toString()))
            R.id.jian -> tv.setText(Utils.T2S(et.text.toString()))
        }
    }
}