package com.example.vamsi.echo

/**
 * Created by VAMSI on 24-07-2018.
 */
class CurrentSongHelper {
    var songArtist: String? = null
    var songTitle: String? = null
    var songPath: String? = null
    var songId: Long = 0
    var currentPosition: Int = 0
    var isPlaying: Boolean = false
    var isLoop: Boolean = false
    var isShuffle: Boolean = false
    var trackPosition: Int = 0
}