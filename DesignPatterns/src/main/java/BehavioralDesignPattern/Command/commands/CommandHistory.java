package BehavioralDesignPattern.Command.commands;

import java.util.Stack;

/**
 * The type Command history.
 */
public class CommandHistory {
    /**
     * The History.
     */
    private Stack<Command> history = new Stack<>();

    /**
     * Push.
     *
     * @param c the c
     */
    public void push(Command c) {
        history.push(c);
    }

    /**
     * Pop command.
     *
     * @return the command
     */
    public Command pop() {
        return history.pop();
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() { return history.isEmpty(); }
}
