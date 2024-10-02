package com.example.tvandroidprofe

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView

class MainActivity : AppCompatActivity() {
    private lateinit var player: ExoPlayer
    private lateinit var playerView: PlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)
        val boton3 = findViewById<Button>(R.id.boton3)
        val boton4 = findViewById<Button>(R.id.boton4)
        playerView = findViewById(R.id.playerView)

        // Initialize ExoPlayer
        player = ExoPlayer.Builder(this).build()

        // Set the player to PlayerView
        playerView.player = player
        boton1.setOnClickListener {
            // URL of the m3u8 file
            val videoUrl = "https://channel01-onlymex.akamaized.net/hls/live/2022749/event01/index.m3u8"

            // Create a MediaItem with the m3u8 file
            val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))

            // Set the media item to the player
            player.setMediaItem(mediaItem)

            // Prepare the player
            player.prepare()

            // Play automatically when ready
            player.playWhenReady = true
        }
        boton2.setOnClickListener {
            // URL of the m3u8 file
            val videoUrl = "https://mdstrm.com/live-stream-playlist/60b578b060947317de7b57ac.m3u8"

            // Create a MediaItem with the m3u8 file
            val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))

            // Set the media item to the player
            player.setMediaItem(mediaItem)

            // Prepare the player
            player.prepare()

            // Play automatically when ready
            player.playWhenReady = true
        }

boton3.setOnClickListener {
    // URL of the m3u8 file
    val videoUrl = "https://mdstrm.com/live-stream-playlist/609ad46a7a441137107d7a81.m3u8"

    // Create a MediaItem with the m3u8 file
    val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))

    // Set the media item to the player
    player.setMediaItem(mediaItem)

    // Prepare the player
    player.prepare()

    // Play automatically when ready
    player.playWhenReady = true
}
        boton4.setOnClickListener {
            // URL of the m3u8 file
            val videoUrl = "https://d2vnbkvjbims7j.cloudfront.net/containerA/LTN/playlist.m3u8"

            // Create a MediaItem with the m3u8 file
            val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))

            // Set the media item to the player
            player.setMediaItem(mediaItem)

            // Prepare the player
            player.prepare()

            // Play automatically when ready
            player.playWhenReady = true
        }

        // URL of the m3u8 file
        val videoUrl = "https://channel01-onlymex.akamaized.net/hls/live/2022749/event01/index.m3u8"

        // Create a MediaItem with the m3u8 file
        val mediaItem = MediaItem.fromUri(Uri.parse(videoUrl))

        // Set the media item to the player
        player.setMediaItem(mediaItem)

        // Prepare the player
        player.prepare()

        // Play automatically when ready
        player.playWhenReady = true
    }

    override fun onStop() {
        super.onStop()
        player.release()
    }
}