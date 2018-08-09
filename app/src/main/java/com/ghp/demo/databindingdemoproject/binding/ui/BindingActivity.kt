package com.ghp.demo.databindingdemoproject.binding.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ghp.demo.databindingdemoproject.R
import com.ghp.demo.databindingdemoproject.databinding.ActivityMainBinding
import com.ghp.demo.databindingdemoproject.extension.addClickAction
import com.ghp.demo.databindingdemoproject.extension.routeToActivity

class BindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.observableFieldsActivityButton.addClickAction {
            routeToActivity(ObservableFieldActivity::class.java)
        }

        binding.viewmodelActivityButton.addClickAction {
            routeToActivity(ViewModelActivity::class.java)
        }

        binding.recyclerViewActivityButton.addClickAction {
            routeToActivity(RecyclerViewActivity::class.java)
        }
    }
}