package com.ioc.coupling.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");

        // Connect with one Database
//      UserDataProvider userDataProvider= new UserDatabase();
//          UserManager userManager = new UserManager(userDataProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerwithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());


        // Connect with another database
        //UserDataProvider WebServiceDataProvider= new WebServiceDataProvider();
        UserManager userManagerWithWs = (UserManager) context.getBean("userManagerwithWebServiceDataProvider");
        System.out.println(userManagerWithWs.getUserInfo());

//        // Connect with Another Database
//        UserDataProvider NewDataBase = new NewDatabaseProvider();
     UserManager userManagerwithNewData = (UserManager) context.getBean("userManagerwithNewDatabaseProvider");
       System.out.println(userManagerwithNewData.getUserInfo());
//
//        // Connect with Another Database
//        UserDataProvider addNewDatabase = new AddNewDatabase();
//        UserManager addManager = new UserManager(addNewDatabase);
//        System.out.println(addManager.getUserInfo());
    }
}
