package cn.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * sp02 itemservice应用程序
 *
 * @author tsz
 * @date 2021/10/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sp02ItemserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp02ItemserviceApplication.class, args);
    }

}
