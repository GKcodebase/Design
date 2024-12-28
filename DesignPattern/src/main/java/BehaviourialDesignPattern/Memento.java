package BehaviourialDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    // Memento
    class EditorMemento{
        private final String content;

        EditorMemento(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }
    }

    // Originator
    class Editor{
        private StringBuilder content = new StringBuilder();

        public void write(String text) {
            content.append(text);
        }

        public String getContent() {
            return content.toString();
        }

        public EditorMemento save() {
            return new EditorMemento(content.toString());
        }

        public void restore(EditorMemento memento) {
            content = new StringBuilder(memento.getContent());
        }

    }
    // Caretaker
    class History{
        private List<EditorMemento> states = new ArrayList<>();

        public void push(EditorMemento state) {
            states.add(state);
        }

    }
}
