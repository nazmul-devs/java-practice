public class ButterflyPattern{


    public static void butterFly(int n) {
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        
        for(int i = n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            for(int k=2*(n-i); k>=1; k--){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();

        }
        
    }
    public static void main(String[] args){
        butterFly(7);
        
    }
}