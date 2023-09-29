// Cat class definition
import java.util.Scanner;

public class Cat {
    Scanner scan = new Scanner(System.in);
    // instance variables
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {

        if(age < 7) {
            System.out.println("Hi my name is  " + name + ", I am a younger cat");

        }
        else {
            System.out.println("Hi, my name is " + name + ", I am a older cat");
        }
    }

    public void greeting(){
        System.out.println("Hello what is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello " +  name);
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

