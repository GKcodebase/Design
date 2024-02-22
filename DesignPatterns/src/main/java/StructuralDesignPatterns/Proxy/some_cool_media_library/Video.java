package StructuralDesignPatterns.Proxy.some_cool_media_library;

/**
 * The type Video.
 */
public class Video {
    /**
     * The Id.
     */
    public String id;
    /**
     * The Title.
     */
    public String title;
    /**
     * The Data.
     */
    public String data;

    /**
     * Instantiates a new Video.
     *
     * @param id    the id
     * @param title the title
     */
    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
