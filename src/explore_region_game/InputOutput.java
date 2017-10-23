package explore_region_game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.*;

public class InputOutput{
	public static HashMap lireFichier(String fichier, boolean flag) throws Exception {
//		HashMap<String, String[]> hashmap = new HashMap<String, String[]>();
		HashMap<String, HashMap<String, String>> element = new HashMap<String, HashMap<String, String>>();
		Pattern elementPattern;
		try {
			FileReader ips = new FileReader(fichier);
			BufferedReader br = new BufferedReader(ips);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				String[] elementListLine = ligne.split("-");
				String depart = elementListLine[0];
//				System.out.println(depart);
				elementPattern= Pattern.compile(depart);
				if(elementPattern.matcher("#")!=null) {
					System.out.println(depart);
				}else if (depart.equals("C")) {
					HashMap<String, String> hm = new HashMap<String, String>();
					hm.put("x",elementListLine[1]);
					hm.put("y", elementListLine[2]);
					element.put(depart, hm);
					System.out.print(depart);

				}else if(depart.equals("T")) {
					HashMap<String, String> hm = new HashMap<String, String>();
					hm.put("x",elementListLine[1]);
					hm.put("y", elementListLine[2]);
					hm.put("number", elementListLine[3]);
					element.put(depart, hm);
					System.out.print(depart);

				}else if (depart.equals("A")) {
					HashMap<String, String> hm = new HashMap<String, String>();
					hm.put("name",elementListLine[1]);
					hm.put("x", elementListLine[2]);
					hm.put("y", elementListLine[3]);
					hm.put("orientation", elementListLine[2]);
					hm.put("movement", elementListLine[3]);
					element.put(depart, hm);
					System.out.print(depart);
					
				}else if (depart.equals("M")) {
					HashMap<String, String> hm = new HashMap<String, String>();
					hm.put("x",elementListLine[1]);
					hm.put("y", elementListLine[2]);
					element.put(depart, hm);
					System.out.print(depart);

				}else {
					throw new Exception("unknown line in the entry file ");
				}
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Not a file");
		} catch (IOException e) {
			System.out.println("Problem while reading " + fichier);
		}
		return element ;
	}
	
	
	public static void printEntry() {
		System.out.println("hello, welcome to the explore region game software");
	}
	public static void printChooseFile() {
		System.out.println("choose your entry file");
	};
}