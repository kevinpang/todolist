package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class User extends Model {
  private static final long serialVersionUID = 1L;
  
  public static Finder<String, User> finder = new Finder<String, User>(String.class, User.class);

  @Id
  public String username;
  
  @Column(nullable = false)
  public String email;
  
  // TODO: Hash password
  @Column(nullable = false)
  public String password;
  
  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
}
