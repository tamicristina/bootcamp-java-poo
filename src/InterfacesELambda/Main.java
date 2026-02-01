package InterfacesELambda;

public class Main {
    public static void main(String[] args){
        MusicPlayer musicPlayer = new Computer();
        runMusic(musicPlayer);
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
