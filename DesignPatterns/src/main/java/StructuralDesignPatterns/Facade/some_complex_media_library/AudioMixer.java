package StructuralDesignPatterns.Facade.some_complex_media_library;

import java.io.File;

/**
 * The type Audio mixer.
 */
public class AudioMixer {
    /**
     * Fix file.
     *
     * @param result the result
     * @return the file
     */
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}