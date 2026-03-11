package com.ioc.coupling.coupling;

public class AddNewDatabase implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "This is connect with MYSQL Database";
    }
}
