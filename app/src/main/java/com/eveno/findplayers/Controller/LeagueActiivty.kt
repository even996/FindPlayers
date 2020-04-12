package com.eveno.findplayers.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.eveno.findplayers.Utillites.EXTRA_LEAGUE
import com.eveno.findplayers.R
import com.eveno.findplayers.Utillites.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_league_actiivty.*

class LeagueActiivty : BaseActivity() {

    var selectedLeague = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_actiivty)
    }

    fun onMensClicked(view: View){
        womensLeagueButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        selectedLeague = "co-ed"
    }


    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){
            val skill = Intent(this, SkillActivity::class.java)
            skill.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skill)
        }else{
            Toast.makeText(this, "You need to choose between the above", Toast.LENGTH_SHORT).show()
        }

    }


}
