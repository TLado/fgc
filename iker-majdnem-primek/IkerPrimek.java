import java.util.ArrayList;

public class IkerPrimek {
    public boolean isMajdnemPrim(int num) {
        ArrayList<Integer> primTenyezok = new ArrayList<Integer>();
        for (int p = 2; p <= num; p++) {
            while (num % p == 0) {
                primTenyezok.add(p);
                num = num / p;
            }
        }
        if (primTenyezok.size() == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isIkerMajdnemPrimek(int num1, int num2) {
        if (isMajdnemPrim(num1) && isMajdnemPrim(num2) && Math.abs(num1-num2) == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
