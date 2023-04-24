package org.koreait.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing  //BaseEntity에 @EntityListeners를 호출할때 사용
public class MvcConfig {
}
