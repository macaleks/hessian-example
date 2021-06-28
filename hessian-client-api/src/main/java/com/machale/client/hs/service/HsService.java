package com.machale.client.hs.service;

import com.machale.client.hs.model.UserInfo;

public interface HsService {

    UserInfo provideUserInfo(String id, String name);
}
