package com.company;

public class GSM {
    String model;
    boolean hasSimCard;
    String simMobileNumber;
    double outgoingCallsDuration;
    double lastIncomingCall;
    double lastOutgoingCall;

    GSM(String model){
        this.model = model;
        this.hasSimCard = false;
        this.simMobileNumber = null;
        this.outgoingCallsDuration = 0;
        this.lastIncomingCall = 0;
        this.lastOutgoingCall = 0;
    }
    public void insertSimCard(String simMobileNumber){
        if(simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8' && simMobileNumber.length() == 10){
            this.hasSimCard = true;
            this.simMobileNumber = simMobileNumber;
        }
    }
    public void removeSimCard(){
        this.hasSimCard = false;
        this.simMobileNumber = null;
    }
    public void call(GSM reciever,double duration){
        if(reciever != this && duration > 0 && reciever.hasSimCard && this.hasSimCard){
            Call call = new Call(this,reciever,duration);
            this.lastOutgoingCall = duration;
            this.outgoingCallsDuration += duration;
            reciever.lastIncomingCall = duration;
        }
    }
    public double getSumForAll(){
        return this.outgoingCallsDuration * Call.priceForAminute;
    }
    public void printForTheLastOutgoingCall(){
        if(this.lastOutgoingCall != 0){
            System.out.println("last outoging call duration : " + lastOutgoingCall);
        }
    }

    public void printForTheLastIncomingCall(){
        if(lastIncomingCall != 0){
            System.out.println("last ougoing call duration: " + lastIncomingCall);
        }
    }
}
