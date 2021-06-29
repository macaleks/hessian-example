package com.machale.client.hs.client;

import com.machale.client.hs.model.UserInfo;
import com.machale.client.hs.model.UserKey;
import com.machale.client.hs.service.HsService;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import java.util.List;
import java.util.Map;

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

    public void provideUserInfo2(List<String> names) {
        Map<UserKey, UserInfo> userInfo = null;
        try {
            userInfo = ((HsService) userInfoService.getObject()).generateMap(names);
        } catch (RemoteAccessException exception) {
            exception.printStackTrace();
        }
        System.out.println(userInfo);
        userInfo.keySet().forEach(System.out::println);
        userInfo.values().forEach(System.out::println);
    }
}
