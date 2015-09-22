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
        MessageReader stable = new StaticMessageReader();
        MessageOutput console = new ConsoleMessageOutput();
        MessageReader keyboard = new KeyboardMessageReader();
        MessageOutput gui = new JOptionPaneMessageOutput();
        MessagingService message = new MessagingService(stable, console);
        message.setReader(keyboard);
        message.readMessage();
        message.sendMessage();
        message.setOutput(gui);
        message.sendMessage();
    }
}
