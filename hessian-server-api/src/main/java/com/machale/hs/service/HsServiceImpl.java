package com.machale.hs.service;

import com.machale.hs.model.UserInfo;

public class HsServiceImpl implements HsService {

    @Override
    public UserInfo provideUserInfo(String id, String name) {
        return new UserInfo(id, name);
    }
}
