package designpattern.creationaldesignpattern.designImplementation.penDesign;

import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.WriteBehaviour;

public class Marker extends Pen implements RefilPen{

    public Marker(WriteBehaviour writeBehaviour){
      super(PenType.MARKER,writeBehaviour);
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void chnageRefil(Refil newRefil) {

    }
}
