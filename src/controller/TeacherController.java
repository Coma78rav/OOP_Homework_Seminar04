package controller;

import model.Teacher;
import model.Teachers;
import viev.TeacherView;
import viev.UserView;

import java.util.List;

public class TeacherController {

    private UserView<Teacher> view = new TeacherView();

    public Teacher createTeacher(String name, String last) {
        int id = Teachers.teachers.size() + 1;
        Teacher teacher = new Teacher(id, name, last);
        Teachers.teachers.add(teacher);
        return teacher;
    }

    public void redactTeatcher(int id, String name, String last) {
        Teacher teatcher = Teachers.teachers.remove(id - 1);
        teatcher.setName(name);
        teatcher.setLastName(last);
        Teachers.teachers.add(id - 1, teatcher);
    }

    public void sendOnConsole(List<Teacher> teatchers) {
        view.sendOnConsole(teatchers);
    }

}
