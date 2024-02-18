package CreationalDesignPattern.Facade.some_complex_media_library;

/**
 * The type Video file.
 */
public class VideoFile {
    /**
     * The Name.
     */
    private String name;
    /**
     * The Codec type.
     */
    private String codecType;

    /**
     * Instantiates a new Video file.
     *
     * @param name the name
     */
    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    /**
     * Gets codec type.
     *
     * @return the codec type
     */
    public String getCodecType() {
        return codecType;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}

