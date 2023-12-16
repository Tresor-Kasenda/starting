package org.learnjava;

import Model.UserModel;

public class User implements UserModel {

    private String name;

    private String email;

    private String password;

    private boolean status;

    public User(String name, String email, String password, boolean status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UserModel setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public UserModel setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public UserModel setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean isStatus() {
        return status;
    }

    @Override
    public UserModel setStatus(boolean status) {
        this.status = status;
        return this;
    }
}
