package com.example.url

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickBrowse(view:View){
        var url = urlText.text.toString()
        val int= Intent()
        int.setAction(ACTION_VIEW)
        url = "http://"+ url
        int.setData(Uri.parse(url))
       startActivity(int)
    }
}
