package org.martikhora.kotlincourse.lesson20.homework

import java.io.InputStream

interface SoundEmitting {

    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)

}