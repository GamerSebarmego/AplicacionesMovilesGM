package pe.edu.barcomego.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.barcomego.R
import pe.edu.barcomego.databinding.FragmentFavoriteBinding
import pe.edu.barcomego.model.getDataFavorite

class FavoriteFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvProductfavorite.adapter = RvPersonFavoriteAdapter(getDataFavorite())
        binding.rvProductfavorite.layoutManager = GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
    }
}