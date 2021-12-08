package QuestaoI;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;


public class PessoasOutputStream extends OutputStream {
	// Francisco Valdemi Leal Costa Junior - 485325
	private static Pessoa[] people;
	private static OutputStream os;
	
	@Override
	public void write(int arg0) throws IOException {
		// TODO Auto-generated method stub	
	}
	
	public PessoasOutputStream (Pessoa[] people, OutputStream os) {
		PessoasOutputStream.people = people;
		PessoasOutputStream.os = os;
	}
	
	public Pessoa[] getPeople() {
		return people;
	}

	public void setPeople(Pessoa[] people) {
		PessoasOutputStream.people = people;
	}

	public OutputStream getOutput() {
		return os;
	}

	public void setOs(OutputStream os) {
		PessoasOutputStream.os = os;
	}
	
	public static void writeSysout() throws IOException {
		PrintWriter pw = new PrintWriter(os);
		pw.println("How much people: " + people.length);
		
		for(Pessoa person : people) {
			pw.println("Number of bytes used to store the name: " + person.getName().getBytes().length);
			pw.println("Person's name: " + person.getName());
			pw.println("Person's CPF: " + person.getCpf());
			pw.println("Person's age: " + person.getAge());
		}
		pw.close();
		os.close();
	}
	
	public static void writeFile() throws IOException {
		PrintWriter pw = new PrintWriter(os);
		pw.println("How much people: " + people.length);
		
		for(Pessoa person : people) {
			pw.println("Number of bytes used to store the name: " + person.getName().getBytes().length);	
			pw.println("Person's name: " + person.getName());
			pw.println("Person's CPF: " + person.getCpf());
			pw.println("Person's age: " + person.getAge());
		}
		pw.close();
		os.close();
	}
	
}