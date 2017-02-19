package Student.Student;

import java.util.Date;

public class StudentList {
	private Student[] list = new Student[100];
	private int p = 0;
	
	public void add(Student s) {
		if (p < 100) {
			list[p++] = s;
		}
	}
	//предусмотрен выход за пределы списка
	public Student get(int n) {
		if ((n > list.length)||(n < 0)) {
			System.out.println("There is no student in the list with that number");
			return null;
		}
		return list[n];
	}
	// поиск по имени
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
	// поиск по фамилии
	public int findSurname(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}
		return -1;
	}
	// поиск по дате рождения
	public int findBirth(Date birth) {
		for (int i = 0; i < p; i++) {
			if (list[i].getBirth().equals(birth))
				return i;
		}
		return -1;
	}
	//ф-я удаления студента из списка + предусмотрен выход за пределы списка
	public void deleteStudent(String name) {
		int number = find(name);
		for (int i = number; i < p; i++) {
			if ((i + 1) < list.length && i > 0)  {
				list[i] = list[i + 1];
			}
		}
		list[p - 1] = null;
		p--;
	}
}
