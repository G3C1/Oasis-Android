package com.g3c1.oasis_android.remote.api

import com.g3c1.oasis_android.feature_menu.data.dto.OrderedTableInfoDTO
import com.g3c1.oasis_android.feature_receipt.data.dto.RemoteOrderInfoDTO
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PurchaseApi {

    @POST("v1/purchase/")
    suspend fun sendsTheOrderedFoodListToTheServer(@Body body: OrderedTableInfoDTO): Response<Unit>

    @GET("v2/purchase/")
    suspend fun getMyOrderInfo(
        @Query("seatId") seatId: Long,
        @Query("serialNumber") serialNumber: Long
    ): Response<RemoteOrderInfoDTO>


}