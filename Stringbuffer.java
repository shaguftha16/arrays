public  class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.replace(6, 10, "Programming");
        System.out.println(sb);
        sb.delete(5, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
    
}
