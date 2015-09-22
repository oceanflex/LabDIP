/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Zachary
 */
public class ConsoleMessageOutput implements MessageOutput{

    @Override
    public void writeMessage(String write) {
        System.out.println(write);
    }
    
}
