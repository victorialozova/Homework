package Student.Student;

import java.util.Date;

public class MyClass {

	public static void main(String[] args) {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date	(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		//проверка поиска элемента студента по имени
		int n = sl.find("Seva");
		System.out.println(sl.get(n).getBirth().toString());
		//проверка поиска студента по фамилии
		int n1 = sl.findSurname("Pupkin");
		System.out.println(sl.get(n1).getBirth().toString());
		//проверка посика студента по дате рождения
		int n2 = sl.findBirth(new Date	(1986, 1, 1));
		System.out.println(sl.get(n2).getName());
		//проверка удаления студента из списка
		sl.deleteStudent("Seva");
		System.out.println(sl.get(0).getName());
		//проверка выхода за пределы списка
		sl.get(101);
		sl.get(-1);
	}
}
