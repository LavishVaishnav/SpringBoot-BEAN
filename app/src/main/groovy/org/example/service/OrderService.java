package org.example.service;


import org.example.bean.UserConfig;

// so we are creating a factory method --> creates instances for us by taking the needed dependencies....
public class OrderService {

    public static OrderService createInstance(UserService userService, UserConfig userConfig) {
        return null;
    }


}
