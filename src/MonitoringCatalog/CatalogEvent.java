package MonitoringCatalog;

/**
 * Написать код для мониторинга каталога. Выводить на экран
 * предупреждение если в каталог добавляется текстовый
 * файл (*.txt).
 */

public class CatalogEvent implements ICatalogEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File *txt created: " + s);

    }

}
