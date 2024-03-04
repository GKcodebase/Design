package BehavioralDesignPattern.Observer.editor;

import BehavioralDesignPattern.Observer.publisher.EventManager;

import java.io.File;

/**
 * The type Editor.
 */
public class Editor {
    /**
     * The Events.
     */
    public EventManager events;
    /**
     * The File.
     */
    private File file;

    /**
     * Instantiates a new Editor.
     */
    public Editor() {
        this.events = new EventManager("open", "save");
    }

    /**
     * Open file.
     *
     * @param filePath the file path
     */
    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    /**
     * Save file.
     *
     * @throws Exception the exception
     */
    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
