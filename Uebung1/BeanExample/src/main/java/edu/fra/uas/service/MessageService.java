package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private String message;
    private int counter = 0;

    public int increment(){
        counter++;
        return counter;
    }
    public int getCounter(){
        return counter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
