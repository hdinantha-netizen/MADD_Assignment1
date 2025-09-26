package com.example.fitmate.ui
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fitmate.adapters.MenuAdapter
import com.example.fitmate.databinding.FragmentHomeBinding
import com.example.fitmate.models.MenuItem

class HomeFragment: Fragment() {
    private var _b: FragmentHomeBinding?=null
    private val b get()=_b!!
    override fun onCreateView(i:LayoutInflater,c:ViewGroup?,s:Bundle?):View{
        _b=FragmentHomeBinding.inflate(i,c,false)
        return b.root
    }
    override fun onViewCreated(v:View,s:Bundle?){
        val items=listOf(
            MenuItem("Workouts","5 & 10 min sessions"),
            MenuItem("Meal Plans","Weekly tips"),
            MenuItem("Goals","Set & track goals"),
            MenuItem("Progress","Badges & streaks"),
            MenuItem("Settings","Profile & App")
        )
        b.recycler.layoutManager=GridLayoutManager(requireContext(),2)
        b.recycler.adapter=MenuAdapter(items){}
        b.welcome.text="Hello, User!"
    }
    override fun onDestroyView(){super.onDestroyView();_b=null}
}