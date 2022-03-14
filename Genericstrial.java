// Write a program to demonstrate generics with multiple object parameters.
class P7 {
    Object ob;
    P7(Object o){
        ob = o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("TYPE = "+ob.getClass().getName());
    }
}
class P7Demo{
    public static void main(String[] args) {
        P7 obj;
        obj =  new P7(88);
        obj.showType();
        // Get the value of iOb. This time, a cast is necessary.
        int v = (Integer)obj.getOb();
        System.out.println("value: " + v);
        System.out.println();
        
        // Create another NonGen object and store a String in it.
        P7 strOb = new P7("Non-Generics Test");
        
        // Show the type of data used by strOb.
        strOb.showType();
        
        // Get the value of strOb.
        // Again, notice that a cast is necessary.
        String str = (String)strOb.getOb();
        System.out.println("value: " + str);
        
        // This compiles, but is conceptually wrong!
        obj = strOb;
        v = (Integer)obj.getOb(); // run-time error!
    }
}
