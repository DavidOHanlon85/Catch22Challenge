/**
 * 
 */
package challenge_Catch22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class Catch22Revision01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and Initialise Variables
		
		String line;
		int numberOfLines = 0;
		int numberOfCharacters = 0;
		int numberOfWords = 0;
		int numberOfYossarian = 0;
		int numberOfAs = 0;
		
		// Instantiate File class, File Reader Class, File Writer Class
		
		File file = new File("Catch 22.txt");
		File modifiedFile2 = new File("Modified Catch22.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(modifiedFile2);
			BufferedWriter bw = new BufferedWriter(fw);
			
			line = br.readLine();
			
			while (line != null) {
				
				// Print story to console
				System.out.println(line);
				
				// Number of lines 
				numberOfLines++;
				
				// Number of characters
				numberOfCharacters += line.length();
				
				// Number of words
				String[] words = line.split(" ");
				numberOfWords += words.length;
				
				// Number of Yossarian
				for (String word: words) {
					if (word.equalsIgnoreCase("Yossarian")) {
						numberOfYossarian++;
					}
				}
				
				// Number of As
								
				for (int i = 0; i < line.length(); i++)
					switch (line.charAt(i)) {
					case 'a':
					case 'A':
						numberOfAs++;
					}
				
				// Write to file
				
				String redactedLine;
				
				if (line.contains("Yossarian")) {
					redactedLine = line.replace("Yossarian", "---------");
					bw.write(redactedLine);
					bw.newLine();
				} else if (line.contains("yossarian")){
					redactedLine = line.replace("yossarian", "---------");
					bw.write(redactedLine);
					bw.newLine();
				} else if (line.contains("yossarian")){
					redactedLine = line.replace("yossarian", "---------");
					bw.write(redactedLine);
					bw.newLine();
				} else {
					bw.write(line);
					bw.newLine();
				}
				
				line = br.readLine();
				
			}
			
			br.close();
			fr.close();
			
			bw.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Number of lines : "+numberOfLines);
		System.out.println("Number of characters : "+numberOfCharacters);
		System.out.println("Number of words : "+numberOfWords);
		System.out.println("Number of instances of Yossarian : "+numberOfYossarian);
		System.out.println("Number of As : "+numberOfAs);
		

	}

}
