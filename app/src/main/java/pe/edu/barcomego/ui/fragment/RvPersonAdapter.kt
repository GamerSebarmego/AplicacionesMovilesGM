package pe.edu.barcomego.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import pe.edu.barcomego.R
import pe.edu.barcomego.databinding.ItemPersonBinding
import pe.edu.barcomego.model.Personajes

class RvPersonAdapter(var person: List<Personajes>): RecyclerView.Adapter<PersonVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonVH {
        val binding = ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonVH(binding)
    }

    override fun getItemCount() = person.size

    override fun onBindViewHolder(holder: PersonVH, position: Int) {
        holder.bind(person[position])
    }
}

class PersonVH(private val binding: ItemPersonBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(personajes: Personajes) {
        binding.txtName.text = personajes.name
        binding.txtSpecies.text = personajes.species
        binding.txtStatus.text= personajes.status
        if (personajes.image.isNotEmpty()) {
            binding.imgImage.load(personajes.image)
        } else {
            binding.imgImage.setImageResource(R.drawable.image2)
        }
    }

}