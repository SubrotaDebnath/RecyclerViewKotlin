package subrota.shuvro.recyclerviewkotlin.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import subrota.shuvro.recyclerviewkotlin.R
import subrota.shuvro.recyclerviewkotlin.adapter.UserAdapter.ViewHolder
import subrota.shuvro.recyclerviewkotlin.model.UserDataClass

 class UserAdapter(private val users: ArrayList<UserDataClass>, val context: Context): RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItem(user: UserDataClass){
            itemView.findViewById<TextView>(R.id.nameTV).text = user.name
            itemView.findViewById<TextView>(R.id.occupationTV).text = user.occupation
            itemView.setOnClickListener {
                itemView.context.startActivity(Intent(itemView.context, ))
            }
        }
    }
}