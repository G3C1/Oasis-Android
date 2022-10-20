package com.g3c1.oasis_android.remote.api

import com.g3c1.oasis_android.feature_seat.data.data_soure.SeatData
import retrofit2.Response
import retrofit2.http.GET

interface SeatApi {

    @GET("/seat")
    suspend fun getSeatData(): Response<SeatData>
}