class SumZeroExcp extends Exception{
    int s;
    SumZeroExcp(int sum){
        s = sum;
    }
    public String toString(){
        return "MyException "+s;
    }
}
class ExceptionDemo{
    public static void main(String[] args) throws SumZeroExcp{
        int a,b,sum;
        a = 0;
        b = a;
        sum = a+b;
        try{
        if(sum==0)
        throw new SumZeroExcp(0);
        }
        catch(SumZeroExcp e){
            System.out.println("EXCEPTION = "+e);
        }
    }
}