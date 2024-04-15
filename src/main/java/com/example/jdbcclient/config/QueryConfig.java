package com.example.jdbcclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("query")
@lombok.Value
public class QueryConfig
{
	String insert;
	String select;
	String selectById;
	String update;
	String delete;
}
