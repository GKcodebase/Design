package BehavioralDesignPattern.Command;

import BehavioralDesignPattern.Command.editor.Editor;

/**
 * The type Demo.
 */
    public class Demo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
