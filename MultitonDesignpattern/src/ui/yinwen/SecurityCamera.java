package ui.yinwen;

import java.util.HashMap;

public class SecurityCamera {
    private static HashMap<Integer, SecurityCamera> cameras = new HashMap<>();

    private SecurityCamera(){}

    private static Object obj = new Object();

    public static SecurityCamera getCamera(int id){

        if( !cameras.containsKey(id) ){
            synchronized (obj){
                if( !cameras.containsKey(id) ){
                    cameras.put(id, new SecurityCamera());
                }
            }
        }
        return cameras.get(id);

    }
}
