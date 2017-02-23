package Monitor.src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileEvent implements IFileEvent {

	@Override
	public void onFileAdded(String s) {
		System.out.println("File exists: " + s);
		try {
			dateCreation(s);
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	//Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
	public void dateCreation(String path) throws IOException {
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		Path p = f.toPath();
		BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);
		System.out.println("Creation time: " + attr.creationTime());
	}
}
