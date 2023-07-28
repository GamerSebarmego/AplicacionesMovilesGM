package pe.edu.barcomego.data.retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RtHelper {

    private val retrofitinstance: Retrofit = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val personInstance = retrofitinstance.create(PersonInterface::class.java)
}