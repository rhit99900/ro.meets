package ro.meets.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
  private Long id;
  private String email;
  private String name;
  private String phone;

  public User(){

  };

  // Getters

  public String getEmail() {
    return email;
  }
  
  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  // Setters

  public void setEmail(String email) {
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
