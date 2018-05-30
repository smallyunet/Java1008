package net.smallyu.java.designpattern.facade.cases1;

public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了……");
    }
}
