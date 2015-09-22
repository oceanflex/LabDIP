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
        MessageReader welcome = new WelcomeStaticMessage();
        //MessageOutput console = new ConsoleMessageOutput();
        //MessageReader keyboard = new KeyboardMessageReader();
        MessageReader hello = new HelloStaticMessage();
        MessageOutput gui = new JOptionPaneMessageOutput();
        MessagingService message = new MessagingService(welcome, gui);
        //message.setReader(keyboard);
        //message.setOutput(gui);
        //message.serveMessage();
        message.sendReaderUpdate(hello);
    }
}
