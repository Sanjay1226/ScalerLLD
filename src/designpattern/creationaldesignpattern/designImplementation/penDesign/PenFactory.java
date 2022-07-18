package designpattern.creationaldesignpattern.designImplementation.penDesign;

public class PenFactory {
    public static GelPen.Builder createGelPen(){
        return new GelPen.Builder();
    }
}
