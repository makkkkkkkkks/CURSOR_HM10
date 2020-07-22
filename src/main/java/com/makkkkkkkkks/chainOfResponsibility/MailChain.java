package main.java.com.makkkkkkkkks.chainOfResponsibility;

public class MailChain {

    private Handler chain;

    public MailChain() {
        this.chain = new SpamHandler();
        Handler fanHandlerObj = new FanHandler();
        Handler complaintHandlerObj = new ComplaintHandler();
        Handler newLocketHandlerObj = new NewLocHandler();

        chain.setNextChain(fanHandlerObj);
        fanHandlerObj.setNextChain(complaintHandlerObj);
        complaintHandlerObj.setNextChain(newLocketHandlerObj);
    }

    public Handler getChain() {
        return chain;
    }

    public void setChain(Handler chain) {
        this.chain = chain;
    }
}

