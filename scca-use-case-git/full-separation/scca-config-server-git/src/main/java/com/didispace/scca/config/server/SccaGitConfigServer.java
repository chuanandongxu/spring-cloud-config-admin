package com.didispace.scca.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by 程序猿DD/翟永超 on 2018/7/03.
 * <p>
 * Blog: http://blog.didispace.com/
 * Github: https://github.com/dyc87112/
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class SccaGitConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(SccaGitConfigServer.class);
    }

}
