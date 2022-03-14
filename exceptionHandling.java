import java.util.Scanner;
// Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called
// “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the 
// age and throws the exception WrongAge( ) when the input age<0. In Son class, implement a
// constructor that compares both father and son’s age and throws an exception if
// son’s age is >=father’s age.
class WrongAge extends Exception{
    int age;
    WrongAge(int a){
        age = a;
    }
    public String toString(){
        return "Daddy negative";
    }
}
class SonElder extends Exception{
    int age;
    SonElder(int a){
        age = a;
    }
    public String toString(){
        return "SON>FATHER HOW ?";
    }
}
class Father{
    Scanner in = new Scanner(System.in);
    Father()throws WrongAge{
        System.out.println("Enter Father age : ");
        int age = in.nextInt();
        if(age<0)
            throw new WrongAge(age);
    }
}

class Son extends Father{
    Son(){
        System.out.println("Enter son's age : ");
        
    }
    void ex(int sonAge, int fatherAge) throws SonElder{
            throw new SonElder(sonAge);
    }
}

class exceptionHandling{
    public static void main(String[] args){
        Father obj1 = new Father();
        try{
        Son obj2 = new Son(5,3);
        }
        catch(SonElder e){
            System.out.println(e);
        }
    }
}