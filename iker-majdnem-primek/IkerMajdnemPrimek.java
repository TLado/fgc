import java.util.Scanner;

public class IkerMajdnemPrimek {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy n számot: ");
        int n = Integer.parseInt(sc.nextLine());
        
        IkerPrimek ip = new IkerPrimek();

        int prev = 4; // első iker-prím
        for (int p = 6; p < n; p++) {
            if (ip.isIkerMajdnemPrimek(prev, p)) {
                System.out.println(String.format("%s %s", prev, p));
            }
            prev = p;
        }

        sc.close();

    }
}