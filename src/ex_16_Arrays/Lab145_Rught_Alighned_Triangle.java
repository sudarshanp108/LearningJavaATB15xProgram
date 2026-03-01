package ex_16_Arrays;

public class Lab145_Rught_Alighned_Triangle {
    static void main(String[] args) {
        int n = 4;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) { // this loop for giving space
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {  // this loop for printing pattern
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
