package homework30.exercise3;

public class VideoUploader implements Uploadable {
    @Override
    public void uploadMedia(String filePath) {
        if (checkFileType(filePath, ".mp4", ".mov")) {
            System.out.println("Uploading video: " + filePath);
        } else {
            System.out.println("Error: file " + filePath + " is not supported!");
        }
    }
}
