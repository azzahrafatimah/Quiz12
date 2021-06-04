package com.fatimah.quiz12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_second, container, false)
        val context = activity as AppCompatActivity
        val btnNavigate: Button = v.findViewById(R.id.btnNavigate)
        btnNavigate.setOnClickListener {
            context.replaceFragment(FirstFragment())
        }
        return v
    }
    fun AppCompatActivity.replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.host,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
