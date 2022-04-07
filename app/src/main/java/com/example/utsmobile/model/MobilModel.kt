package com.example.utsmobile.model

import androidx.annotation.DrawableRes

data class MobilModel(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val tahunProduksi: String,
)