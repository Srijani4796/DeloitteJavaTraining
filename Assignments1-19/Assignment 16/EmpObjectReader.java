package com.del;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmpObjectReader {
	static FileReader fr;
	static BufferedReader br;
	
	private static void createobject(String input) {
		Emp emp=new Emp();
		int index=0,saveindex=0;
		index=checkindex(input,index);
		emp.setId(input.substring(saveindex,index));
		saveindex=index+1;
		index=checkindex(input,saveindex);
		emp.setName(input.substring(saveindex,index));
		saveindex=index+1;
		index=checkindex(input,saveindex);
		emp.setAge(Integer.parseInt(input.substring(saveindex,index)));
		saveindex=index+1;
		emp.setPhone(input.substring(saveindex));
		System.out.println(emp);
		return;
		
	}

	private static int checkindex(String input,int index) {
		
		return input.indexOf(',',index);
	}

	public static void main(String[] args) {
		try {
			fr=new FileReader("ObjectDetails.txt");
			br=new BufferedReader(fr);
			String input;
			while((input=br.readLine())!= null)
			{
				EmpObjectReader.createobject(input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			 if(fr!=null && br!=null)
			 {
				
					br.close(); 
					fr.close();
			 }
			}
					catch (IOException e) {
					
					e.printStackTrace();
				}
				 
			 }
		}
		

	}

