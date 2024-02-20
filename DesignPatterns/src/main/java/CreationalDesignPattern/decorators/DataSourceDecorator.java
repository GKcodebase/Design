package CreationalDesignPattern.decorators;

/**
 * The type Data source decorator.
 */
public class DataSourceDecorator implements DataSource {
    /**
     * The Wrappee.
     */
    private DataSource wrappee;

    /**
     * Instantiates a new Data source decorator.
     *
     * @param source the source
     */
    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    /**
     * Write data.
     *
     * @param data the data
     */
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    /**
     * Read data string.
     *
     * @return the string
     */
    @Override
    public String readData() {
        return wrappee.readData();
    }
}
