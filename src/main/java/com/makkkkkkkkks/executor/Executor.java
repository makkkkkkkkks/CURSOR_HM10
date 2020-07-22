package main.java.com.makkkkkkkkks.executor;


import main.java.com.makkkkkkkkks.builder.Employee;
import main.java.com.makkkkkkkkks.builder.EmployeeBuilder;

import main.java.com.makkkkkkkkks.chainOfResponsibility.Mail;
import main.java.com.makkkkkkkkks.chainOfResponsibility.MailChain;
import main.java.com.makkkkkkkkks.singleton.Singleton;

public class Executor {
    public static void execute() {
        System.out.println("Patern Builder");
        Employee employee = new EmployeeBuilder()
                .setDepartment("Department")
                .setName("UserTwo")
                .setAge(12)
                .build();
        System.out.println(employee);
        System.out.println(" ");

        System.out.println("Patern Singleton");
        Singleton singleton = Singleton.getInstance();
        singleton.check();
        System.out.println(" ");

        System.out.println("Patern Chain of Responsibility");
        MailChain mailChainObj = new MailChain();
        mailChainObj.getChain().forwardMail(new Mail("SPAM_MAIL"));
        mailChainObj.getChain().forwardMail(new Mail("FAN_MAIL"));
        mailChainObj.getChain().forwardMail(new Mail("COMPLAINT_MAIL"));
        mailChainObj.getChain().forwardMail(new Mail("NEW_LOC_MAIL"));
    }
}


