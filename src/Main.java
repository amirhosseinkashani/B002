import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        human amir = new human();
        System.out.println("enter ghad: ");
        amir.setGhad(inp.nextInt());
        System.out.println("enter vazn: ");
        amir.setVazn(inp.nextInt());
        //System.out.println("enter name: ");
        //amir.setName(inp.next());
        //amir.show_mbi_info();
        human ali = new human();
        ali = amir.copy(ali);
        ali.show_mbi_info();



    }
}
