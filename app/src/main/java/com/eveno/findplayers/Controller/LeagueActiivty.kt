package com.eveno.findplayers.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.eveno.findplayers.Model.Player
import com.eveno.findplayers.R
import com.eveno.findplayers.Utillites.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league_actiivty.*

class LeagueActiivty : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league_actiivty)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onMensClicked(view: View){
        womensLeagueButton.isChecked = false
        coedButton.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueButton.isChecked = false
        coedButton.isChecked = false
        player.league = "womens"

    }

    fun onCoedClicked(view: View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        player.league = "co-ed"
    }


    fun leagueNextClicked(view: View){
        if(player.league != "" && (mensLeagueButton.isChecked || womensLeagueButton.isChecked || coedButton.isChecked)){
            val skill = Intent(this, SkillActivity::class.java)
            skill.putExtra(EXTRA_PLAYER, player)
            startActivity(skill)
        }else{
            Toast.makeText(this, "You need to choose between the above", Toast.LENGTH_SHORT).show()
        }

    }


}
