package org.koreait.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing  //BaseEntity 활성화를 시키기 위해.
public class MvcConfig implements WebMvcConfigurer {
}
