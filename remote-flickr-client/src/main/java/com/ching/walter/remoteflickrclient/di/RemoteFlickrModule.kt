package com.ching.walter.remoteflickrclient.di

import com.ching.walter.remoteflickrclient.IFlickrApiService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named

@SuppressWarnings("Unused")
@Module
abstract class RemoteFlickrModule {

    companion object {

        private const val FLICKR_API_BASE_URL = "https://www.flickr.com/services/rest/"
        private const val FLICKR_OK_HTTP = "FLICKR_OK_HTTP"

        @Reusable
        @Provides
        fun provideFlickrApiService(
            @Named(value = FLICKR_OK_HTTP) okHttpClient: OkHttpClient,
            gson: Gson
        ): IFlickrApiService =
            Retrofit.Builder().baseUrl(FLICKR_API_BASE_URL)
                .addConverterFactory(
                    GsonConverterFactory.create(gson)
                )
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.createWithScheduler(
                        Schedulers.io()
                    )
                )
                .client(okHttpClient)
                .build()
                .create(IFlickrApiService::class.java)

        @Reusable
        @Provides
        @Named(FLICKR_OK_HTTP)
        fun provideOkHttp(): OkHttpClient = OkHttpClient.Builder()
            .callTimeout(timeout = 30L, unit = TimeUnit.SECONDS)
            .addInterceptor(
                interceptor = HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()

        @Reusable
        @Provides
        fun provideGson(): Gson = Gson()
    }
}
