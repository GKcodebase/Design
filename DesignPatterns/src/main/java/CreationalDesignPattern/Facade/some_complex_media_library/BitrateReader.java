package CreationalDesignPattern.Facade.some_complex_media_library;

/**
 * The type Bitrate reader.
 */
public class BitrateReader {
    /**
     * Read video file.
     *
     * @param file  the file
     * @param codec the codec
     * @return the video file
     */
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    /**
     * Convert video file.
     *
     * @param buffer the buffer
     * @param codec  the codec
     * @return the video file
     */
    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
