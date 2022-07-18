package designpattern.creationaldesignpattern.factory.factorymethod;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
