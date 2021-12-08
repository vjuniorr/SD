package QuestaoI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	// Francisco Valdemi Leal Costa Junior - 485325
	public static void main(String[] args) throws IOException {
		Pessoa[] pessoas = new Pessoa[5];

		Pessoa p1 = new Pessoa("Samuel", "12345678", 22);
		Pessoa p2 = new Pessoa("Pedro", "12345678", 42);
		Pessoa p3 = new Pessoa("Paulo", "12345678", 32);
		Pessoa p4 = new Pessoa("Peçanha", "12345678", 52);
		Pessoa p5 = new Pessoa("Picolino", "12345678", 33);

		pessoas[0] = p1;
		pessoas[1] = p2;
		pessoas[2] = p3;
		pessoas[3] = p4;
		pessoas[4] = p5;

		// OutputStreamSysout

		// PessoasOutputStream p = new PessoasOutputStream(pessoas, System.out);
		// p.writeSysout();

		// OutputStreamFile

		// File file = new File("out.txt");
		// boolean exists = file.exists();
		// if (!exists) {
		// 	file.createNewFile();
		// } else {
		// 	file.delete();
		// 	file.createNewFile();
		// }
		// FileOutputStream fos = new FileOutputStream(file, true);
		// PessoasOutputStream p = new PessoasOutputStream(pessoas, fos);
		// p.writeFile();

	}

}
