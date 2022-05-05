package com.example.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel(){

    val questionText: LiveData<String> = MutableLiveData("Wann ist die Befreinungsfeier")
}