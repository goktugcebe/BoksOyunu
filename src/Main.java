public class Main {
    public static void main(String[] args) {
    Fighter f1=new Fighter("Ahmet",10,120,90,30);
    Fighter f2=new Fighter("Mehmet",20,85,85,40);

    Match match=new Match(f1,f2,80,95);
    match.run();

    }
}
