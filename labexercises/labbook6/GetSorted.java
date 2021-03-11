package com.cg.lb;

public class GetSorted {
	static void rvereseArray(int arr[],
            int start, int end)
{
int temp;
  
while (start < end)
{
    temp = arr[start]; 
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
} 
}     


static void printArray(int arr[], int size) {
for (int i = 0; i < size; i++)
     System.out.print(arr[i] + " ");
  
 System.out.println();
} 

public static void main(String args[]) {
 
int arr[] = {3, 2, 4, 6, 7, 9};
printArray(arr, 6);
rvereseArray(arr, 0, 5);
System.out.print("Reversed array is \n");
printArray(arr, 6); 

}

}
