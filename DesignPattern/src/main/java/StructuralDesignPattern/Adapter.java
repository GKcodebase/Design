package StructuralDesignPattern;

/**
 * The Adapter.
 */
public class Adapter {
    /**
     * The interface Media player.
     */
// Existing interface
    interface MediaPlayer {
        /**
         * Play.
         *
         * @param audioTYpe the audio t ype
         * @param fileName  the file name
         */
        void play(String audioTYpe, String fileName);
    }

    /**
     * The interface Advanced media player.
     */
// Advanced media player
    interface AdvancedMediaPlayer {
        /**
         * Play vlc.
         *
         * @param fileName the file name
         */
        void playVlc(String fileName);

        /**
         * Play mp 4.
         *
         * @param fileName the file name
         */
        void playMp4(String fileName);
    }

    /**
     * The type Vlc media player.
     */
//Concrete implementation of advanced Media player
    class VlcMediaPlayer implements AdvancedMediaPlayer {

        /**
         * Play vlc.
         *
         * @param fileName the file name
         */
        @Override
        public void playVlc(String fileName) {
            //impl
        }

        /**
         * Play mp 4.
         *
         * @param fileName the file name
         */
        @Override
        public void playMp4(String fileName) {
            //impl
        }
    }

    /**
     * The type Media adapter.
     */
//Adapter Class
    class MediaAdapter implements MediaPlayer {
        /**
         * The Advanced music player.
         */
        AdvancedMediaPlayer advancedMusicPlayer;

        /**
         * Instantiates a new Media adapter.
         *
         * @param audioType the audio type
         */
        public MediaAdapter(String audioType) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer = new VlcMediaPlayer();
            }
        }

        /**
         * Play.
         *
         * @param audioType the audio type
         * @param fileName  the file name
         */
        @Override
        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            }
        }
    }
}
