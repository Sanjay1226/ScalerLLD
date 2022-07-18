package designpattern.creationaldesignpattern.designImplementation.penDesign;

import designpattern.creationaldesignpattern.designImplementation.penDesign.strategies.writestrategies.WriteBehaviour;

public abstract class Pen {
    private String name;
    private String compny;
    private int price;
    private String brand;
    private PenType penType;
    private WriteBehaviour writeBehaviour;

    public void write(){
        this.writeBehaviour.write();
    }
    public abstract Color getColor();

     public Pen(PenType penType, WriteBehaviour writeBehaviour){
        this.penType = penType;
        this.writeBehaviour = writeBehaviour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompny() {
        return compny;
    }

    public void setCompny(String compny) {
        this.compny = compny;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public PenType getPenType(){
         return penType;
    }
}
