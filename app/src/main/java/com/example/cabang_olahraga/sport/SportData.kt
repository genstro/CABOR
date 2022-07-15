package com.example.cabang_olahraga.sport

import com.example.cabang_olahraga.R
import com.example.submission2.sport.Sport

object SportData {
    private val sportNames = arrayOf(
        "Soccer",
        "Badminton",
        "Rugby",
        "Volley",
        "Basketball",
        "E-Sport",
        "Athletics",
        "Tennis",
        "Golf",
        "Swimming"
    )

    private val sportDetails = arrayOf(
        "A game played by two teams of eleven players with a round ball that may not be touched with the hands or arms during play except by the goalkeepers. The object of the game is to score goals by kicking or heading the ball into the opponents' goal.",
        "Badminton is a racquet sport played using racquets to hit a shuttlecock across a net. Although it may be played with larger teams, the most common forms of the game are \"singles\" and \"doubles\".",
        "A team game played with an oval ball that may be kicked, carried, and passed from hand to hand. Points are scored by grounding the ball behind the opponents' goal line (thereby scoring a try) or by kicking it between the two posts and over the crossbar of the opponents' goal.",
        "The flight of the ball (as in volleyball or tennis) or its course before striking the ground or a return of the ball before it touches the ground.",
        "Basketball is a team sport in which two teams, most commonly of five players each, opposing one another on a rectangular court, compete with the primary objective of shooting a basketball through the defender's hoop",
        "Esports, short for electronic sports, is a form of competition using video games. Esports often takes the form of organized, multiplayer video game competitions, particularly between professional players, individually or as teams.",
        "Athletics is a group of sporting events that involves competitive running, jumping, throwing, and walking. The most common types of athletics competitions are track and field, road running, cross country running, and racewalking.",
        "Tennis is a racket sport that is played either individually against a single opponent or between two teams of two players each. Each player uses a tennis racket that is strung with cord to strike a hollow rubber ball covered with felt over or around a net and into the opponent's court.",
        "A game played on a large open-air course, in which a small hard ball is struck with a club into a series of small holes in the ground, the object being to use the fewest possible strokes to complete the course.",
        "Swimming is an individual or team racing sport that requires the use of one's entire body to move through water. The sport takes place in pools or open water."
    )

    private val sportImages = intArrayOf(
        R.drawable.soccer_wikipedia,
        R.drawable.badminton_wiki,
        R.drawable.rugby_wikipedia,
        R.drawable.volley_wikipedia,
        R.drawable.basketball_wikipedia,
        R.drawable.esport_wikipedia,
        R.drawable.athletics_wikipedia,
        R.drawable.tennis_wikipedia,
        R.drawable.golf_wikipedia,
        R.drawable.swimming_wikipedia
    )

    val listData : ArrayList<Sport>
    get() {
        val list = arrayListOf<Sport>()
        for(position in sportNames.indices){
            val sport = Sport()
            sport.name = sportNames[position]
            sport.detail = sportDetails[position]
            sport.photo = sportImages[position]
            list.add(sport)
        }
        return list
    }
}