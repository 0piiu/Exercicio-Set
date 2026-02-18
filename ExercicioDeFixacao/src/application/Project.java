
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.UserLogs;

public class Project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String strPath = "/home/thalessantos/ws-eclipse/ExercicioSet/ExercicioDeFixacao/arquivo.txt";
		File path = new File(strPath);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			Set<UserLogs> set = new TreeSet<>();
			
			while (line != null) {
				UserLogs log = new UserLogs(line);
				set.add(log);
				System.out.println(line);
				line = br.readLine();
			}
			
			System.out.println(set.size());
			
		} catch (IOException e) {
			e.getMessage();
		}
		sc.close();
	}
}
