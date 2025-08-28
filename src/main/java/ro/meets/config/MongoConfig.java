package ro.meets.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoConfig {
  
  @Value("${spring.data.mongodb.database}")
  private String database;

  @Value("${spring.data.mongodb.uri}")
  private String connectionString;

  @Bean  
  public MongoClient mongoClient() {
    return MongoClients.create(connectionString);
  }

  @Bean
  @Primary
  public MongoDatabaseFactory meetsDataFactory (MongoClient mongoClient) {
    return new SimpleMongoClientDatabaseFactory(mongoClient, database);
  }
  
  @Bean
  @Primary
  public MongoTemplate meetsMongoTemplate (@Qualifier("meetsDataFactory") MongoDatabaseFactory mongoDatabaseFactory) {
    return new MongoTemplate(mongoDatabaseFactory);
  }  
}
