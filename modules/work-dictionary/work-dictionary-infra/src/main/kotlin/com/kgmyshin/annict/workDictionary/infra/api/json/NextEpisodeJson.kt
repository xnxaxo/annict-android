package com.kgmyshin.annict.workDictionary.infra.api.json

import com.google.gson.annotations.SerializedName

data class NextEpisodeJson(
        @SerializedName("id") val id: String,
        @SerializedName("number") val number: Int,
        @SerializedName("number_text") val numberText: String,
        @SerializedName("sort_number") val sortNumber: Int,
        @SerializedName("title") val title: String,
        @SerializedName("records_count") val recordsCount: Int,
        @SerializedName("record_comments_count") val recordCommentsCount: Int
)