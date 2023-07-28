package pe.edu.barcomego.data.repository

import pe.edu.barcomego.data.retrofit.RtHelper
import pe.edu.barcomego.model.Personajes

class PersonRepository {
    suspend fun getPerson(): List<Personajes> {
        val response = RtHelper.personInstance.getAllPerson()
        return response.results
    }
}