package ro.meets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;

import ro.meets.repository.UsersRepository;

public class CalendarService {
  
  private final MongoTemplate meetsMongoTemplate;

  @Autowired
  UsersRepository users;

  @Autowired
  public CalendarService(@Qualifier("meetsMongoTemplate") MongoTemplate meetsMongoTemplate) {
    this.meetsMongoTemplate = meetsMongoTemplate;
  }
}
