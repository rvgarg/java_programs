interface p1 {
    default void show() {
        System.out.println("p1");
    }
}
interface p2{
    default void show() {
        System.out.println("p2");
    }
}

class testclass implements p1,p2 
{
    public static void main(String[] args) {
        testclass d= new testclass();
        d.show();
    }
    public void show(){
        p1.super.show();
        p2.super.show();
    }
}