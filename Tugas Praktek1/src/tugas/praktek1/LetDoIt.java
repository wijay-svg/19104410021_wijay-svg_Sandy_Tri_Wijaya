/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktek1;

/**
 *
 * @author AXZ
 */
public class LetDoIt {

    String uname;
    public String setUname(String Sandy)
    {
        this.uname = Sandy;
        return null;
    }
    public static void main(String[] args) {
       LetDoIt ldi = new LetDoIt();
       ldi.setUname("Lets Do It");
       System.out.println(ldi.uname);
    }
    
}
