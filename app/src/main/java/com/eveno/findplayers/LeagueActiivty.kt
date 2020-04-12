package com.eveno.findplayers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActiivty : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_actiivty)
    }


    fun leagueNextClicked(view: View){
        val skill = Intent(this, SkillActivity::class.java)
        startActivity(skill)
    }
}
