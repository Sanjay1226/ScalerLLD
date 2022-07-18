package designpattern.creationaldesignpattern.designImplementation.penDesign;

import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.WriteBehaviour;

public class BallPen extends Pen implements RefilPen {

    public BallPen(WriteBehaviour writeBehaviour){
        super(PenType.BALL,writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

//    public BallPen(PenType penType) {
//        super(penType);
//    }

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
