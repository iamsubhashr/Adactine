package com.Adactine_Project;

import java.io.IOException;

public class FileReadManager {

	// private method
	private void fileReadManager() {
		
	}
	
	// static method
	public static FileReadManager getInstanceFR() {
		FileReadManager frm = new FileReadManager();
		return frm;
		
	}
	
	// non static method
	public Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
}
