package com.ioc.coupling.coupling;

public class UserDatabase implements UserDataProvider {

    @Override
    public String getUserDetails(){

        return "User Details From Database";

    }

}
