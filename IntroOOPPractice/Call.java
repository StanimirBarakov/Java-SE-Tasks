package com.company;

public class Call {
    static double priceForAminute;
    GSM caller;
    GSM reciever;
    double duration;
    Call(GSM caller, GSM reciever, double duration){
        this.caller = caller;
        this.reciever = reciever;
        this.duration = duration;
    }
}
