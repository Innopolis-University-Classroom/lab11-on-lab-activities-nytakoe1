public class Main {

    public static void main(String[] args) {
        Media media = new Media();
        Audio audio= new Audio();
        MP3Adapter audio2= new MP3Adapter(audio);
        System.out.println("Media:");
        media.playMP4();
        System.out.println("Audio:");
        audio.playMP3();
        System.out.println("Audio2:");
        audio2.playMP4();
    }
}

interface MediaPlayer{
    public void playMP4();
}

class Media implements MediaPlayer{

    @Override
    public void playMP4() {
        System.out.println("currently in use MB4");
    }
}

interface AudioPlayer{
    public void playMP3();
}

class Audio implements  AudioPlayer{

    @Override
    public void playMP3() {
        System.out.println( "currently in use MB3");
    }
}

class MP3Adapter implements  MediaPlayer{
    AudioPlayer audioPlayer;

    public MP3Adapter(AudioPlayer au){
        this.audioPlayer=au;
    }
    @Override
    public void playMP4() {
        audioPlayer.playMP3();

    }
}
