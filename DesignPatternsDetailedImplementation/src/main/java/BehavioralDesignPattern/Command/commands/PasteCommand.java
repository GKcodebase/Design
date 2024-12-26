package BehavioralDesignPattern.Command.commands;

import BehavioralDesignPattern.Command.editor.Editor;

/**
 * The type Paste command.
 */
public class PasteCommand extends Command {

    /**
     * Instantiates a new Paste command.
     *
     * @param editor the editor
     */
    public PasteCommand(Editor editor) {
        super(editor);
    }

    /**
     * Execute boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
