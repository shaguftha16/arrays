public class Stringmethods {
    public static void main(String[] args) {
        String s1 =" hello";
        String s2 =" good morning";
        System.out.println("string length" + s1.length());
        System.out.println("string length" + s2.length());
        System.out.println("string equals"+ s1.equals(s2));
        System.out.println("string concatination" + s1.concat(s2));
        System.out.println("string upper case" + s1.toUpperCase());
        System.out.println("string lower case" + s1.toLowerCase());
        System.out.println("string trim" + s1.trim());
        System.out.println("string replace" + s1.replace('h','H'));
    }
} 

