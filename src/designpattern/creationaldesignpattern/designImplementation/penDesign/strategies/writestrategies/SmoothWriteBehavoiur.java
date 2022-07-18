package designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies;

public class SmoothWriteBehavoiur implements WriteBehaviour {
    @Override
    public void write() {
        System.out.println("Write smothly");
    }
}
