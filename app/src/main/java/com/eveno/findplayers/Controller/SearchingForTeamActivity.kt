package com.eveno.findplayers.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eveno.findplayers.Model.Player
import com.eveno.findplayers.R
import com.eveno.findplayers.Utillites.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_searching_for_team.*

class SearchingForTeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_for_team)
        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)



        searchLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you"
    }
}
