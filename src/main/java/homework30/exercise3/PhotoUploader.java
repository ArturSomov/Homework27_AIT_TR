package homework30.exercise3;


public class PhotoUploader implements Uploadable {


    @Override
    public void uploadMedia(String filePath) {
        if (checkFileType(filePath, ".jpg", ".png")) {
            System.out.println("Uploading photo: " + filePath);
        } else {
            System.out.println("Error: file " + filePath + " is not supported!");
        }
    }
}
