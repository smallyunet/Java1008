package net.smallyu.java.designpattern.facade.cases1;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();
    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelop(address);
        // 警察检查信件
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
