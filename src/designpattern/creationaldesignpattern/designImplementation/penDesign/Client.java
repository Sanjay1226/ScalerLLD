package designpattern.creationaldesignpattern.designImplementation.penDesign;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
       /* for (Pen pen : pens) {
            // if(pen instanceof BallPen){}
            //if(pen.getPenType().equals(PenType.GELL)){}
        }
        */

        GelPen gelPen = PenFactory
                .createGelPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build();

        GelPen reynoldsTrimaxPen = PenFactory
                .createGelPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build();
        reynoldsTrimaxPen.setName("Trimax");
        reynoldsTrimaxPen.setCompny("Reynolds");
    }
}