package com.example.trackbobcat.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.trackbobcat.Fragment1

class PageViewModel : ViewModel()   {

    private val _index = MutableLiveData<Int>()
    val viewModelRoutesFragment1: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}