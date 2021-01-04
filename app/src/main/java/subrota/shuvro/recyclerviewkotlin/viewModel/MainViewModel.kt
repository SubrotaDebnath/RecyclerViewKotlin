package subrota.shuvro.recyclerviewkotlin.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import subrota.shuvro.recyclerviewkotlin.model.UserDataClass

class MainViewModel : ViewModel() {
    private fun getUser() = arrayListOf<UserDataClass>(
            UserDataClass("Bidyut Debnath", "Developer"),
            UserDataClass("Saikat Roy", "Developer"),
            UserDataClass("Sumon Debnath", "Engineer"),
            UserDataClass("Tufayel Ahamed", "Pro Gamer"),
            UserDataClass("Subrota Debnath", "Bekar"),
            UserDataClass("Nihal Khan", "Premer Pro"),
        UserDataClass("Bidyut Debnath", "Developer"),
        UserDataClass("Saikat Roy", "Developer"),
        UserDataClass("Sumon Debnath", "Engineer"),
        UserDataClass("Tufayel Ahamed", "Pro Gamer"),
        UserDataClass("Subrota Debnath", "Bekar"),
        UserDataClass("Nihal Khan", "Premer Pro"),
        UserDataClass("Bidyut Debnath", "Developer"),
        UserDataClass("Saikat Roy", "Developer"),
        UserDataClass("Sumon Debnath", "Engineer"),
        UserDataClass("Tufayel Ahamed", "Pro Gamer"),
        UserDataClass("Subrota Debnath", "Bekar"),
        UserDataClass("Nihal Khan", "Premer Pro"),
        UserDataClass("Bidyut Debnath", "Developer"),
        UserDataClass("Saikat Roy", "Developer"),
        UserDataClass("Sumon Debnath", "Engineer"),
        UserDataClass("Tufayel Ahamed", "Pro Gamer"),
        UserDataClass("Subrota Debnath", "Bekar"),
        UserDataClass("Nihal Khan", "Premer Pro"),
    )

    val dataSets: ArrayList<UserDataClass> =getUser()

}