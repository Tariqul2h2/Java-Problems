/*  
When there is a class contains several methods with same name with same parameters but different implemetation is Overriding. Polymorphism applies in Overriding
Lets see an example:
*/

class Animal{
    public void move(){
        System.out.println("You can Move");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("Dog can Walk and Run");
    }
    public void berk(){
        System.out.println("Dog can Berk");
    }
}
public class Overriding{
    public static void main(String args[]){
        Animal a = new Animal();
        Dog b = new Dog();
        a.move();
        b.move();
        b.berk();
    }
}

/*
Output as follows: 
Animal can Move
Dog can Walk and Run
Dog can Berk
*/
