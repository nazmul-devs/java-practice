public class Pyramid {

    public static void starPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }
    public static void numberPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }        
    }
    public static void palindromicPyramid(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("  ");
            }           
            for(int j=1; j<=i; j++){
                System.out.print(i-j+1+" ");
            }
            
            if(i>1){
                for(int j=i; j>1; j--){
                    System.out.print(i-j+2+" ");
                }
            }
           
            System.out.println();
        }        
          
    }
    public static void main(String[] args) {
        // starPyramid(10);
        numberPyramid(5);
        // palindromicPyramid(5);
    }
}
