package uselessMachine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Author: Vinith Yedidi
 * Date: 7/15/2020
 * Version: 1.0
 */

public class CodeFixer {

	public final static String code = 
			"package uselessMachine;\r\n" + 
			"\r\n" + 
			"import java.io.File;\r\n" + 
			"import java.io.IOException;\r\n" + 
			"\r\n" + 
			"/*\r\n" + 
			" * Author: Vinith Yedidi\r\n" + 
			" * Date: 7/15/2020\r\n" + 
			" * Version: 1.0\r\n" + 
			" */\r\n" + 
			"\r\n" + 
			"public class UselessMachine {\r\n" + 
			"	\r\n" + 
			"	public static void main(String[] args) throws IOException {\r\n" + 
			"		// deletes UselessMachine.java, which completely destroys the code. This is what makes it a \"Useless Machine\".\r\n" + 
			"		File javaFile = new File(\"UselessMachine.java\");\r\n" + 
			"		javaFile.delete();\r\n" + 
			"		\r\n" + 
			"		// deletes UselessMachine.class, which is unnecessary, but keeps the package folder clean.\r\n" + 
			"		File classFile = new File(\"UselessMachine.class\");\r\n" + 
			"		classFile.delete();\r\n" + 
			"	}\r\n" + 
			"	\r\n" + 
			"}";
	
	public static void main(String[] args) throws IOException {
		// creates and writes UselessMachine.java
		File javaFile = new File("UselessMachine.java");
		javaFile.createNewFile();
		FileWriter writer =new FileWriter(javaFile.getCanonicalPath());
		writer.write(code);
		writer.close();
		
		// deletes CodeFixer.class, which is unnecessary, but keeps the package folder clean.
		File classFile = new File("CodeFixer.class");
		classFile.delete();
	}
	
}
