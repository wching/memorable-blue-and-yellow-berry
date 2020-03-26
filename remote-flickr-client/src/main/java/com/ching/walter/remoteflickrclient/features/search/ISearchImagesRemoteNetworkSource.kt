package com.ching.walter.remoteflickrclient.features.search

import com.ching.walter.remoteflickrclient.features.search.model.request.RemoteFlickrSearchParams
import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchResponse
import io.reactivex.Observable

interface ISearchImagesRemoteNetworkSource {
    fun search(
        remoteFlickrSearchParams: RemoteFlickrSearchParams
    ): Observable<RemoteFlickrSearchResponse>
}
