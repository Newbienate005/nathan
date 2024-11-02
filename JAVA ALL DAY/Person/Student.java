public class Student {
	String program;
	int year;
	double fee;

	public Student(String name, String address, String program, int year, double fee) {
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String newprogram) {
		this.program = newprogram;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int newyear) {
		this.year = newyear;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double newfee) {
		this.fee = newfee;
	}

	@Override
	public String toString() {
		return "Student[Person[" + ",Program =" + program + ",year= " + year + ",fee =" + fee + "]";
	}
}
