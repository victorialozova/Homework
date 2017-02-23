package MonitoringCatalog;

/**
 * Написать код для мониторинга каталога. Выводить на экран
 * предупреждение если в каталог добавляется текстовый
 * файл (*.txt).
 */
public interface ICatalogEvent {
    void onFileAdded(String s);
}