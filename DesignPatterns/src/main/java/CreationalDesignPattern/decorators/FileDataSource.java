package CreationalDesignPattern.decorators;

import java.io.*;

/**
 * The type File data source.
 */
public class FileDataSource implements DataSource {
    /**
     * The Name.
     */
    private String name;

    /**
     * Instantiates a new File data source.
     *
     * @param name the name
     */
    public FileDataSource(String name) {
        this.name = name;
    }

    /**
     * Write data.
     *
     * @param data the data
     */
    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Read data string.
     *
     * @return the string
     */
    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}