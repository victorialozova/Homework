package Monitor2.test;

public interface IFileEvents {
    void onFileAdded(String path);
    void onFileDeleted(String path);
}
