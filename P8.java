import java.util.Scanner;
class fatherAgeEx extends Exception{
    public String toString(){
        return "fathers age < 0";
    }
}
class SonAgeEx extends Exception{
    int a;
    SonAgeEx(int age){
        a = age;
    }
    public String toString(){
        if(a<0)
            return "Son's age < 0";
        else
            return "Son>Father"; 
    }
}
class Father{
    public int age1;
    Scanner in = new Scanner(System.in);
    Father(){
        System.out.println("Enter fathers age : ");
        age1 = in.nextInt();
    }
    void ex1() throws fatherAgeEx{
        if(age1<0){
            throw new fatherAgeEx();
        }
    }
}

class Son extends Father{
    public int age2;
    Son(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sons age : ");
        age2 = in.nextInt();
    }
    void ex2() throws SonAgeEx{
        if((age1<age2)||(age2<0))
            throw new SonAgeEx(age2);
    }
}
class P8{
    public static void main(String[] args) {
        // Father f = new Father();
        Son s = new Son();
        try{
            s.ex1();
        }
        catch(fatherAgeEx e){
            System.out.println(e);
        }
        try{
            s.ex2();
        }
        catch(SonAgeEx e){
            System.out.println(e);
        }
    }
}