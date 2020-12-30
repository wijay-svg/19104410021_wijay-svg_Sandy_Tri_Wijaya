/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author AXZ
 */
public class Overload {
public double hasil;
    
    public double pangkat(double inputY)
    {
        return hasil = Math.pow(inputY, 2);
    }
    public double pangkat(double inputX, double inputY)
    {
        return hasil = Math.pow(inputX,inputY);
    }
    void showHasil()
    {
        System.out.println("Hasil exponential : "+hasil);
    }
    public static void main(String[] args) 
    {
        Overload exp = new Overload();
        exp.pangkat(2);
        exp.showHasil();
        
        exp.pangkat(4, 3);
        exp.showHasil();
    }
    
}
