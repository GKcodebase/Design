package StructuralDesignPatterns.Decorators.Decorators;

/**
 * The interface Data source.
 */
public interface DataSource {
    /**
     * Write data.
     *
     * @param data the data
     */
    void writeData(String data);

    /**
     * Read data string.
     *
     * @return the string
     */
    String readData();
}
