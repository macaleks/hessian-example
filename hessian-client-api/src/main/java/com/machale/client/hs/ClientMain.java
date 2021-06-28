package com.machale.client.hs;

import com.machale.client.hs.client.UserInfoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ClientMain.class, args);
        UserInfoClient userInfoClient = (UserInfoClient) context.getBean("userInfoClient", UserInfoClient.class);
        userInfoClient.provideUserInfo("232", "name333");
    }
}
