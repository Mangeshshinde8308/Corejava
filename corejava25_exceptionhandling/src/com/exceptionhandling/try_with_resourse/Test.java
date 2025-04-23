package com.exceptionhandling.try_with_resourse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BufferedReader br=null;
    try {
		br=new BufferedReader(new FileReader("input.txt"));
	} 
    catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    finally {                       //-->till java 1.6 we need to use finally block compulsary to close opened resources conncetion
    	                            // like BufferedReader
    	if(br!=null) {
    		try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    
//    
//    try(BufferedReader bf=new BufferedReader(new FileReader("input.txt"))){  //---> due to write resourse inside try block we do not need to close it explicitaly using finally block.
//    	// from java 1.7 we do not need to write finally block to close resourse
//    	
//    } catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//    
	}

}
