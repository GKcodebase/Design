package BehavioralDesignPattern.Command.commands;

import BehavioralDesignPattern.Command.editor.Editor;

/**
 * The type Cut command.
 */
public class CutCommand extends Command {

    /**
     * Instantiates a new Cut command.
     *
     * @param editor the editor
     */
    public CutCommand(Editor editor) {
        super(editor);
    }

    /**
     * Execute boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    /**
     * Cut string string.
     *
     * @param source the source
     * @return the string
     */
    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
