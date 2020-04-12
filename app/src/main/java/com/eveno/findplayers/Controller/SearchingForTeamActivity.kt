package com.eveno.findplayers.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eveno.findplayers.R
import com.eveno.findplayers.Utillites.EXTRA_LEAGUE
import com.eveno.findplayers.Utillites.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_searching_for_team.*

class SearchingForTeamActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_for_team)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Looking for $league $skill league near you"
    }
}
