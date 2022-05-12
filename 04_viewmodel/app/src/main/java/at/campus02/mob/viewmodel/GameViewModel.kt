package at.campus02.mob.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Question(
    val question: String,
    val correct_answer: String,
    val incorrect_answers: List<String>
) {
    private val randomizedAnswers = (incorrect_answers + correct_answer).shuffled()
    val  answerA = randomizedAnswers[0]
    val  answerB = randomizedAnswers[1]
    val  answerC = randomizedAnswers[2]
    val  answerD = randomizedAnswers[3]
}

private val theQuestion: Question get() = Question(
    question = "How is the weather today?",
    correct_answer = "Sunny",
    incorrect_answers = listOf("Rainy", "Foggy", "Cloudy")
)

class GameViewModel : ViewModel() {
    //intern, veränderbar
    private var questionMutable: MutableLiveData<Question>   = MutableLiveData(theQuestion)
    //von außen sichtbar, aber nicht veränderbar
    val question: LiveData<Question> get() = questionMutable
}