import java.util.*;
public class arrayQuestions{
    public static int maximumInArray(int[] arr){
        int maximumVal=-(int)1e9;
        for(int i=0;i<arr.length();i++){
            if(arr[i]>maximumVal)   maximumVal=arr[i];
        }

        return maximumVal;
    }

    public static int minimumInArray(int[] arr){
        int minimumVal=(int)1e9;
        for(int i=0;i<arr.length();i++){
            if(arr[i]<minimumVal)   minimumVal=arr[i];
        }

        return minimumVal;
    }

    public static int findEleInArray(int[] arr,int data){
        for(int i=0;i<arr.length();i++){
            if(arr[i]==data)    return i;
        }

        return -1;
    }


    public static int spanOfArray(int[] arr){
        int minimumVal=minimumInArray(arr);
        int maximumVal=maximumInArray(arr);

        return maximumVal-minimumVal;
    }

    public static int[] sumOfTwoArrays(int[] arr1,int[] arr2){
        int n=arr1.length();
        int m=arr2.length();

        int r= n >m ? n : m;

        int[] ans=new int[r+1];

        int i=n-1,j=m-1,k=r;
         int carry=0;
         while(k>=0){
             int sum=carry;
             if(i>=0)   sum += arr[i--];
             if(j>=0)   sum += arr[j--];

             carry=sum/10;
             ans[k--]=sum%10;
            //  i--;
            //  j--;
            //  k--;
         }

         return ans;
    }

    public static int[] differenceOfTwoArrays(int[] arr1,int[] arr2){
        int n=arr1.length();
        int m=arr2.length();

        int r= n >m ? n : m;

        int[] ans=new int[r];

        int i=n-1,j=m-1,k=r-1;
         int borrow=0;
         while(k>=0){
             int num=borrow;
             if(i>=0)   num += arr[i--];
             if(j>=0)   num -= arr[j--];

             if(num <0){
                 num += 10;
                 borrow=-1;
             }else{
                 borrow=0;
             }

             ans[k--]=num;
            //  i--;
            //  j--;
            //  k--;
         }

         return ans;
    }

    public static void reverseAnArray(int[] arr){
        int i=0;
        int j=arr.length()-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

    public static void reverseToRotate(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    public static void rotateAnArray(int[] arr,int r){
        int n=arr.length();
        int k=(k%n +n) %n;
        reverseToRotate(arr,0,n-1);
        reverseToRotate(arr,0,k-1);
        reverseToRotate(arr,k,n-1)
    }

    public static int[] InverseOfArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n ;i++){
            ans[arr[i]]=i;
        }

        return ans;
    }

    public static void main(String args[]){

    }
}