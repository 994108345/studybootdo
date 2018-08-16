package cn.wzl.studybootdo.server; /**
 * Created by wenzailong on 2018/8/15.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wenzailong
 * @create 2018-08-15 14:44
 **/
@MapperScan("cn.wzl.studybootdo.dao") //扫描的mapper
@SpringBootApplication
public class SpringmybatisdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatisdemoApplication.class, args);
    }
}
