package pe.edu.barcomego.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import pe.edu.barcomego.R
import pe.edu.barcomego.databinding.ItemPersonfavoriteBinding
import pe.edu.barcomego.model.PersonajesFavorite

class RvPersonFavoriteAdapter(private val personfavorite: List<PersonajesFavorite>): RecyclerView.Adapter<PersonFavoriteVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonFavoriteVH {
        val binding = ItemPersonfavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonFavoriteVH(binding)
    }

    override fun getItemCount(): Int = personfavorite.size

    override fun onBindViewHolder(holder: PersonFavoriteVH, position: Int) {
        holder.bind(personfavorite[position])
    }
}

class PersonFavoriteVH(private val binding: ItemPersonfavoriteBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(personajesFavorite: PersonajesFavorite) {
        binding.txtNamefavorite.text = personajesFavorite.name
        binding.txtStatus.text = personajesFavorite.status
        binding.txtEspeciesfavorite.text = personajesFavorite.species
        binding.txtTypefavorite.text = personajesFavorite.type
        binding.txtGenderfavorite.text = personajesFavorite.gender
        binding.txtOriginfavorite.text = personajesFavorite.origin.name
        binding.txtLocationfavorite.text = personajesFavorite.location.name
        if (personajesFavorite.image.isNotEmpty()) {
            binding.imgImagefavorite.load(personajesFavorite.image)
        } else {
            binding.imgImagefavorite.setImageResource(R.drawable.image2)
        }
    }
}