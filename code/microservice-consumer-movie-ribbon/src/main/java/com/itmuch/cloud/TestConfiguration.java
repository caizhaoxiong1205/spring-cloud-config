package com.itmuch.cloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeFromComponentScan

//随机的配置，默认的方式是轮询
public class TestConfiguration {
  //  @Autowired
  //  IClientConfig config;

  @Bean
  public IRule ribbonRule() {
    return new RandomRule();
  }
}
