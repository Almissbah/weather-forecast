package com.almissbah.weather.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.almissbah.weather.R
import com.almissbah.weather.ui.base.WeatherForecastFragment

class SplashFragment : WeatherForecastFragment() {

    private lateinit var splashViewModel: SplashViewModel
    override fun initViewModel() {
        TODO("Not yet implemented")
    }

    override fun initViews() {
        TODO("Not yet implemented")
    }

    override fun subscribe() {
        TODO("Not yet implemented")
    }

    override fun unSubscribe() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        splashViewModel =
            ViewModelProviders.of(this).get(SplashViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_splash, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        splashViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
