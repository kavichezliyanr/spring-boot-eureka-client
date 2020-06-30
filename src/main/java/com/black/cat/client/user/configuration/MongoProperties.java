/**
 * 
 */
package com.black.cat.client.user.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Jun 29, 2020
 *
 */
@ConfigurationProperties(prefix="spring.mongo.database")
@Data
public class MongoProperties {
	
	private String host;
	
	private String name;
}
