package ir.maktab.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("ir.maktab")
@PropertySource("classpath:database.properties")
public class HibernateConfiguration {
    private final Environment environment;

    public HibernateConfiguration(Environment environment) {
        this.environment = environment;
    }

    public SessionFactory getSessionFactory(){
        Map<String, String> settings = new HashMap<>();

        settings.put("hibernate.connection.driver_class",
                environment.getRequiredProperty("hibernate.connection.driver_class"));
        settings.put("hibernate.dialect",
                environment.getRequiredProperty("hibernate.dialect"));
        settings.put("hibernate.connection.url",
                environment.getRequiredProperty("hibernate.connection.url"));
        settings.put("hibernate.connection.username",
                environment.getRequiredProperty("hibernate.connection.username"));
        settings.put("hibernate.connection.password",
                environment.getRequiredProperty("hibernate.connection.password"));
        settings.put("hibernate.show_sql",
                environment.getRequiredProperty("hibernate.show_sql"));
        settings.put("hibernate.format_sql",
                environment.getRequiredProperty("hibernate.format_sql"));
        settings.put("hibernate.hbm2ddl.auto",
                environment.getRequiredProperty("hibernate.hbm2ddl.auto"));

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(settings).build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        //   metadataSources.addAnnotatedClass(Teacher.class);

        Metadata metadata = metadataSources.buildMetadata();
        return metadata.getSessionFactoryBuilder().build();
    }
}