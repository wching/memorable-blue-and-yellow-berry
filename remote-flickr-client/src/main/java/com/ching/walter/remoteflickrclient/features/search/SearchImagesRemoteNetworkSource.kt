package com.ching.walter.remoteflickrclient.features.search

import com.ching.walter.remoteflickrclient.base.FlickrApiController
import com.ching.walter.remoteflickrclient.features.search.model.request.RemoteFlickrSearchParams
import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchResponse
import io.reactivex.Observable
import javax.inject.Inject

class SearchImagesRemoteNetworkSource @Inject constructor(
    private val flickrApiController: FlickrApiController
) : ISearchImagesRemoteNetworkSource {
    override fun search(
        remoteFlickrSearchParams: RemoteFlickrSearchParams
    ): Observable<RemoteFlickrSearchResponse> =
        flickrApiController.search(
            remoteFlickrSearchParams = remoteFlickrSearchParams
        )
}
