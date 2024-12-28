package BehaviourialDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The Memento.
 */
public class Memento {
    /**
     * The type Editor memento.
     */
// Memento
    class EditorMemento{
        /**
         * The Content.
         */
        private final String content;

        /**
         * Instantiates a new Editor memento.
         *
         * @param content the content
         */
        EditorMemento(String content) {
            this.content = content;
        }

        /**
         * Gets content.
         *
         * @return the content
         */
        public String getContent() {
            return content;
        }
    }

    /**
     * The type Editor.
     */
// Originator
    class Editor{
        /**
         * The Content.
         */
        private StringBuilder content = new StringBuilder();

        /**
         * Write.
         *
         * @param text the text
         */
        public void write(String text) {
            content.append(text);
        }

        /**
         * Gets content.
         *
         * @return the content
         */
        public String getContent() {
            return content.toString();
        }

        /**
         * Save editor memento.
         *
         * @return the editor memento
         */
        public EditorMemento save() {
            return new EditorMemento(content.toString());
        }

        /**
         * Restore.
         *
         * @param memento the memento
         */
        public void restore(EditorMemento memento) {
            content = new StringBuilder(memento.getContent());
        }

    }

    /**
     * The type History.
     */
// Caretaker
    class History{
        /**
         * The States.
         */
        private List<EditorMemento> states = new ArrayList<>();

        /**
         * Push.
         *
         * @param state the state
         */
        public void push(EditorMemento state) {
            states.add(state);
        }

    }
}
