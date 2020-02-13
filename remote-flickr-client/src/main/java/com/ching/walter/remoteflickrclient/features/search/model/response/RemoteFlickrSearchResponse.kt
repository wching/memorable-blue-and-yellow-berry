package com.ching.walter.remoteflickrclient.features.search.model.response

import com.google.gson.annotations.SerializedName

data class RemoteFlickrSearchResponse(

    @field:SerializedName("stat")
    val stat: String? = null,

    @field:SerializedName("photos")
    val photos: RemoteFlickrSearchPhotos? = null
)
