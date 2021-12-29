package com.example.android.guesstheword.screens.game

import android.os.CountDownTimer
import android.text.format.DateUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){

    // The current word
    private val _word = MutableLiveData<String>()
    val word:LiveData<String> = _word

    // The current score
    private val _score = MutableLiveData<Int>()
    val score:LiveData<Int> = _score

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    private val _eventGameFinished = MutableLiveData<Boolean>()
    val eventGameFinished:LiveData<Boolean> = _eventGameFinished

    //timer text
    private val _timer = MutableLiveData<String>()
    val timerX:LiveData<String> = _timer

    private val timer:CountDownTimer

    init{
        Log.i("GameViewModel", "GameViewModel created!")
        resetList()
        nextWord()
        _score.value = 0
        _word.value = ""
        _timer.value = "00:00"
        _eventGameFinished.value = false

        timer = object : CountDownTimer(COUNTDOWN_TIMER, ONE_SECOND){
            override fun onTick(millisUntilFinished: Long) {
                _timer.value = DateUtils.formatElapsedTime(millisUntilFinished)
            }

            override fun onFinish() {
               _eventGameFinished.value = true
            }
        }
    }

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            resetList()
            //_eventGameFinished.value = true
        }
        _word.value = wordList.removeAt(0)

    }

    fun onSkip() {
        _score.value = _score.value?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        _score.value = _score.value?.plus(1)
        nextWord()
    }

    fun onGameFinishedComplete(){
       _eventGameFinished.value = false
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }



    companion object {

        private const val DONE = 0L
        private const val ONE_SECOND = 1000L
        private const val COUNTDOWN_TIMER = 60000L

    }


}