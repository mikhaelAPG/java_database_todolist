package repository;

import entity.TodoList;

public interface TodoListRepository {
    // create repository
    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);
}
