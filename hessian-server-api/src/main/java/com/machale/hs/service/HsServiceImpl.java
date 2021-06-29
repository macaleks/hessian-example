package com.machale.hs.service;

import com.machale.client.hs.model.UserInfo;
import com.machale.client.hs.model.UserKey;
import com.machale.client.hs.service.HsService;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class HsServiceImpl implements HsService {

    @Override
    public UserInfo provideUserInfo(String id, String name) {
        return new UserInfo(id, name);
    }

    @Override
    public Map<UserKey, UserInfo> generateMap(List<String> name) {
        Random random = new Random();
        return name.stream()
                .map(n -> new UserInfo(String.valueOf(random.nextInt()), n))
                .collect(toMap(k -> new UserKey(k.getId()),
                        v -> new UserInfo(v.getId(), v.getName())));
    }
}
