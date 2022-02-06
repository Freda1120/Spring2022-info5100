package ui.yinwen;

public class Box {
    public double width;
    public double height;
    public double depth;
    public double s;

    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume(){
        s = width * height * depth;
        return s;
    }

}
