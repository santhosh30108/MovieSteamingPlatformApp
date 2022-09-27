package com.santhosh.moviesteamingapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DescriptionFragment : Fragment() {
    lateinit var fragmentDescription:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view:View = inflater.inflate(R.layout.fragment_description, container, false)
        fragmentDescription = view.findViewById(R.id.Description)
        fragmentDescription.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at aliquam sem, ac fermentum sapien. In in elementum mi, ac sollicitudin magna. Sed risus quam, aliquet id erat sit amet, luctus hendrerit metus. Proin dictum odio vitae tellus tincidunt tincidunt. Quisque quis ligula vulputate felis tincidunt congue vel sed eros. Morbi in interdum diam. Donec eget euismod ante. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam convallis sit amet nulla ac elementum. Etiam cursus purus lorem, in pretium erat mattis sed. Suspendisse venenatis ut libero nec pharetra. Integer nibh ligula, cursus a quam eget, luctus iaculis felis. Ut lorem urna, tristique a odio sed, tincidunt efficitur lectus. In nec erat in mauris condimentum vulputate. Duis consectetur accumsan ipsum quis tincidunt. Vestibulum viverra, tortor vel imperdiet eleifend, justo nisl facilisis ex, eu pharetra odio tellus ac lacus.\n" +
                "\n" +
                "Maecenas enim quam, bibendum ut erat sit amet, vestibulum tincidunt massa. Maecenas lorem tellus, elementum vitae nibh vitae, mollis congue risus. Praesent venenatis a diam eu pellentesque. Donec nibh nunc, pretium eget nulla quis, sollicitudin vehicula leo. Morbi iaculis interdum ligula, nec commodo dui porttitor et. Proin maximus vulputate ligula ut feugiat. Cras eget sollicitudin est. Fusce lobortis mollis ante eget dignissim. Proin velit tortor, porttitor eu gravida nec, fermentum quis quam. Nam ac lorem sit amet justo faucibus egestas. Etiam dapibus justo eu viverra consequat. Quisque eu enim eget nunc sagittis congue a quis lectus."
        return view
    }


}