/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author Zachary
 */
public class JOptionPaneMessageWriter implements MessageWriter{

    @Override
    public void writeMessage(String write) {
        JOptionPane.showMessageDialog(null,write);
    }
    
}
