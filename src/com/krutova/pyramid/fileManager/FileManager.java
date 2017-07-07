package com.krutova.pyramid.fileManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.krutova.pyramid.exception.PyramidException;

public class FileManager {
	
	public static ArrayList<String> readLineFromFile(String fileName) throws PyramidException {
        
		String line;
        ArrayList<String> lines = new ArrayList<String>();
        BufferedReader reader = null;
        try {
			reader = Files.newBufferedReader(Paths.get(fileName));
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			} 
		}
        catch(IOException  e){
			throw new PyramidException("File is incorrect",e);
		}

        if (lines.isEmpty()){
        	throw new PyramidException("File is empty!");
        }
	return lines;
	}
	
}
