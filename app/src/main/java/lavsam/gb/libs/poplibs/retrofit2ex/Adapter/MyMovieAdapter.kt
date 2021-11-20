package lavsam.gb.libs.poplibs.retrofit2ex.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout.view.*
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movie
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movies
import lavsam.gb.libs.poplibs.retrofit2ex.R

class MyMovieAdapter(private val context: Context, private val movies: Movies):
    RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {

    val movieList = movies.results as List<Movie>

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.image_movie
        val txt_name: TextView = itemView.txt_name
        val txt_team: TextView = itemView.txt_team
        val txt_createdby: TextView = itemView.txt_createdby

        fun bind(listItem: Movie) {
            image.setOnClickListener {
                Toast.makeText(it.context, "нажал на ${itemView.image_movie}", Toast.LENGTH_SHORT)
                    .show()
            }
            itemView.setOnClickListener {
                Toast.makeText(it.context, "нажал на ${itemView.txt_name.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listItem = movieList[position]
        holder.bind(listItem)
//        val url = listItem.imageurl
//        val urlHabr = "https://www.simplifiedcoding.net/demos/marvel/ironman.jpg"
//        val urlGithab = "https://avatars.githubusercontent.com/u/2?v=4"
//        val urlPokemon = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png"
        val urlPokemon = listItem.getImageUrl()
        Picasso.get()
            .load(urlPokemon)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.image)
        holder.txt_name.text = listItem.name
        holder.txt_team.text = listItem.name
        holder.txt_createdby.text = listItem.name
    }

}