package com.machale.client.hs.service;

import com.machale.client.hs.model.UserInfo;
import com.machale.client.hs.model.UserKey;

import java.util.List;
import java.util.Map;

public interface HsService {

    UserInfo provideUserInfo(String id, String name);

    Map<UserKey, UserInfo> generateMap(List<String> name);
}
