package tales.akiba.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@MapperScan
@ComponentScan
@Configuration
public class RootConfig {
	
	protected Class<?>[] getRootConfigClasses() {
	return new Class[] {RootConfig.class};
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
	SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	sqlSessionFactory.setDataSource(dataSource());
	return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

	private DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://127.0.0.1:3306");
		hikariConfig.setUsername("kuon");
		hikariConfig.setPassword("seldesian1!");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		return dataSource;
	}

}
