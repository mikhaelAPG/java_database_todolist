package service;

public interface TodoListService {
    // create service
    void showTodoList();

    void addTodoList(String todo);

    void removeTodoList(Integer number);
}
