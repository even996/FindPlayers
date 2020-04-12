package com.eveno.findplayers.Controller

import android.content.Intent
import android.os.Bundle
import com.eveno.findplayers.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActiivty::class.java)
            startActivity(leagueIntent)
        }

    }
}
