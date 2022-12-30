public class SolidRombosPattern {

    public static void solidRombos(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        solidRombos(5);
       
        
    }
}
