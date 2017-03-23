package cn.chinatowercom.cams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * @author Kevin Yang (mailto:kevin.yang@bstek.com)
 * @since 2016年12月10日
 */
@SpringBootApplication
@EnableCaching
public class CamsApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CamsApplication.class, args);
	}
}
