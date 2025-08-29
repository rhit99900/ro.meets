package ro.meets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ro.meets.model.User;

public interface UsersRepository extends MongoRepository<User,String> {
  
} 