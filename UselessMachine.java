package uselessMachine;

import java.io.File;
import java.io.IOException;

/*
 * Author: Vinith Yedidi
 * Date: 7/15/2020
 * Version: 1.0
 */

public class UselessMachine {
	
	public static void main(String[] args) throws IOException {
		// deletes UselessMachine.java, which completely destroys the code. This is what makes it a "Useless Machine".
		File javaFile = new File("UselessMachine.java");
		javaFile.delete();
		
		// deletes UselessMachine.class, which is unnecessary, but keeps the package folder clean.
		File classFile = new File("UselessMachine.class");
		classFile.delete();
	}
	
}