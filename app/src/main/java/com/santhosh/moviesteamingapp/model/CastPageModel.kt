package com.santhosh.moviesteamingapp.model

import java.io.Serializable

data class CastPageModel (
    var image: String,
    var name: String,
    var charecter_name: String
    ): Serializable {
}