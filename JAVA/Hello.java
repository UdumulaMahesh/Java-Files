class Hello
 {
    
    void display()
     {
        System.out.println("Hello from a method");
     }
     void display1(int i)
     {
        System.out.println("i is:"+i);
     }
    public static void main(String[]args)
    {
        Hello obj=new Hello();
        obj.display();
        obj.display1(100);
        System.out.println("hello world");

    }
 }