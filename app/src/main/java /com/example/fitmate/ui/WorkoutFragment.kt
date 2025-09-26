package com.example.fitmate.ui
import android.os.*
import android.view.*
import androidx.fragment.app.Fragment
import com.example.fitmate.databinding.FragmentWorkoutBinding
class WorkoutFragment:Fragment(){private var _b:FragmentWorkoutBinding?=null;private val b get()=_b!!;override fun onCreateView(i:LayoutInflater,c:ViewGroup?,s:Bundle?):View{_b=FragmentWorkoutBinding.inflate(i,c,false);return b.root}}