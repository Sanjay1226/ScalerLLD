package designpattern.creationaldesignpattern.designImplementation.penDesign;

import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.WriteBehaviour;

public class FountainPen extends Pen{

    public FountainPen(WriteBehaviour writeBehaviour) {

        super(PenType.FOUNTAIN,writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
