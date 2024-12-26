package StructuralDesignPatterns.Facade;

import StructuralDesignPatterns.Facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * The type Demo.
 */
public class Demo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
