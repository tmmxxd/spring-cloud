package cn.tedu.sp05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * sp05尤里卡应用程序
 *
 * @author tsz
 * @date 2021/10/25
 */
@SpringBootApplication
@EnableEurekaServer
public class Sp05EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sp05EurekaApplication.class, args);
    }

}
