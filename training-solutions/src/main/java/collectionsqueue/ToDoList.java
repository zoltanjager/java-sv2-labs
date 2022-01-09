package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public void addToDo(ToDo toDo) {
        todos.add(toDo);
    }


    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();

        for (ToDo actual : todos) {
            if (actual.isUrgent()) {
                result.addFirst(actual);
            } else {
                result.addLast(actual);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addToDo(new ToDo("bevásárlás", false));
        toDoList.addToDo(new ToDo("csekket befizetni", true));
        toDoList.addToDo(new ToDo("takarítás", false));
        toDoList.addToDo(new ToDo("bringázás", true));
        toDoList.addToDo(new ToDo("programozás", true));

        Deque<ToDo> result = toDoList.getTodosInUrgencyOrder();
        System.out.println(result);
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
        System.out.println(result.pop());
    }


}
