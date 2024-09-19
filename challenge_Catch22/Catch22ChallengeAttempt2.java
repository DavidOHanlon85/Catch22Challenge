/**
 * 
 */
package challenge_Catch22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class Catch22ChallengeAttempt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line;
		
		int numberOfLines, numberOfWords, numberOfCharacters, numberOfYossarian, numberOfAs;
		
		numberOfLines = 0;
		numberOfWords = 0;
		numberOfCharacters = 0;
		numberOfYossarian = 0;
		numberOfAs = 0;
		
		File file = new File("Catch 22.txt");
		File redactedFile = new File("Redacted File");
		
		// getting text reader
		
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(redactedFile, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		line = br.readLine();
		while(line != null) {
			// Printing to console
			System.out.println(line);
			
			// Number of lines
			numberOfLines++;
			
			// Number of characters
			numberOfCharacters += line.length();
			
			// Number of words
			String[] words = line.split(" ");
			numberOfWords += words.length;
			
			// Number of Yossarian
			for (String word : words) {
				if (word.equalsIgnoreCase("Yossarian")) {
					numberOfYossarian++;
				}
			}
			
			// Redacting Yossarian
			
			String redactedLine = "";
			
			if (line.contains("Yossarian")) {
				redactedLine = line.replace("Yossarian", "---------");
				bw.write(redactedLine + "\n"); 
			} else if (line.contains("yossarian")) {
				redactedLine = line.replace("yossarian", "---------");
				bw.write(redactedLine + "\n"); 
			}else if (line.contains("YOSSARIAN")) {
				redactedLine = line.replace("YOSSARIAN", "---------");
				bw.write(redactedLine + "\n"); 
			} else {
				bw.write(line + "\n");
			}
			
			// Number of A's
			
			for (int i = 0; i < line.length(); i++)
				if (line.charAt(i) == 'a' || line.charAt(i) == 'A') {
					numberOfAs++;
				}
			
			line = br.readLine();
		}
		
		br.close();
		fr.close();
		
		bw.close();
		fr.close();
		
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		System.out.println("Number of lines : "+numberOfLines);
		System.out.println("Number of characters : " +numberOfCharacters);
		System.out.println("Number of words : " +numberOfWords);
		System.out.println("Number of instances of Yossarain : "+numberOfYossarian);
		System.out.println("Number of As : "+numberOfAs);
				
				
		
	}

}
