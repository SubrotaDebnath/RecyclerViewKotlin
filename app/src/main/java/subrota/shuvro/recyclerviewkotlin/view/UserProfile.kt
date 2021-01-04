package subrota.shuvro.recyclerviewkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import subrota.shuvro.recyclerviewkotlin.R

class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        if (intent.extras !=null){
            val name: String? =intent.getStringExtra("name")
            val occupation:String? =intent.getStringExtra("occupation")

            findViewById<TextView>(R.id.profileName).text=name
            findViewById<TextView>(R.id.profileOccupation).text=occupation
        }
    }
}