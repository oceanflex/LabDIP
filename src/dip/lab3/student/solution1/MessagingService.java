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
public class MessagingService {
    private String message;
    private MessageReader reader;
    private MessageWriter writer;
    
    
    public MessagingService(MessageReader reader, MessageWriter writer){
        this.reader = reader;
        this.writer = writer;
        setMessage(reader.readMessage()); 
        writer.writeMessage(getMessageString());
    }
    
    private void setMessage(String message){
        this.message = message;
    }
    
    private String getMessageString(){
        return this.message;
    }
}
