package com.ching.walter.remoteflickrclient.features.search

import com.ching.walter.remoteflickrclient.base.FlickrApiController
import com.ching.walter.remoteflickrclient.features.search.model.request.RemoteFlickrSearchParams
import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchPhotos
import com.ching.walter.remoteflickrclient.features.search.model.response.RemoteFlickrSearchResponse
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Observable

class SearchImagesRemoteNetworkSourceTest {

    // region Tests

    fun `when searching for the images, then a response is returned`() {
        // given a flickr controller
        val response = RemoteFlickrSearchResponse(
            stat = null,
            photos = RemoteFlickrSearchPhotos()
        )
        val flickrApiController = mock<FlickrApiController>().apply {
            whenever(search(remoteFlickrSearchParams = any())).thenReturn(
                Observable.just(response)
            )
        }

        // and some params
        val remoteFlickrSearchParams = RemoteFlickrSearchParams(
            search = "tiger"
        )

        // and a remote network source
        val searchImagesRemoteNetworkSource = createSearchImagesRemoteNetworkSource(
            flickrApiController = flickrApiController
        )

        // when searching for tiger images
        val searchObserver = searchImagesRemoteNetworkSource.search(
            remoteFlickrSearchParams = remoteFlickrSearchParams
        ).test()

        // then a response is returned
        searchObserver.assertValue(response)
    }

    // endregion

    // region Helper Method

    private fun createSearchImagesRemoteNetworkSource(
        flickrApiController: FlickrApiController = mock()
    ): SearchImagesRemoteNetworkSource = SearchImagesRemoteNetworkSource(
        flickrApiController = flickrApiController
    )

    // endregion
}
