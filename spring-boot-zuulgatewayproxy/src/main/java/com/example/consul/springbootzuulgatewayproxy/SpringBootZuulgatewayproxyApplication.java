package com.example.consul.springbootzuulgatewayproxy;

import com.example.consul.springbootzuulgatewayproxy.com.example.consul.springbootzuulgatewayproxy.filters.ErrorFilter;
import com.example.consul.springbootzuulgatewayproxy.com.example.consul.springbootzuulgatewayproxy.filters.PostFilter;
import com.example.consul.springbootzuulgatewayproxy.com.example.consul.springbootzuulgatewayproxy.filters.PreFilter;
import com.example.consul.springbootzuulgatewayproxy.com.example.consul.springbootzuulgatewayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulgatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatewayproxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
