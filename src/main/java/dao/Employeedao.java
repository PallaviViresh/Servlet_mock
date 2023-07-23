package dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import antlr.collections.List;
import dto.Employee;

public class Employeedao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
public void save(Employee employee){
	entityTransaction.begin();
	entityManager.persist(employee);
	entityTransaction.commit();
}
public Employee fetch(int id) {
	return entityManager.find(Employee.class,id);
}
public Employee Fetchbyname(String name) {
	List<Employee>employee=entityManager.createQuery("select x from Employee x where name=?1").setParameter(1,name).getResultList();
	if(employee.isEmpty()){
	return null;
	}else{
		return employee.get(0);
	}}
public List<Employee> fetchAll() {
	
	return entityManager.createQuery("select x from Employee x").getResultList();
}
}



