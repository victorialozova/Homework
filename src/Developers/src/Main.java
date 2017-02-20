package Developers.src;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Developer[] list = {
				new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7),
				new MiddleDeveloper("Ivan", 500, 2)
		};
		StringBuilder sb;
		
		for (Developer d : list) {
			sb = new StringBuilder() // !!!
				.append(d.getName())
				.append(": ")
				.append(d.getBasicSalary())
				.append(" -> ")
				.append(d.getSalary());
			
			System.out.println(sb.toString());
		}
		//Написать код, который разделит список объектов Developer на 3 отдельных списка
		// для Juniors, Seniors и Team Leads. Вывести списки на экран.
		ArrayList<Developer> listJun = new ArrayList<>();
		ArrayList<Developer> listSen = new ArrayList<>();
		ArrayList<Developer> listLead = new ArrayList<>();

		for (Developer dev : list) {
			if (dev instanceof JuniorDeveloper) {
				listJun.add(dev);
			} else if (dev instanceof SeniorDeveloper) {
				listSen.add(dev);
			} else if (dev instanceof TeamLeadDeveloper) {
				listLead.add(dev);
			}
		}
		for (int i = 0; i < listJun.size(); i++) {
			System.out.println("Junior developers: " + listJun.get(i).getName() + " " + listJun.get(i).getSalary());
		}
		for (int i = 0; i < listSen.size(); i++) {
			System.out.println("Senior developers: " + listSen.get(i).getName() + " " + listSen.get(i).getSalary());
		}
		for (int i = 0; i < listLead.size(); i++) {
			System.out.println("Team leaders: " + listLead.get(i).getName() + " " + listLead.get(i).getSalary());
		}
		//Создать список разработчиков и заполнить его случайным oбразом.
		// Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.
		ArrayList<Developer> listDevelopers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String devJun = new Random().nextInt() + "";
			int sal = 250 + 250 * i;
			listDevelopers.add(new JuniorDeveloper(devJun, sal, i));

			String devMid = devJun + i;
			listDevelopers.add(new MiddleDeveloper(devMid, sal, i));

			String devSen = devJun + i + i;
			listDevelopers.add(new SeniorDeveloper(devSen, sal, i));
		}
		for (int i = 0; i < listDevelopers.size(); i++) {
			if (listDevelopers.get(i).getSalary() > 1500) {
				System.out.println("Developer name: " + listDevelopers.get(i).getName());
				System.out.println("Developer salary: " + listDevelopers.get(i).getSalary());
			}
		}
	}
}
