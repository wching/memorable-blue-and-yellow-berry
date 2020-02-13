package com.ching.walter.remoteflickrclient

import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface IFlickrApiService {

    @GET
    fun searchImages(
        @Query(value = "api_key") apiKey: String,
        @Query(value = "format") format: String,
        @Query(value = "method") method: String,
        @Query(value = "nojsoncallback") noJsonCallback: String,
        @Query(value = "text") search: String
    ): Observable<RemoteFlickrSearchResponse>
}
