public class demo {
    static   void display(int age){
        System.out.println("age is"+age);
    }
    static void display (String name,int number){
        System.out.println("name is"+name + " \n number is \n" +number);
    }
    static void display(float password){
        System.out.println("password is:" + password);
    }

    public static void main(String[] args) {
        display(21);
        display("shaguftha",22111999);
        display(3322.4f);
    }

}
