/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author VŨ ĐỨC
 */
public class findMinInArray {
    public static int findMin(int arr[]){
       int min = arr[0];
        for(int i = 1 ; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
         return min;
    }
}
