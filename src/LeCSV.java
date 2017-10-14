import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeCSV {
	
	public static void main(String args[]) {
		
		List<Pessoa> listaDePessoas = new ArrayList<>();

		String arquivo = "participantes.csv";

		try (Scanner scanner = new Scanner(new File(arquivo))) {

			while (scanner.hasNext()){
				String linha = scanner.nextLine();
				String[] split = linha.split(",");
				
				Pessoa p = new Pessoa();
				p.setNome(split[0]);
				p.setEmail(split[1]);
				
				listaDePessoas.add(p);
			}
			
			for (Pessoa pessoa : listaDePessoas) {
				System.out.println(pessoa);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
