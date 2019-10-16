package com.tuang.tyxs.framework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 
 * @author Administrator
 *
 */
@Configuration
@EnableScheduling
public class TaskConfig {

	
	@Scheduled(cron = "0/30 * * * * ?")
    private void configureTasks() {
		
    }
}
