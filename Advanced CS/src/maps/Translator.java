package maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Translator {
	
	private HashMap<String,String> words;
	private Scanner input = new Scanner(System.in);
	
	public void start() {
		
		while(true) {
			System.out.println("\nEnter a word to translate. Press q to quit");
			String str = input.nextLine().trim().toLowerCase();
			if (str.equals("q"))
				break;
			else if (!words.containsKey(str))
				System.out.println("Not contained in this dictionary, try another word.");
			else
				System.out.println("Translation: " + words.get(str));
		} 
	}
	
	public Translator() {
		words = new HashMap<String, String>();
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("EnglishToArabicDictionary.txt"));
		
			for (String line = in.readLine(); line != null; line = in.readLine()) {
				if (line.charAt(0) == 65279) line = line.substring(1);
				String nextLine = in.readLine();
				words.put(line.trim().toLowerCase(), nextLine.trim().toLowerCase());
			}
			in.close();
		} catch (IOException e) {}
		System.out.println(words);
		start();
	}

	public static void main(String[] args) throws IOException {
		new Translator();

	}

}
