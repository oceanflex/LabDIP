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
public class Startup {
    public static void main(String[] args) {
        MessageReader reader = new StaticMessageReader();
        MessageOutput writer = new ConsoleMessageOutput();
        MessagingService message = new MessagingService(reader, writer);
    }
}
