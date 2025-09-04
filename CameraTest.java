public class CameraTest {
    public static void main(String[] args) {
        //2 Kamera masing-masing 1 remote
        Camera remote1 = new Camera();
        Camera remote2 = new Camera();

        remote1.play();
        remote2.play();

        //1 Kamera 2 remote
        Camera remote3 = new Camera();
        Camera remote4 = remote3;
        remote3.play();
        remote4.Stop();

        Camera remote5 = new Camera();
        remote5.play();

        
    }
}
