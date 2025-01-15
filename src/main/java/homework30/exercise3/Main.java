package homework30.exercise3;

public class Main {

    public static void main(String[] args) {

        Uploadable photoUploader = new PhotoUploader();
        Uploadable videoUploader = new VideoUploader();

        photoUploader.uploadMedia("test.jpg");
        photoUploader.uploadMedia("sky.png");
        photoUploader.uploadMedia("pass.pdf");
        photoUploader.uploadMedia("ticket.rtf");

        videoUploader.uploadMedia("film.mp4");
        videoUploader.uploadMedia("cartoon.mov");
        videoUploader.uploadMedia("rap.mp3");
        videoUploader.uploadMedia("river.avi");
    }
}
