// The General Form of a Generic Class

// The generics syntax shown in the preceding examples can be generalized. Here is the syntax for declaring a generic class:
// class class-name<type-param-list > { // ...

// Here is the full syntax for declaring a reference to a generic class and instance
// creation:
// class-name<type-arg-list > var-name =
// new class-name<type-arg-list >(cons-arg-list);

// Write a program to demonstrate generics with multiple object parameters.

class Gen<T>{           // Here, T is a type parameter that will be replaced by a real type when an object of type Gen is created.
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T : "+ob.getClass().getName());
    }
}

class GenericsSingleParameter{
    public static void main(String[] args){
        Gen<Integer> iOb = new Gen<Integer> (88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value of v : "+v);

        Gen<String> Obstr = new Gen<String>("Umang Goel");
        Obstr.showType();
        String str = Obstr.getOb();
        System.out.println("Value of str = "+str);
    }
}
