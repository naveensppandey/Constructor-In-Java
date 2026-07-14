package ConstructorsInJava;

public class Website {

    // fields (or instance variable)
    String webName;
    int webAge;

    // constructor
    Website(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args[]) {

        Website obj1 = new Website("Naveen", 22);
        Website obj2 = new Website("https://www.google.com/", 18); // Creating objects

        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge); // Accessing object data through reference variable
    }
}