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
public class StaticMessageReader implements MessageReader{
    private String message;
    
//    public StaticMessageReader(){
//        this.message = "Hello!";
//    }
//    public StaticMessageReader(String message){
//        this.message = message;
//    }
    
    
    @Override
    public String readMessage() {
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    
    }
}
 