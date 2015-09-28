package sept.github.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandleOps {
	
	/*b. Write a program to count the number of words in a file.
	 * 
	 */
	public void countWords(String path){
		int countLine=0;
		long count = 0;

        BufferedReader br=null;

        try {
               br= new BufferedReader(new FileReader(path));
              String line;

              while((line=br.readLine())!=null){
            	  countLine++;
                  //System.out.println(line);
                  String[] words = line.split(" ");
                  for (String word : words) {
                       count++;
                  }                 
              }
              System.out.println("Number of words in this file are: "+count);            

       } catch (FileNotFoundException e) {

              e.printStackTrace();

       } catch (IOException e) {
            
              e.printStackTrace();

       }

        finally{

               try {

                     br.close();

              } catch (IOException e) {

                     e.printStackTrace();

              }

        }

	}
	
	
	/*c. Write a program to search for a string in a file 
	 * and then return the count of number of occurrences of the string.
	 */
	public void countString(String path, String strSearch){
		int countLine=0;
		String inputSearch = strSearch;
		int count = 0;

        BufferedReader br=null;

        try {
               br= new BufferedReader(new FileReader(path));
              String line;

              while((line=br.readLine())!=null){
            	  countLine++;
                  //System.out.println(line);
                  String[] words = line.split(" ");
                  for (String word : words) {
                    if (word.equals(inputSearch)) {
                      count++;
                    }
                  }                 
              }
              System.out.println("String '"+inputSearch+"' is there in this file for "+count+" times.");            

       } catch (FileNotFoundException e) {

              e.printStackTrace();

       } catch (IOException e) {
            
              e.printStackTrace();

       }

        finally{

               try {

                     br.close();

              } catch (IOException e) {

                     e.printStackTrace();

              }

        }

	}
	
	
	/*d. Write a program to search for a string in a file and 
	 * then replace it with another string.
	 * 
	 */
	public void findAndReplace(String path,String substr, String replacestr){
		  
		 BufferedReader br = null;
		 StringBuilder sr = null;
		 sr = new StringBuilder();
		 
		 try {
			br = new BufferedReader(new FileReader(path));
			String line;
			
			while((line=br.readLine())!=null){
			
				if(line.contains(substr))
				  {	   
					 
					int ind = line.indexOf(substr);
					   
					sr.append(line, 0, ind).append(replacestr).append(line, (ind+substr.length()),line.length());
					   	   
				   }
				}
			
			System.out.println("Replaced string is : "+sr);
			} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 		 	  
	}
	
	
	/*e. Write a program to show list of all file names in a folder.
	 * 
	 */
	public void listFiles(String path){
		File file = new File(path);
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }

	}
	
	
	/*f. Write a program to copy content of file into another file.
	 * 
	 */
	public void fileIntoAnother(String path){
		
		 BufferedReader br = null;
		 BufferedWriter bw=null;
	     
	     File file = new File("C:\\Users\\pallavii\\Desktop\\test2.txt");

	     try {
	    	 br = new BufferedReader(new FileReader(path));
	    	 bw = new BufferedWriter(new FileWriter(file));
	    	 String line;
	    	 
	    	 while((line=br.readLine())!=null){
	    		 
	    		 bw.write(line);
	    		 
	    	 }

	    } catch (IOException e) {

	           // TODO Auto-generated catch block

	           e.printStackTrace();

	    }

	     finally{

	            try {

	                  bw.close();

	           } catch (IOException e) {

	                  // TODO Auto-generated catch block

	                  e.printStackTrace();

	           }

	     }
	}



}
