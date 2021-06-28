package com.machale.hs.service;

import com.machale.client.hs.model.UserInfo;
import com.machale.client.hs.service.HsService;

public class HsServiceImpl implements HsService {

    @Override
    public UserInfo provideUserInfo(String id, String name) {
        return new UserInfo(id, name);
    }
}
