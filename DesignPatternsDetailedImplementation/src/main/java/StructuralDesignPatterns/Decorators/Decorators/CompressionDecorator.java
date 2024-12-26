package StructuralDesignPatterns.Decorators.Decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * The type Compression decorator.
 */
public class CompressionDecorator extends DataSourceDecorator {
    /**
     * The Comp level.
     */
    private int compLevel = 6;

    /**
     * Instantiates a new Compression decorator.
     *
     * @param source the source
     */
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    /**
     * Gets compression level.
     *
     * @return the compression level
     */
    public int getCompressionLevel() {
        return compLevel;
    }

    /**
     * Sets compression level.
     *
     * @param value the value
     */
    public void setCompressionLevel(int value) {
        compLevel = value;
    }

    /**
     * Write data.
     *
     * @param data the data
     */
    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    /**
     * Read data string.
     *
     * @return the string
     */
    @Override
    public String readData() {
        return decompress(super.readData());
    }

    /**
     * Compress string.
     *
     * @param stringData the string data
     * @return the string
     */
    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    /**
     * Decompress string.
     *
     * @param stringData the string data
     * @return the string
     */
    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }
}
