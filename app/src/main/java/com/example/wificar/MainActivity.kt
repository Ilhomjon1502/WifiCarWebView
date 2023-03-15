package com.example.wificar

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.wificar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val url = "http://192.168.4.1/"
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.myWebView.loadUrl(url)
        binding.myWebView.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        binding.myWebView.settings.javaScriptEnabled = true
        binding.myWebView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                //      view?.loadUrl("")
//                Toast.makeText(this@MainActivity, "doing", Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
//                progress_bar.visibility = View.VISIBLE
//                Toast.makeText(this@MainActivity, "Start", Toast.LENGTH_SHORT).show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
//                progress_bar.visibility = View.INVISIBLE
//                Toast.makeText(this@MainActivity, "End", Toast.LENGTH_SHORT).show()
            }


    }
    }
}