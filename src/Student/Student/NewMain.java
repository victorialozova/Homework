package Student.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Модифицировать проект «Список студентов» так, чтобы 1)
 список вводился с клавиатуры 2) была возможность удалять
 студента по номеру 3) при введении неправильных данных
 (пустое имя, неправильная дата) программа кидала исключение
 и обрабатывала его с выводом соотв. сообщений на экран
 */

public class NewMain {

        public static void main(String[] args) throws IOException, ParseException {
            StudentList sl = new StudentList();
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Enter student name:");
                    String name = r.readLine();
                    System.out.println("Enter student surname:");
                    String surname = r.readLine();
                    System.out.println("Enter student birthday:");
                    String birth = r.readLine();
                    SimpleDateFormat birthday = new SimpleDateFormat();
                    birthday.applyPattern("yyyy.MM.dd");
                    Date studentDate = birthday.parse(birth);
                    sl.add(new Student(name, surname, studentDate));
                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            //проверка поиска элемента студента по имени
            System.out.println("Enter student name for finding him:");
            String nameFind = r.readLine();
            int n = sl.find(nameFind);
            System.out.println(sl.get(n).getBirth().toString());

            //проверка поиска студента по фамилии
            System.out.println("Enter student surname for finding him:");
            String surnameFind = r.readLine();
            int n1 = sl.findSurname(surnameFind);
            System.out.println(sl.get(n1).getBirth().toString());

            //проверка поиска студента по дате рождения
            System.out.println("Enter student birthday for finding him:");
            String dateBirth = r.readLine();
            SimpleDateFormat birthday = new SimpleDateFormat();
            birthday.applyPattern("yyyy.MM.dd");
            Date studentDate = birthday.parse(dateBirth);
            int n2 = sl.findBirth(studentDate);
            System.out.println(sl.get(n2).getName());

            //проверка удаления студента из списка по имени
            System.out.println("Enter student name for deleting him:");
            String nameDel = r.readLine();
            sl.deleteStudent(nameDel);
            System.out.println(sl.get(0).getName());

            //проверка удаления студента из списка по номеру
            System.out.println("Enter student number for deleting him:");
            String numDel = r.readLine();
            int numberDel = Integer.parseInt(numDel);
            sl.deleteStudent(numberDel);
            System.out.println(sl.get(0).getName());

            //проверка выхода за пределы списка
            sl.get(101);
            sl.get(-1);
        }


}
