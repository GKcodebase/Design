package BehavioralDesignPattern.Command.commands;

import BehavioralDesignPattern.Command.editor.Editor;

/**
 * The type Copy command.
 */
public class CopyCommand extends Command {

    /**
     * Instantiates a new Copy command.
     *
     * @param editor the editor
     */
    public CopyCommand(Editor editor) {
        super(editor);
    }

    /**
     * Execute boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
