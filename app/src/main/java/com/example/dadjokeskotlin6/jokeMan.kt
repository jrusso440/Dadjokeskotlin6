package com.example.dadjokeskotlin6

object jokeMan {
    public fun getJokes(joke: String?): List<String> {
        val jokes: MutableList<String> = ArrayList()
        when (joke) {
            "What did the zero say to the eight?" -> {
                jokes.add("That belt looks good on you!")
            }

            "Where do you learn to make a banana split?" -> {
                jokes.add("Sundae school")
            }

            "Where do fruits go on vacation?" -> {
                jokes.add("Pear-is!")
            }

            "Why do seagulls fly over the ocean?" -> {
                jokes.add("Because if they flew over the bay, we'd call them bagels.")
            }

            "What do you call a poor Santa Claus?" -> {
                jokes.add("St. Nickel-less")
            }

            "How many tickles does it take to make an octopus laugh?" -> {
                jokes.add("Ten tickles")
            }

            "What concert costs just 45 cents?" -> {
                jokes.add("50 Cent featuring Nickeback!")
            }

            "What country capital is growing the fastest?" -> {
                jokes.add("Ireland.  Every day it's Dublin.")
            }
            "Why was Cinderella so bad at soccer?" -> {
                jokes.add("She kept running away from the ball!")
            }
            "What did the horse say after it tripped?" ->{
                jokes.add("Help! I’ve fallen and I can’t giddyup!")
            }

            "What do you call a well-balanced horse?" -> {
                jokes.add("Stable")
            }
            "What do you call an angry carrot?" -> {
                jokes.add("A steamed veggie")
            }
            "Where do polar bears keep their money?"->{
                jokes.add("In a snowbank.");
            }

        }
        return jokes
    }
}