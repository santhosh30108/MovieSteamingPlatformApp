package com.santhosh.moviesteamingapp

import android.app.ProgressDialog
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView

class TrailerFragment : Fragment() {
    lateinit var videoView:VideoView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_trailer, container, false)
        videoView = view.findViewById(R.id.videoView)
        var url:String = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4"
        val uri = Uri.parse(url)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(context)
        mediaController.setAnchorView(videoView);
        mediaController.setMediaPlayer(videoView);
        videoView.setMediaController(mediaController);
        videoView.start()
//        var mp = MediaPlayer()
//        mp.setDataSource(url)
//        mp.prepare()
//        mp.start()


        return view
    }


}