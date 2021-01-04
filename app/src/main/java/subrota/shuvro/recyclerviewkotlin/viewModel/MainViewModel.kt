package subrota.shuvro.recyclerviewkotlin.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import subrota.shuvro.recyclerviewkotlin.model.UserDataClass

class MainViewModel(application: Application) : AndroidViewModel(application) {
    fun getUser() = listOf(
            UserDataClass("Bidyut Debnath", "Developer"),
            UserDataClass("Saikat Roy", "Developer"),
            UserDataClass("Sumon Debnath", "Engineer"),
            UserDataClass("Tufayel Ahamed", "Pro Gamer"),
            UserDataClass("Subrota Debnath", "Bekar"),
    )

    val dataSets: List<UserDataClass> =getUser()
}