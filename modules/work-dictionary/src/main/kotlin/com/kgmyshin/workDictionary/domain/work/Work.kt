package com.kgmyshin.workDictionary.domain.work

import com.kgmyshin.common.dddSupport.Entity
import java.util.*

internal class Work(
        id: WorkId,
        val title: String,
        val titleKana: String,
        val season: Season,
        val releasedOn: Date,
        val officialSiteUrl: String,
        val twitterUserName: String?,
        val imageUrl: String?,
        val episodesCount: Int,
        val watchersCount: Int
) : Entity<WorkId>(id)