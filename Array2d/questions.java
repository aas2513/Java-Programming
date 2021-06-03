public class questions{
    // input and output of 2d array
    public static Scanner scn= new Scanner(System.in);

    public static void inputOutput(){
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
    }

    public static void waveTraversal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        for(int j=0;j<m;j++){
            if(j % 2 == 0){
                for(int i=0;i<n;i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(int i=n-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void exitPointOfmatrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int i=0,j=0,d=0;

        while(true){
            d= (d+ arr[i][j])%4;

            if(d==0){
                j++;
                if(j==m){
                    System.out.println(i + " " + j-1);
                    break;
                }
            }
            if(d==1){
                i++;
                if(i==n){
                    System.out.println(i-1 + " " + j);
                    break;
                }
            }
            if(d==2){
                j--;
                if(j==-1){
                    System.out.println(i + " " + j+1);
                    break;
                }
            }
            if(d==3){
                i--;
                if(i==-1){
                    System.out.println(i+1 + " " + j);
                    break;
                }
            }
        }

    }

    public static void printDiagonal(int[][] arr){
        int n=arr.length, m=arr[0].length;

        for(int gap=0;gap<m;gap++){
            for(int i=0;j=gap;i<n && j<m;i++,j++){
                System.out.pritnln(arr[i][j]);
            }
        }
    }

    public static void rotateBy90Degree()
    public static void sprialDisplay(int[][] arr){

    }

    public static int saddlePoint(int[][] arr){

    }

    public static int searchInSorted2dArray(int[][] arr){

    }


}