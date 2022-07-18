package designpattern.creationaldesignpattern.factory.factorymethod;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
