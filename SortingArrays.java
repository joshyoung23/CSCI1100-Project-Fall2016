

import java.util.Scanner;

public class SortingArrays{
   public static void main(String[] args){
      
      Scanner kb = new Scanner(System.in);
      
      System.out.print("How many numbers do you want to enter? : ");
      int num = kb.nextInt();
      
      int[] unsort = new int[num];
      
      for (int i = 0 ; i < num ; i++){
         System.out.print("Enter number "+(i+1)+" : ");
         unsort[i] = kb.nextInt();
         System.out.println();
      }
      for (int i = 0; i < unsort.length ; i++){
         System.out.print(unsort[i]+" ");
      }
      
      int swap[] = swap(unsort);
      
      System.out.println();
      
      for (int i = 0; i < swap.length ; i++){
         System.out.print(swap[i]+" ");
      }  
      
      int sort[] = sort(swap);
      
      System.out.println();
      
      for (int i = 0; i < sort.length ; i++){
         System.out.print(sort[i]+" ");
      }   
      
      int sortX[] = sortX(swap);
      
      System.out.println();
      
      for (int i = 0; i < sort.length ; i++){
         System.out.print(sortX[i]+" ");
      }
         
      
      
//       int mark = 85;
//       int newMark = mark;
//       
//       int[] array1 = {12,10,8};
//       int[] array2 = array1;
//       int[] arr = new int[10];
//       
//       System.out.print("enter 10 numbers: ");
//       
//       for ( int i : arr )
//          arr[i] = kb.nextInt();
//       
//       int[] largeArr = increaseSize(arr, 10);
//       
//       for ( int i : array1 )
//          System.out.print(i+" ");
//       
//       System.out.println();
//       
//       for (int i : array2)
//          System.out.print(i+" ");
   }
   
   public static int[] increaseSize( int[] nums, int increase ){
      int[] newArr = new int[nums.length+increase];
      for (int i = 0; i < nums.length; i++)
         newArr[i] = nums[i];
      return newArr;
   }
   
   public static boolean equals(int[] a, int[] b){
      boolean result = true;
      if (a.length != b.length)
         result = false;
      for (int i = 0; i < a.length && result==true; i++){
         if(a[i] != b[i])
            result = false;
      }
      return true;
   }
   
   public static int[] swap(int[] unsort){
      int temp = unsort[0];
      unsort[0] = unsort[unsort.length-1];
      unsort[unsort.length-1] = temp;
      return unsort;
   }               
   
   public static int[] sort(int[] disord){
      int runCounter = 0;
      if (disord.length > 1){
         for (int x = 0 ; x < disord.length ; x++){
            for (int i = 0 ; i < disord.length-1 ; i++){
               if (disord[i] < disord[i+1]){
                  int temp = disord[i];
                  disord[i] = disord[i+1];
                  disord[i+1] = temp;
                  runCounter += 1;
               }
            }
            runCounter += 1;
         }   
         System.out.print("\nSort runCounter is: "+runCounter);
         return disord;
      }
      else {
         return disord; 
      }   
   }      
   
   public static int[] sortX(int[] num){
      
      int runCounter = 0;
      //break the array into two seperate arrays
      
      if (num.length % 2 == 0 && num.length > 1){
         int[] temp = new int[num.length/2];
         int[] temp2 = new int[num.length/2];
         
         //fill temp array #1 with half of num array
         for (int i = 0 ; i < temp.length ; i++){
            temp[i] = num[i];
            runCounter += 1;
         }   
         //fill temp2 array with second half of num array
         for (int i = 0 ; i < temp2.length  ; i++){
            temp2[i] = num[temp2.length+i];
            runCounter += 1;
         }   
        
         //run the sort method to sort the temp arrays
         int[] tempX = sort(temp);
         int[] temp2X = sort(temp2);
         int[] numX = new int[temp.length+temp2.length];
         
         //start filling the numX array back up in order
         for (int i = 0 ; i < temp.length ; i++){
            numX[i] = tempX[i];
            runCounter += 1;
         }   
         //fill the second half of the numX array
         for (int i = 0 ; i < temp2.length ; i++){
            numX[tempX.length+i] = temp2X[i];
            runCounter += 1;
         }
         System.out.print("\nThe runCounter for SortX is : "+runCounter);
         return numX;
      }
      else if (num.length % 2 != 0 && num.length > 1){   
         int[] temp = new int[num.length/2];
         int[] temp2 = new int[(num.length/2)+1];
         
         //fill temp array #1 with half of num array
         for (int i = 0 ; i < temp.length ; i++){
            temp[i] = num[i];
            runCounter += 1;
         }   
         //fill temp2 array with second half of num array
         for (int i = 0 ; i < temp2.length  ; i++){
            temp2[i] = num[(temp2.length-1)+i];
            runCounter += 1;
         }   
        
         //run the sort method to sort the temp arrays
         int[] tempX = sort(temp);
         int[] temp2X = sort(temp2);
         int[] numX = new int[temp.length+temp2.length];
         
         //start filling the numX array back up in order
         for (int i = 0 ; i < tempX.length ; i++){
            numX[i] = tempX[i];
            runCounter += 1;
         }   
         //fill the second half of the numX array
         for (int i = 0 ; i < temp2.length ; i++){
            numX[(temp2X.length-1)+i] = temp2X[i];
            runCounter += 1;
         }
         System.out.print("\nThe runCounter for SortX is : "+runCounter);
         return numX;
      }    
      else { 
         return num;
      }     


   }   
}       