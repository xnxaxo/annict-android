package com.kgmyshin.workDictionary.ui.work.detail

import com.kgmyshin.annict.workDictionary.ui.work.WorkBindingModel
import com.kgmyshin.annict.workDictionary.ui.work.detail.EpisodeViewModel
import com.kgmyshin.annict.workDictionary.ui.work.detail.WorkDetailViewModel

object WorkDetailViewModelFactory {
    fun create(workBindingModel: WorkBindingModel = com.kgmyshin.workDictionary.ui.work.WorkViewModelFactory.create(), episodeViewModelList: List<EpisodeViewModel> = listOf(com.kgmyshin.workDictionary.ui.work.detail.EpisodeViewModelFactory.create(), com.kgmyshin.workDictionary.ui.work.detail.EpisodeViewModelFactory.create(), com.kgmyshin.workDictionary.ui.work.detail.EpisodeViewModelFactory.create())): WorkDetailViewModel = WorkDetailViewModel(workBindingModel, episodeViewModelList)
}
