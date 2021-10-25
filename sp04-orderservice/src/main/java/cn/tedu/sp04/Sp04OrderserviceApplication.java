package cn.tedu.sp04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * sp04 orderservice应用程序
 *
 * @author tsz
 * @date 2021/10/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sp04OrderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp04OrderserviceApplication.class, args);
    }

}
