package vn.com.nguacon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DAOConfig {
	
	@Value("${jdbc.driverClassName}")
	private String driverClass;
	
	@Value("${jdbc.password}")
	private String password;

	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Bean(name="dataSource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setPassword(password);
		dataSource.setUsername(username);
		dataSource.setUrl(url);
		return dataSource;
	}
}
