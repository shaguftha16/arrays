class keyword {
    
        int id;
        String college ;
    
    public keyword(int id, String college){
        this.id=id;
        this.college=college;
    }
    void display(){
        System.out.println(id+" "+college);
    }
    public static void main(String args[]){
        keyword s1 = new keyword(140, "Bapuji institute");
        keyword s2 = new keyword(64, "vision");
        s1.display();
        s2.display();
    }
}
