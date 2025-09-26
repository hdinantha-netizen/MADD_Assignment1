package com.example.fitmate.ui
import android.os.*
import android.view.*
import androidx.fragment.app.Fragment
import com.example.fitmate.databinding.FragmentProgressBinding
class ProgressFragment:Fragment(){private var _b:FragmentProgressBinding?=null;private val b get()=_b!!;override fun onCreateView(i:LayoutInflater,c:ViewGroup?,s:Bundle?):View{_b=FragmentProgressBinding.inflate(i,c,false);return b.root}}