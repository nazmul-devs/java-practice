public class Pattern {

    public static void solidRectangle(int row, int col) {

        for(int i=1; i<=row; i++){
            for(int j =1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
if (i==1 || j==1 || i==row || j==col) {
    System.out.print("* " + i);
    
}else{
    System.out.print(" ");
}
            }
            System.out.println();
            
        }
        
    }


    public static void halfPyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

public static void halfPyramidNums(int num) {

    for(int i=1; i<=num ; i++){

        for (int j = 1; j <=i; j++) {
            System.out.print(j +" ");            
        }

        System.out.println();
    }
    for(int i=num; i>0 ; i--){

        for (int j = i-1; j >0; j--) {
            System.out.print(i-j +" ");            
        }

        System.out.println();
    }
    
}
public static void floydPyrimid(int num) {

    for(int i=1; i<=num ; i++){

        for (int j = 1; j <=i; j++) {
            System.out.print(j + i +" ");            
        }

        System.out.println();
    }
   
    
}
public static void zeroOneTringle(int num) {

    for(int i=1; i<=num ; i++){

        for (int j = 1; j <=i; j++) {
            if((i+j)%2==0)         {
System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }

        System.out.println();
    }
   
    
}
    public static void main(String[] args) {
    // solidRectangle(4,10);
    // hollowRectangle(4,4);
    // halfPyramid(5);
    // halfPyramidNums(5);
    // floydPyrimid(5);
    zeroOneTringle(5);
    
}    
}