import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1,v2,v3;
        System.out.println("Insira o valor da primeira variável: ");
        v1 = sc.nextInt();

        System.out.println("Insira o valor da segunda variável: ");
        v2 = sc.nextInt();

        v3 = v2;
        v2 = v1;
        v1 = v3;

        System.out.printf("Os valores finais são %d e %d",v1,v2);
    }
}
