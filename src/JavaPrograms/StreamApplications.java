package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplications {

	public static void main(String[] args) {
		// Sample patient data
		List<Patient> patients = Arrays.asList(new Patient("John Doe", 25), new Patient("Jane Smith", 45),
				new Patient("Alice Johnson", 32), new Patient("Bob Brown", 50));

		// Filter patients older than 30 and collect their names
		List<String> namesOfPatientsAbove30 = patients.stream().filter(patient -> patient.getAge() > 30)
				.map(Patient::getName).collect(Collectors.toList());

		// Print the result
		System.out.println("Patients older than 30: " + namesOfPatientsAbove30);
	}
}

class Patient {
	private String name;
	private int age;

	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
