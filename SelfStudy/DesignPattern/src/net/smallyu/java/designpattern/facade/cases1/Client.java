package net.smallyu.java.designpattern.facade.cases1;

public class Client {
    public static void main(String[] args) {
//        ILetterProcess letterProcess = new LetterProcessImpl();
//        letterProcess.writeContext("Hello, it's me, do you know who I am ?");
//        letterProcess.fillEnvelop("Happy Rad No.");
//        letterProcess.letterInotoEnvelope();
//        letterProcess.sendLetter();
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        String address = "Happy Rad No.";
        String context = "Hello, it's me, do you know who I am ?";
        hellRoadPostOffice.sendLetter(context, address);
    }
}
