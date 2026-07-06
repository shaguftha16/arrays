public class methodoverloading {
    void display(int age){
      System.out.println("Age is: " + age);  
    }
    void display(String name){
        System.out.println("Name is: " + name);
    }
    void  display(String name,int age){
        System.out.println("Age is: " + age + " and Name is: " + name);
    }
    void display(String name, int age,int id){
        System.out.println("Name is: " + name + " and Age is: " + age + " and ID is: " + id);
    }
    void display(int id, String password){
        System.out.println("ID is: " + id + " and password is: " + password );
    }
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.display(25);
        obj.display("John");
        obj.display(30, "Alice");
        obj.display("Bob", 28, 12345);
        obj.display(67890, "mypassword");
    }
}
