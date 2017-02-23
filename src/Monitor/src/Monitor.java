package Monitor.src;

import java.io.File;

public class Monitor {
	String file1;
	String file2;
	IFileEvent event;
	
	public Monitor(String file1, String file2, IFileEvent event) {
		this.file1 = file1;
		this.file2 = file2;
		this.event = event;
	}
	//Добавить в проект ф-ю мониторинга более одного файла.
	public void start() {
		while (true) {
			File[] list = {
					new File(file1),
					new File(file2)
			};
			boolean allFilesAdded = true;
			for (File f: list) {
				if (f.exists() && f.isFile()) {
					if (event != null)
						event.onFileAdded(f.getAbsolutePath());
				} else allFilesAdded = false;
			}
			if (allFilesAdded) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println("Waiting...");
		}
	}
}
