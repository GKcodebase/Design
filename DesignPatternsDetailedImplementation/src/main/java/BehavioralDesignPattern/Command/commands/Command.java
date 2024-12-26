package BehavioralDesignPattern.Command.commands;

import BehavioralDesignPattern.Command.editor.Editor;

/**
 * The type Command.
 */
public abstract class Command {
    /**
     * The Editor.
     */
    public Editor editor;
    /**
     * The Backup.
     */
    private String backup;

    /**
     * Instantiates a new Command.
     *
     * @param editor the editor
     */
    Command(Editor editor) {
        this.editor = editor;
    }

    /**
     * Backup.
     */
    void backup() {
        backup = editor.textField.getText();
    }

    /**
     * Undo.
     */
    public void undo() {
        editor.textField.setText(backup);
    }

    /**
     * Execute boolean.
     *
     * @return the boolean
     */
    public abstract boolean execute();
}
