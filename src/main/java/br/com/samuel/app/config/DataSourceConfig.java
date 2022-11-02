package br.com.samuel.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    
    @Bean
    public DataSource dataSource() {
        var dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://motty.db.elephantsql.com:5432/nfdkeixd");
        dataSource.setUsername("nfdkeixd");
        dataSource.setPassword("mPs-Kkv1QwhkuHuWSwTkqS3e6eTlJtNe"); 
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        var adaptador = new HibernateJpaVendorAdapter();
        adaptador.setDatabase(Database.POSTGRESQL);
        adaptador.setShowSql(true);
        adaptador.setGenerateDdl(true);
        adaptador.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
        adaptador.setPrepareConnection(true);
        return adaptador;
    }
}