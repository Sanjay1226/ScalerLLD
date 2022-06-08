package Constructor;

public class Main {
    public static void main(String[] args) {
        //Object creation
        Student karthik = new Student();

        karthik.age = 18;
        karthik.state = "ACTIVE";
        karthik.pauseCourse();
        karthik.karthik(); //Method called karthik in student

        //Object creation
        Student naman  = new Student("Naman",null);
        naman.batch = "Best batch of Scaler";
        naman.karthik();

        //Calling default constructor for Student class
        Student prakesh = new Student();
        System.out.println();

        //Copy Constructor
        Student karthikCopy = new Student(karthik);
        System.out.println(karthik.age);

        System.out.println("--Constructor Copy same value---");
        karthikCopy.address = "Text";
        System.out.println("Karthik Original value : "+karthik.age);
        System.out.println("Karthik Copy value : "+karthikCopy.age);



    }
}
