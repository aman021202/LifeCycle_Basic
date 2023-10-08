package com.example.fragment

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.viewpager2.widget.ViewPager2.Orientation

class observer: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("Main", "Observer - ON CREATE")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d("MAIN", "OBSERVER - ON RESUME")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d("MAIN", "OBSERVER - ON PAUSE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d("MAIN", "OBSERVER - ON STOP")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d("MAIN","OBSERVER - ON DESTROY")
    }
}