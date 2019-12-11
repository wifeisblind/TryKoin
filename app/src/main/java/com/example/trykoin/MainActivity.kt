package com.example.trykoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trykoin.apage.AFragment
import com.example.trykoin.bpage.BFragment
import com.example.trykoin.cpage.CFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator.setOnNavigationItemSelectedListener {
            val transaction = supportFragmentManager.beginTransaction()
            when (it.itemId) {
                R.id.a -> transaction.replace(R.id.container,
                    AFragment(), null).commit()
                R.id.b -> transaction.replace(R.id.container,
                    BFragment(), null).commit()
                R.id.c -> transaction.replace(R.id.container,
                    CFragment(), null).commit()
            }

            return@setOnNavigationItemSelectedListener true
        }
        navigator.selectedItemId = R.id.a
    }


}
