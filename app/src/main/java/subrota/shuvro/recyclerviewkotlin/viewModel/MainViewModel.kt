package subrota.shuvro.recyclerviewkotlin.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import subrota.shuvro.recyclerviewkotlin.model.UserDataClass

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private fun getUser() = arrayListOf<UserDataClass>(
            UserDataClass("Bidyut Debnath", "Developer"),
            UserDataClass("Saikat Roy", "Developer"),
            UserDataClass("Sumon Debnath", "Engineer"),
            UserDataClass("Tufayel Ahamed", "Pro Gamer"),
            UserDataClass("Subrota Debnath", "Bekar"),
    )

    val dataSets: ArrayList<UserDataClass> =getUser()

}