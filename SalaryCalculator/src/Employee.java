public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double tax() {
		double tax = 0;
		if (salary >= 1000) {
			tax = (getSalary() * 3) / 100;
			return tax;
		} else {
			return tax;
		}
	}

	public double bonus() {
		double bonusPayment = 0;
		if (getWorkHours() > 40) {
			bonusPayment = (int) ((getWorkHours() - 40) * 30);
			return bonusPayment;
		} else {
			return bonusPayment;
		}
	}

	public double raiseSalary() {
		double raise = 0;
		int currentYear = 2021;
		int workTime = currentYear - getHireYear();
		if (workTime <= 9) {
			raise = getSalary() * 5 / 100;			
		} else if (workTime > 9 && workTime <= 19) {
			raise = getSalary() * 10 / 100;	
		} else if(workTime > 19){ 
			raise = getSalary() * 15 / 100;
		}
		return raise;
	}

	public String toString() {
		return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : "
				+ workHours + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax()
				+ "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary()
				+ "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax())
				+ "\nToplam Maaş : " + (salary + bonus() + raiseSalary() - tax());
	}
}