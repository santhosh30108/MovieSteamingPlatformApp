package com.santhosh.moviesteamingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.santhosh.moviesteamingapp.adapters.castadapter
import com.santhosh.moviesteamingapp.adapters.homeadapter
import com.santhosh.moviesteamingapp.model.CastPageModel
import com.santhosh.moviesteamingapp.model.HomeModelClass

class CastFragment : Fragment() {

    var castList = ArrayList<CastPageModel>()
    lateinit var recyclerView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_cast, container, false)
        recyclerView = view.findViewById(R.id.castRecyclerView)

        castList.add(CastPageModel("https://media1.popsugar-assets.com/files/thumbor/msjEO8oq7PWud7pFv_Cm6GR6E-U/0x1:2771x2772/fit-in/500x500/filters:format_auto-!!-:strip_icc-!!-/2020/03/30/878/n/1922398/eb11f12e5e825104ca01c1.02079643_/i/Robert-Downey-Jr.jpg","Robert Downey Jr.","Iron Man"))
        castList.add(CastPageModel("https://flxt.tmsimg.com/assets/74371_v9_bc.jpg","Josh Brolin","Thanos"))
        castList.add(CastPageModel("https://cdn.britannica.com/92/215392-050-96A4BC1D/Australian-actor-Chris-Hemsworth-2019.jpg","Chris Hemsworth","Thor"))
        castList.add(CastPageModel("https://cdn.britannica.com/28/215028-050-94E9EA1E/American-actor-Chris-Evans-2019.jpg","Chris Evans","Captain America"))
        castList.add(CastPageModel("https://theskincareedit.com/.image/c_fit%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_620/MTg1ODIyODY0OTQxNzg2NTE2/scarlett-johansson-american-cinematheque-awards-2021.jpg","Scarlett Johansson","Natasha Romanoff"))
        castList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Tom_Holland_by_Gage_Skidmore.jpg/1200px-Tom_Holland_by_Gage_Skidmore.jpg","Tom Holland","Spider-Man"))
        castList.add(CastPageModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Mark_Ruffalo_%2836201774756%29_%28cropped%29.jpg/1200px-Mark_Ruffalo_%2836201774756%29_%28cropped%29.jpg","Mark Ruffalo","Hulk"))

        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        val adapter = context?.let { castadapter(castList, it) }
        recyclerView.adapter  = adapter

        return view
    }
}