package com.santhosh.moviesteamingapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class fragmentsAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {

    var fragmentArrayList = ArrayList<Fragment>()
    var fragmentTitle = ArrayList<String>()
    override fun getCount(): Int {
        return fragmentArrayList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentArrayList[position]
    }

    fun addFragment( fragment:Fragment,title:String){
        fragmentArrayList.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle[position]
    }

}