package Developers.src;

public class SeniorDeveloper extends Developer {

	public SeniorDeveloper(String name, int basicSalary, int experience) {
		super(name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 3) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
