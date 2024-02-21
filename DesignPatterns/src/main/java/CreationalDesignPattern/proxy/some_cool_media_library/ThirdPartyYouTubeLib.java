package CreationalDesignPattern.proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * The interface Third party you tube lib.
 */
public interface ThirdPartyYouTubeLib {
    /**
     * Popular videos hash map.
     *
     * @return the hash map
     */
    HashMap<String, Video> popularVideos();

    /**
     * Gets video.
     *
     * @param videoId the video id
     * @return the video
     */
    Video getVideo(String videoId);
}