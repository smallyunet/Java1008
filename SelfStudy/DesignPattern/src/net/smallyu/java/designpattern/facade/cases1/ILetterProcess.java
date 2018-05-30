package net.smallyu.java.designpattern.facade.cases1;

public interface ILetterProcess {
    public void writeContext(String context);
    public void fillEnvelop(String address);
    public void letterInotoEnvelope();
    public void sendLetter();
}
