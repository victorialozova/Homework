package MonitoringCatalog;

/**
 * Написать код для мониторинга каталога. Выводить на экран
 * предупреждение если в каталог добавляется текстовый
 * файл (*.txt).
 */

public class Main {
    public static void main(String[] args) {
        MonitorCatalog m = new MonitorCatalog("D:\\", new CatalogEvent());
        m.start();
    }


}
