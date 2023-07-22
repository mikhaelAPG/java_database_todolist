package entity;

public class TodoList {
    // create entity
    private String todo;

    public TodoList() {

    }

    public TodoList(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
