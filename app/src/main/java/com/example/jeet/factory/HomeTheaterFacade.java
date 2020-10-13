package com.example.jeet.factory;

//影院的外观
public class HomeTheaterFacade {

    private TheaterLight mTheaterLight;
    private Projector mProjector;
    private Stereo mStereo;
    private Popcorn mPopcorn;
    private DVDPlayer mDVDPlayer;

    public HomeTheaterFacade() {
        mTheaterLight = TheaterLight.getInstance();
        mProjector = Projector.getInstance();
        mStereo = Stereo.getInstance();
        mPopcorn = Popcorn.getInstance();
        mDVDPlayer = DVDPlayer.getInstance();
    }

    //操作分成4步

    public void ready(){
        mPopcorn.on();
        mPopcorn.up();
    }
    public static void main(String[] args) {

    }


}
