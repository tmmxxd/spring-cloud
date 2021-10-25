package cn.tedu.sp03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Sp03UserserviceApplication 启动主程序
 *
 * @author tsz
 * @date 2021/10/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sp03UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp03UserserviceApplication.class, args);
    }

}
