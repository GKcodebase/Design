package CreationalDesignPattern.proxy.proxyimpl.downloader;

import CreationalDesignPattern.proxy.some_cool_media_library.ThirdPartyYouTubeLib;
import CreationalDesignPattern.proxy.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * The type You tube downloader.
 */
public class YouTubeDownloader {
    /**
     * The Api.
     */
    private ThirdPartyYouTubeLib api;

    /**
     * Instantiates a new You tube downloader.
     *
     * @param api the api
     */
    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    /**
     * Render video page.
     *
     * @param videoId the video id
     */
    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    /**
     * Render popular videos.
     */
    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
