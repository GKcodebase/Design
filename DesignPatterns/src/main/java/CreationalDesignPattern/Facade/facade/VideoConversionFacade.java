package CreationalDesignPattern.Facade.facade;

import CreationalDesignPattern.Facade.some_complex_media_library.*;

import java.io.File;

/**
 * The type Video conversion facade.
 */
public class VideoConversionFacade {
    /**
     * Convert video file.
     *
     * @param fileName the file name
     * @param format   the format
     * @return the file
     */
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
