class constructor{
    int age;
    String name;
    //parameterized constructor
    constructor(int age, String name){
        this.age = 21;
        this.name = "Shaguftha";
    
    }
    //default constructor
    constructor(){
        this.age = 22;
        this.name = "ayesha";
        

    }
    //main method
    public static void main(String[] args) {
        constructor obj1 = new constructor(21, "Shaguftha");
        constructor obj2 = new constructor();
        System.out.println("Age: " + obj1.age);
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj2.age);
        System.out.println("Name: " + obj2.name);
    }

}
