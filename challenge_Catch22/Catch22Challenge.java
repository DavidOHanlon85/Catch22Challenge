/**
 * 
 */
package challenge_Catch22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 
 */
public class Catch22Challenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("Catch 22.txt");

		// Print book to console
		
		// Declare Variables
		
		String line;
		int numberOfLines = 0;
		int numberOfWords = 0;

		if (!file.exists()) {
			System.out.println("File does not exist");
		} else {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

				System.out.println("File exists");

				line = br.readLine();
				while (br.readLine() != null) {
					System.out.println(line);
					numberOfLines++;
					line = br.readLine();
				}
				
				br.close();
				fr.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Number of lines  - return integer in method
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			System.out.println("File exists");

			line = br.readLine();
			while (br.readLine() != null) {
				
				line = br.readLine();
			}
			
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("Number of lines : " +numberOfLines);
		
		// Number of Words - return integer in method
		
		String[] eachLine = new String[numberOfLines];
		String[] eachWord = null;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			System.out.println("File exists");

			line = br.readLine();
			int index = 0;
			while (br.readLine() != null) {
					eachWord = line.split(" "); 
					numberOfWords += eachWord.length;
					index++;
					line = br.readLine();
				}
			
			System.out.println(Arrays.toString(eachWord));
			
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of words: " +numberOfWords);

	}

}
