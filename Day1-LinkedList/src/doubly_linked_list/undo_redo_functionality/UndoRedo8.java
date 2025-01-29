package doubly_linked_list.undo_redo_functionality;

public class UndoRedo8 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("State 1: Hello");
        editor.addState("State 2: Hello, World");
        editor.addState("State 3: Hello, World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("State 4: Hello, World Again!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();
    }
}
