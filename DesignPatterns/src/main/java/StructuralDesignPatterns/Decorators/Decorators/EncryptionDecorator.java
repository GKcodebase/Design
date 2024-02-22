package StructuralDesignPatterns.Decorators.Decorators;

import java.util.Base64;

/**
 * The type Encryption decorator.
 */
public class EncryptionDecorator extends DataSourceDecorator {

    /**
     * Instantiates a new Encryption decorator.
     *
     * @param source the source
     */
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    /**
     * Write data.
     *
     * @param data the data
     */
    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    /**
     * Read data string.
     *
     * @return the string
     */
    @Override
    public String readData() {
        return decode(super.readData());
    }

    /**
     * Encode string.
     *
     * @param data the data
     * @return the string
     */
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    /**
     * Decode string.
     *
     * @param data the data
     * @return the string
     */
    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}