package pt.giovannidiluca.worldguide.globalpoints.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.giovannidiluca.worldguide.R

class GlobalPointsFragment : Fragment() {

    companion object {
        fun newInstance() = GlobalPointsFragment()
    }

    private lateinit var viewModel: GlobalPointsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_global_points, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GlobalPointsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}