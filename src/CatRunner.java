public class CatRunner {
    public static void main(String[] arg){
        Cat cat1 = new Cat("Bob", 4, 12.0);
        Cat cat2 = new Cat("john", 5, 14.0);
        Cat cat3 = new Cat("Billy", 8 , 15.0);

        cat1.printCatInfo();
        cat1.introduce();

        cat2.printCatInfo();
        cat2.introduce();
        cat2.greeting();





    }
}
