package designpattern.creationaldesignpattern.designImplementation.penDesign;

import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.SmoothWriteBehavoiur;
import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.WriteBehaviour;

public class GelPen extends Pen implements RefilPen{
    private Refil refil;
    private boolean canChangeRefil = false;

    private GelPen(WriteBehaviour writeBehaviour){
        super(PenType.GELL, writeBehaviour);
    }
    public static class Builder{
        private Refil refil;
        private boolean canChangeRefil = false;

        public Builder setRefil(Refil refil){
            this.refil = refil;
            return this;
        }
        public Builder setCanChangeRefil(boolean value){
            this.canChangeRefil = value;
            return this;
        }
        public  GelPen build(){
            GelPen gelPen = new GelPen(new SmoothWriteBehavoiur());
            gelPen.refil = this.refil;
            gelPen.canChangeRefil = this.canChangeRefil;
            return gelPen;
        }
    }
    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void chnageRefil(Refil newRefil) {

    }

    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
