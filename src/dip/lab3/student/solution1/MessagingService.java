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
    private MessageOutput sender;
    
    
    public MessagingService(MessageReader reader, MessageOutput sender){
        setReader(reader);
        setOutput(sender);
        readMessage(); 
        sendMessage();
    }
    
    public final void readMessage(){
        setMessage(this.reader.readMessage());
    }
    
    public final void sendMessage(){
        this.sender.sendMessage(getMessageString());
    }
    
    public final void setReader(MessageReader reader){
        this.reader = reader;
    }
    
    public final void setOutput(MessageOutput sender){
        this.sender = sender;
    }
    
    private void setMessage(String message){
        this.message = message;
    }
    
    private String getMessageString(){
        return this.message;
    }
}
