package servlet_CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DatabaseLogic {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("servletCrud");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void insert(Employee emp) {

		transaction.begin();
		manager.persist(emp);
		transaction.commit();
	}	
		public void delete(int id) {
		Employee employee=manager.find(Employee.class, id);
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
	}
		public void update(Employee emp) {
			transaction.begin();
			manager.merge(emp);
			transaction.commit();
			
		}
		public Employee fetch(int id) {
			return manager.find(Employee.class, id);
		}
}
