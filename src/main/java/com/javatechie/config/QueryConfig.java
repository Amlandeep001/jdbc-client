package com.javatechie.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("query")
@lombok.Value
public class QueryConfig
{
	String insert;
	String select;
	String sleectById;
	String update;
	String delete;
}