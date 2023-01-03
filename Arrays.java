public class Arrays {
    public static void main(String[] args) {
        // 1D array 
        int arraySize = 3;
        String[] names = new String[arraySize];
        names[0]="Nazmul";
        names[1]="Merie";
        names[2]="Samia";

        // print array 
        for(int i =0; i<arraySize; i++){

            // System.out.println(names[i]);

        }

        // another 1D array 
        int[] nums = {44,66,77,22,86};

        int numArrSize = nums.length;

        int sumOfNums = 0;

        for(int i=0;i<numArrSize; i++){

            // System.out.println(nums[i]);

            sumOfNums+=nums[i];
        }
        


        // 2D array --- array size => [row][column]

        String[][] students ={{"Rakib", "Salam", "Kuddus", "Razu"},{"Samia", "Merie" , "Meena"}};

        // print 2D array

        int studentRowSize = students[0].length;
        int studentColSize = students[1].length;
        // columns
        for(int i=0; i<studentColSize; i++){
            // rows
            for(int j =0; j<studentRowSize; j++){

                System.out.print(students[i][j] + " ");

            }

            System.out.println();

        }

    
    }
    
}
