import java.util.Scanner;
class practice_6{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int n = ip.nextInt();
        int[][] matrix = new int[n][n];
        boolean complete=true;
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ip.nextInt();
                if(matrix[i][j]!=1){
                    complete=false;
                }
            }
        }
        int x_axis=0;
        int y_axis=0;
        int size=0;
        System.out.println();
        for(int count=n-1;count>0;count--){
            if(complete){
                size=n;
                System.out.println("The Maximum square submatrix is at (" + x_axis + ", " + y_axis + ") with size " + size);
                break;
            }
            for(int i=0;i<(n-count+1);i++){
                for(int j=0;j<(n-count+1);j++){
                    boolean flag=true;
                    for(int x=i;x<(i+count);x++){
                        for(int y=j;y<(j+count);y++){
                            if(matrix[x][y]!=1){
                                flag=false;
                                break;
                            }
                        }   
                    }
                    if(flag){
                        if(count>=size){
                            x_axis=i;
                            y_axis=j;
                            size=count;
                            System.out.println("The Maximum square submatrix is at (" + x_axis + ", " + y_axis+ ") with size " + size);
                        }   
                    }
                }
            }
        }    
    }
}