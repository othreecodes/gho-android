package com.ng.gho.base


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ng.gho.R

/**
 * A simple [Fragment] subclass.
 */
class BaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return activity?.let {
            TextView(it).apply {
                setText(R.string.hello_blank_fragment)
            }
        }
    }


}
