package CreationalDesignPattern.proxy.proxyimpl;

import CreationalDesignPattern.proxy.some_cool_media_library.ThirdPartyYouTubeClass;
import CreationalDesignPattern.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import CreationalDesignPattern.proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * The type You tube cache proxy.
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    /**
     * The Youtube service.
     */
    private ThirdPartyYouTubeLib youtubeService;
    /**
     * The Cache popular.
     */
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    /**
     * The Cache all.
     */
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    /**
     * Instantiates a new You tube cache proxy.
     */
    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    /**
     * Popular videos hash map.
     *
     * @return the hash map
     */
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    /**
     * Gets video.
     *
     * @param videoId the video id
     * @return the video
     */
    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    /**
     * Reset.
     */
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
