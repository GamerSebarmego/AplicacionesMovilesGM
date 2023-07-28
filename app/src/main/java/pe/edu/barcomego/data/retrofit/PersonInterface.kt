package pe.edu.barcomego.data.retrofit

import pe.edu.barcomego.data.response.PersonListResponsive
import retrofit2.http.GET

interface PersonInterface {

    @GET("api/character")
    suspend fun getAllPerson(): PersonListResponsive
}