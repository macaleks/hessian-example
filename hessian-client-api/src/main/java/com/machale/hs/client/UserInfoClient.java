package com.machale.hs.client;

import com.machale.hs.model.UserInfo;
import com.machale.hs.service.HsService;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

public class UserInfoClient {


    private final HessianProxyFactoryBean userInfoService;

    public UserInfoClient(HessianProxyFactoryBean userInfoService) {
        this.userInfoService = userInfoService;
    }

    public UserInfo provideUserInfo(String id, String name) {
        UserInfo userInfo = null;
        try {
            userInfo = ((HsService) userInfoService.getObject()).provideUserInfo(id, name);
        } catch (RemoteAccessException exception) {
            exception.printStackTrace();
        }
        System.out.println(userInfo);
        return userInfo;
    }
}
