/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterFace_Sort;

/**
 *
 * @author Durjay
 */
    class SelectionSort implements Sortable{
    
    public void sort(int[] arr)
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            int minIndex=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=arr[minIndex];
        }
    }
}
