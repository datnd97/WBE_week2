/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seeson2_week2;

/**
 *
 * @author DATVN
 */
public class TH_findMin_nd {
    public static void main(String[] args) {
        int arr[] = {4,12,7,8,1,6,9};
        int index = minValue(arr);
        System.out.println("v tri co phan tu gia tri nho nhat la: "+arr[index]);
            
    }
    public static int minValue(int []array)
    {
        int min = array[0];
        int index = 0 ;
        for(int i = 1;i < array.length;i++)
        {
            if(array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        return index;
    } 
    
}
