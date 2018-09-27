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
public class BMI {
    public static String getBMI(double height, double weigh){
        double BMI = weigh/(height*height);
        if(BMI < 18.5) return "Thieu Can";
        if(BMI >= 18.5&&BMI <= 22.99) return "Binh Thuong";
        if(BMI >= 23 && BMI <= 24.99) return "Thua Can";
        if(BMI > 25) return "Beo Phi";
        return null;
    }
}
