package dev.blais.paginglistfeed.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import dev.blais.paginglistfeed.R

class PageListFragment : Fragment() {

    companion object {
        fun newInstance() = PageListFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.message)
        textView.text = viewModel.placeholderText

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        /* TODO: Use the ViewModel */
    }

}