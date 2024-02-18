package CreationalDesignPattern.Facade.some_complex_media_library;

/**
 * The type Codec factory.
 */
public class CodecFactory {
    /**
     * Extract codec.
     *
     * @param file the file
     * @return the codec
     */
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
