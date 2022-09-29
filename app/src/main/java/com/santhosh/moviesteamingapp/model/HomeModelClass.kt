package com.santhosh.moviesteamingapp.model

data class HomeModelClass(
     var language: String,
     var runtime: String,
     var image: String,
     var name: String,
     var year: String,
     var genre:String,
     var description:String,
     var castList : ArrayList<CastPageModel>,
     var imageFrag1:String,
     var imageFrag2: String,
     var trailerList :ArrayList<TrailerPageModel>
) {

}