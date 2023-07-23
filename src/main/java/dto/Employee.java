package dto;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
@Id
int id;
String name;
long phone;
public int getId(){
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public void setId(int id) {
	this.id = id;
}

}
