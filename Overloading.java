/*
In a class with same type several methods but different parametres is called overloading.
Lets see an example.
*/

class Area{
    public void area(int x, int y){
        System.out.println("Area of Rectangle is: "+ x*y);;
    }
    public void area(float x){
        System.out.println("Area of Circle is: "+ 3.1416*x*x);;
    }
}

public class Overloading{
    public static void main(String args[]){
        Area a = new Area();
        a.area(4,5);
        a.area(5);
    }
}



/*
Output is follows:
Area of Rectangle is: 20                                                                         
Area of Circle is: 78.54
*/
