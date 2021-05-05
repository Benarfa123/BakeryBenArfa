package io.eskills.benarfaboulangerie

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import io.eskills.benarfaboulangerie.controller.ViewPagerAdapter
import io.eskills.benarfaboulangerie.fragments.SaltyFragment
import io.eskills.benarfaboulangerie.fragments.SugarFragment

class MainActivity : AppCompatActivity() {
    var mainViewPager: ViewPager? = null
    var salt: TextView? = null
    var sugar: TextView? = null
    private var adapter: ViewPagerAdapter? = null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ViewPagerAdapter(supportFragmentManager)
        adapter?.addFragment(SaltyFragment(), " One ")
        adapter?.addFragment(SugarFragment(), " Two ")
        mainViewPager = findViewById(R.id.viewpager)
        sugar = findViewById(R.id.sugar)
        salt = findViewById(R.id.salt)
        salt?.background?.setTint(
            resources!!.getColor(
                R.color.purple_200,
                this@MainActivity.theme
            )
        )
        salt?.setTextColor(
            resources!!.getColor(
                R.color.white,
                this@MainActivity.theme
            )
        )
        sugar?.background?.setTint(
            resources!!.getColor(
                R.color.gray,
                this@MainActivity.theme
            )
        )
        sugar?.setTextColor(
            resources!!.getColor(
                R.color.black,
                this@MainActivity.theme
            )
        )
        mainViewPager?.adapter = adapter
        salt?.setOnClickListener(View.OnClickListener {
            mainViewPager?.currentItem = 0
            salt?.background?.setTint(
                resources!!.getColor(
                    R.color.purple_200,
                    this@MainActivity.theme
                )
            )
            salt?.setTextColor(
                resources!!.getColor(
                    R.color.white,
                    this@MainActivity.theme
                )
            )
            sugar?.background?.setTint(
                resources!!.getColor(
                    R.color.gray,
                    this@MainActivity.theme
                )
            )
            sugar?.setTextColor(
                resources!!.getColor(
                    R.color.black,
                    this@MainActivity.theme
                )
            )
        })
        sugar?.setOnClickListener(View.OnClickListener {
            mainViewPager?.currentItem = 1
            salt?.background?.setTint(
                resources!!.getColor(
                    R.color.gray,
                    this@MainActivity.theme
                )
            )
            salt?.setTextColor(
                resources!!.getColor(
                    R.color.black,
                    this@MainActivity.theme
                )
            )
            sugar?.background?.setTint(
                resources!!.getColor(
                    R.color.purple_200,
                    this@MainActivity.theme
                )
            )
            sugar?.setTextColor(
                resources!!.getColor(
                    R.color.white,
                    this@MainActivity.theme
                )
            )
        })
        mainViewPager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
            }

            @RequiresApi(Build.VERSION_CODES.M)
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        salt?.background?.setTint(
                            resources!!.getColor(
                                R.color.purple_200,
                                this@MainActivity.theme
                            )
                        )
                        salt?.setTextColor(
                            resources!!.getColor(
                                R.color.white,
                                this@MainActivity.theme
                            )
                        )
                        sugar?.background?.setTint(
                            resources!!.getColor(
                                R.color.gray,
                                this@MainActivity.theme
                            )
                        )
                        sugar?.setTextColor(
                            resources!!.getColor(
                                R.color.black,
                                this@MainActivity.theme
                            )
                        )
                    }
                    1 -> {
                        salt?.background?.setTint(
                            resources!!.getColor(
                                R.color.gray,
                                this@MainActivity.theme
                            )
                        )
                        salt?.setTextColor(
                            resources!!.getColor(
                                R.color.black,
                                this@MainActivity.theme
                            )
                        )
                        sugar?.background?.setTint(
                            resources!!.getColor(
                                R.color.purple_200,
                                this@MainActivity.theme
                            )
                        )
                        sugar?.setTextColor(
                            resources!!.getColor(
                                R.color.white,
                                this@MainActivity.theme
                            )
                        )
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }
}