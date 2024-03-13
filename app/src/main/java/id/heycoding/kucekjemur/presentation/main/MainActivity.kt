package id.heycoding.kucekjemur.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import id.heycoding.kucekjemur.R
import id.heycoding.kucekjemur.databinding.ActivityMainBinding
import id.heycoding.kucekjemur.presentation.booking.BookingFragment
import id.heycoding.kucekjemur.presentation.chat.ChatFragment
import id.heycoding.kucekjemur.presentation.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private val homeFragment = HomeFragment()
    private val bookingFragment = BookingFragment()
    private val chatFragment = ChatFragment()
    private var activeFragment: Fragment = homeFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        initView()
    }

    private fun initView() {
        setupFragment()
    }

    private fun setupFragment() {
        for (fragment in supportFragmentManager.fragments) {
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }
        supportFragmentManager.beginTransaction().apply {
            add(activityMainBinding.containerMain.id, homeFragment)
            add(activityMainBinding.containerMain.id, bookingFragment)
            add(activityMainBinding.containerMain.id, chatFragment)
            hide(bookingFragment)
            hide(chatFragment)
        }.commit()

        activityMainBinding.bottomNavView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    showFragment(homeFragment)
                    true
                }

                R.id.booking -> {
                    showFragment(bookingFragment)
                    true
                }

                else -> {
                    showFragment(chatFragment)
                    true
                }
            }
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().hide(activeFragment).show(fragment).commit()
        activeFragment = fragment
    }
}