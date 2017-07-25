package com.sjd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.github.jonpeterson.jackson.module.versioning.VersioningModule;
import com.github.jonpeterson.spring.mvc.versioning.VersionedModelResponseBodyAdvice;

@Configuration
@Import(VersionedModelResponseBodyAdvice.class)
public class SpringVersioningConfiguration
{
	@Bean
	Jackson2ObjectMapperBuilder objectMapperBuilder ()
	{
		return Jackson2ObjectMapperBuilder.json().modulesToInstall(new VersioningModule());
	}
}