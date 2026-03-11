package com.loose.coupling;

public class LooseCoupling {

    public static void main(String[] args) {


        // Connect with one Database
      UserDataProvider userDataProvider= new UserDatabase();
          UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());


        // Connect with another database
        UserDataProvider WebServiceDataProvider= new WebServiceDataProvider();
        UserManager workerManager = new UserManager(WebServiceDataProvider);
        System.out.println(workerManager.getUserInfo());

        // Connect with Another Database
        UserDataProvider NewDataBase = new NewDatabaseProvider();
        UserManager newManager = new UserManager(NewDataBase);
        System.out.println(newManager.getUserInfo());

        // Connect with Another Database
        UserDataProvider addNewDatabase = new AddNewDatabase();
        UserManager addManager = new UserManager(addNewDatabase);
        System.out.println(addManager.getUserInfo());
    }
}
