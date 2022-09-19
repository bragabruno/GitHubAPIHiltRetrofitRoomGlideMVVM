package com.example.githubapihiltretrofitroomglidemvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubapihiltretrofitroomglidemvvm.network.RecyclerData
import com.example.githubapihiltretrofitroomglidemvvm.network.RetroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: RetroRepository) : ViewModel() {
    lateinit var liveDataList: MutableLiveData<List<RecyclerData>>
    init {
        liveDataList = MutableLiveData()
    }

    fun getListDataObserver(): MutableLiveData<List<RecyclerData>> {
        return liveDataList
    }

    fun loadListOfData() {
        repository.makeApiCall("ny", liveDataList)
    }
}
