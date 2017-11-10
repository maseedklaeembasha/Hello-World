
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;




public class Filecreate_Text {

	public static void main(String[] args) throws IOException{
	
//not completed .got confusion
		File f1=new File("D://km.txt");
		FileWriter fw =new FileWriter(f1);
		System.out.println(fw);
		BufferedWriter bfw=new BufferedWriter(fw);
		bfw.newLine();
		fw.write("i am learning selenium");
		fw.flush();
		
}
	
}

