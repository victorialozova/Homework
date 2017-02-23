package MonitoringCatalog;

import java.io.File;

/**
 * Написать код для мониторинга каталога. Выводить на экран
 * предупреждение если в каталог добавляется текстовый
 * файл (*.txt).
 */

public class MonitorCatalog {
    String dir;
    ICatalogEvent event;

    public MonitorCatalog(String dir, ICatalogEvent event) {
        this.dir = dir;
        this.event = event;
    }

    public void start() {
        File catalog = new File(dir);
        while (true) {
            for (File f : catalog.listFiles()) {
                if (f.getName().endsWith(".txt")) {
                    event.onFileAdded(f.getAbsolutePath());
                    return;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Waiting...");
        }
    }
}


