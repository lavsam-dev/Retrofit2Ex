package lavsam.gb.libs.poplibs.retrofit2ex

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.activity_main.*
import lavsam.gb.libs.poplibs.retrofit2ex.Adapter.MyMovieAdapter
import lavsam.gb.libs.poplibs.retrofit2ex.Common.Common
import lavsam.gb.libs.poplibs.retrofit2ex.Interface.RetrofitServices
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movie
import lavsam.gb.libs.poplibs.retrofit2ex.Model.Movies
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var mService: RetrofitServices
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyMovieAdapter
    lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mService = Common.retrofitService
        recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerMovieList.layoutManager = layoutManager
        dialog = SpotsDialog.Builder().setCancelable(true).setContext(this).build()

        getAllMovieList()
    }

    private fun getAllMovieList() {
        dialog.show()
/*        mService.getMovieList().enqueue(object : Callback<MutableList<Movie>> {
            override fun onFailure(call: Call<MutableList<Movie>>, t: Throwable) {

            }

            override fun onResponse(call: Call<MutableList<Movie>>, response: Response<MutableList<Movie>>) {
                adapter = MyMovieAdapter(baseContext, response.body() as MutableList<Movie>)
                adapter.notifyDataSetChanged()
                recyclerMovieList.adapter = adapter

                dialog.dismiss()
            }
        })*/
        mService.getMovieList().enqueue(object : Callback<Movies> {
            override fun onFailure(call: Call<Movies>, t: Throwable) {

            }

            override fun onResponse(call: Call<Movies>, response: Response<Movies>) {
                adapter = MyMovieAdapter(baseContext, response.body() as Movies)
                adapter.notifyDataSetChanged()
                recyclerMovieList.adapter = adapter

                dialog.dismiss()
            }
        })
    }
}