package com.nadiaputri.dashboardsaya.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SkillViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "8 portofolio have been completed"
    }
    val text: LiveData<String> = _text
}