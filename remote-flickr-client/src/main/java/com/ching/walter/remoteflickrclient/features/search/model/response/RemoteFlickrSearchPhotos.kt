package com.ching.walter.remoteflickrclient.features.search.model.response

import com.google.gson.annotations.SerializedName

data class RemoteFlickrSearchPhotos(

	@field:SerializedName("perpage")
    val perPage: Int? = null,

	@field:SerializedName("total")
    val total: String? = null,

	@field:SerializedName("pages")
    val pages: String? = null,

	@field:SerializedName("photo")
    val photo: List<Photo>? = null,

	@field:SerializedName("page")
    val page: Int? = null
)
