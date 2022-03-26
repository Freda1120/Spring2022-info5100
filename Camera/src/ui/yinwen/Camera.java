package ui.yinwen;

public class Camera {
    private Camera(){}

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }
    private String cameraName = "";
    private static Camera _instance;
    private static Object obj = new Object();
    private static Camera getInstance(){
        if (_instance == null){
            synchronized (obj){
                if (_instance == null){
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }


}
