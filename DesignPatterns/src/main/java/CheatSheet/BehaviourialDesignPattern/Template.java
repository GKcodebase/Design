package CheatSheet.BehaviourialDesignPattern;

/**
 * The Template.
 */
public class Template {
    /**
     * The type Data miner.
     */
    abstract class DataMiner {
        /**
         * Mine.
         */
//TemplateMethod
        public final void mine() {
            openFile();
            extractData();
            parseData();
            analyze();
            sendReport();
            closeFile();
        }

        /**
         * Open file.
         */
// Abstract methods to be implemented by subclasses
        protected abstract void openFile();

        /**
         * Extract data.
         */
        protected abstract void extractData();

        /**
         * Parse data.
         */
// Optional hooks with default implementation
        protected void parseData() {
            System.out.println("Parsing data");
        }

        /**
         * Close file.
         */
// Concrete method
        private void closeFile() {
            System.out.println("Closing file");
        }

        /**
         * Analyze.
         */
// Another hook
        protected void analyze() {
            System.out.println("Analyzing data");
        }

        /**
         * Send report.
         */
// Another concrete method
        private void sendReport() {
            System.out.println("Sending report");
        }
    }

    /**
     * The type Pdf data miner.
     */
//Concrete Implementation
    class PDFDataMiner extends DataMiner {

        /**
         * Open file.
         */
        @Override
        protected void openFile() {
            System.out.println("Opening PDF file");
        }

        /**
         * Extract data.
         */
        @Override
        protected void extractData() {
            System.out.println("Extracting data from PDF");
        }
    }
}
