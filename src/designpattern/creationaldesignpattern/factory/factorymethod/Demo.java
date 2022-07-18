package designpattern.creationaldesignpattern.factory.factorymethod;

public class Demo {
    private static Dialog dialog;

    static void configure(){
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    static void runBusinessLogic(){
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}
