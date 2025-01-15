package homework30.exercise3;

public interface Uploadable {
    void uploadMedia(String filePath); // Метод для загрузки медиафайла

    default boolean checkFileType(String filePath, String... allowedExtensions) {
        for (String ext : allowedExtensions) {
            if (filePath.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}
