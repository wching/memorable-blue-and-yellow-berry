package com.ching.walter.remoteflickrclient.features.search.model.response

import com.google.gson.annotations.SerializedName

data class Photo(

	@field:SerializedName("owner")
	val owner: String? = null,

	@field:SerializedName("server")
	val server: String? = null,

	@field:SerializedName("ispublic")
	val isPublic: Int? = null,

	@field:SerializedName("isfriend")
	val isFriend: Int? = null,

	@field:SerializedName("farm")
	val farm: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("secret")
	val secret: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("isfamily")
	val isFamily: Int? = null
)
