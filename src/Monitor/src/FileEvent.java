package Monitor.src;

import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileEvent implements IFileEvent {

	@Override
	public void onFileAdded(String s) {
		System.out.println("File added: " + s);
		try {
			dateCreation();
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public void dateCreation() throws IOException {
		File f = new File("1.txt");
		FileWriter fw = new FileWriter(f);
		Path p = f.toPath();
		BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);
		System.out.println("Creation time: " + attr.creationTime());
	}
}
