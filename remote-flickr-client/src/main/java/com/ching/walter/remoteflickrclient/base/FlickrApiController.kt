package com.ching.walter.remoteflickrclient.base

import com.ching.walter.remoteflickrclient.IFlickrApiService
import com.ching.walter.remoteflickrclient.base.RemoteFlickrConstants.API_KEY
import com.ching.walter.remoteflickrclient.base.RemoteFlickrConstants.JSON_CALLBACK
import com.ching.walter.remoteflickrclient.base.RemoteFlickrConstants.RESPONSE_FORMAT
import com.ching.walter.remoteflickrclient.base.RemoteFlickrConstants.SEARCH_METHOD
import com.ching.walter.remoteflickrclient.features.search.model.request.RemoteFlickrSearchParams
import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchResponse
import io.reactivex.Observable
import javax.inject.Inject

class FlickrApiController @Inject constructor(
    private val flickrApiService: IFlickrApiService
) {
    fun search(
        remoteFlickrSearchParams: RemoteFlickrSearchParams
    ): Observable<RemoteFlickrSearchResponse> =
        with(remoteFlickrSearchParams) {
            flickrApiService.search(
                apiKey = API_KEY,
                format = RESPONSE_FORMAT,
                method = SEARCH_METHOD,
                noJsonCallback = JSON_CALLBACK,
                search = search
            )
        }
}
