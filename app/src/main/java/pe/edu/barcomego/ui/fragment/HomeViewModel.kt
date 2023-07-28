package pe.edu.barcomego.ui.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Response
import pe.edu.barcomego.data.repository.PersonRepository
import pe.edu.barcomego.model.Personajes
import pe.edu.barcomego.model.getData

class HomeViewModel: ViewModel() {
    val person: MutableLiveData<List<Personajes>> = MutableLiveData<List<Personajes>>()
    val repository = PersonRepository()

    fun getPersonas() {
        val allPerson = getData()
        person.value = allPerson
    }

    fun getPersonFromService() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getPerson()
            person.postValue(response)
        }
    }
}