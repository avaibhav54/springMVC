package springMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private String mail;
private String name;
private String password;
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "user [mail=" + mail + ", name=" + name + ", password=" + password + "]";
}

}
