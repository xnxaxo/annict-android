package com.kgmyshin.annict.workDictionary.domain.work

import com.kgmyshin.common.dddSupport.Entity

class Work(
        id: WorkId,
        val title: String,
        val titleKana: String,
        val season: Season?,
        val officialSiteUrl: String,
        val twitterUserName: String?,
        val imageUrl: String?,
        val episodesCount: Int,
        val watchersCount: Int
) : Entity<WorkId>(id)