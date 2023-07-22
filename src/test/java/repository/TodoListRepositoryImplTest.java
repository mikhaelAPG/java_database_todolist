package repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.TodoList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;

public class TodoListRepositoryImplTest {

    private HikariDataSource dataSource;

    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        TodoList todoList = new TodoList();
        todoList.setTodo("Kurniawan");

        todoListRepository.add(todoList);
    }

    @Test
    void testRemove() {
        System.out.println( todoListRepository.remove(1));
        System.out.println(todoListRepository.remove(2));
        System.out.println( todoListRepository.remove(3));
        System.out.println( todoListRepository.remove(4));
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
