package com.kgmyshin.workDictionary.ui.work

import com.kgmyshin.annict.workDictionary.ui.work.SeasonViewModel
import com.kgmyshin.common.random.RandomHelper

object SeasonViewModelFactory {
    fun create(name: String = RandomHelper.randomString(), identifierName: String = RandomHelper.randomString()): SeasonViewModel = SeasonViewModel(name, identifierName)
}
