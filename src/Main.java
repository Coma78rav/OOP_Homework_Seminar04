import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teachers;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeacherController().createTeacher("Антон", "Макаренко");
        new TeacherController().createTeacher("Константин", "Ушинский");
        new TeacherController().sendOnConsole(Teachers.teachers);
        new TeacherController().redactTeatcher(2, "Василий", "Сухамлинский");
        new TeacherController().sendOnConsole(Teachers.teachers);
    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}