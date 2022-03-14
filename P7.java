class TwoGen<T,V>{
    T ob1;
    V ob2;
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        System.out.println("Type of T : "+ob1.getClass().getName());
        System.out.println("Type of V : "+ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
class P7{
    public static void main(String[] args) {
        TwoGen<Integer, String> obj1 = new TwoGen<Integer, String>(11,"Generics");
        obj1.showTypes();
        int v = obj1.getOb1();
        System.out.println("value: " + v);
        String str = obj1.getOb2();
        System.out.println("value: " + str);
    }
}