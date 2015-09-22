/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Zachary
 */
public class KeyboardMessageReader implements MessageReader{
    private String justIn;

    @Override
    public String readMessage() {
        Scanner in = new Scanner(System.in);
        justIn = in.nextLine();
        
        return justIn;
    }
    
}
