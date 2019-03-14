package com.example.lowe.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womens_toggle_btn.isChecked = false
        coed_toggle_btn.isChecked = false
        selectedLeague = "Men's"
    }

    fun onWomensClicked(view: View){
        mens_toggle_btn.isChecked = false
        coed_toggle_btn.isChecked = false
        selectedLeague = "Women's"
    }

    fun onCoedClicked(view: View){
        womens_toggle_btn.isChecked = false
        mens_toggle_btn.isChecked = false
        selectedLeague = "Co-Ed"
    }

    fun leagueNextClicked(view: View){
        if(mens_toggle_btn.isChecked || womens_toggle_btn.isChecked || coed_toggle_btn.isChecked){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivityIntent)
        }else{
            Toast.makeText(this, "Please Select a League", Toast.LENGTH_SHORT).show()
        }
    }
}
