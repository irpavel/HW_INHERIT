package ru.netology.java.qa59;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTest {
    @Test
    public void testMatchesForSimpleTaskIfTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesForSimpleTaskIfFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesEpicIfTrue() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesEpicIfFalse() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Мясо");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingTopicIfTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingProjectIfTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingTopicIfFalse() {
        Meeting meeting = new Meeting(
                   555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("вторник");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMatchesMeetingProjectIfFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("вторник");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}