package com.anandchinte.springboot.pgexample.springbootpgexample.repo;




import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.anandchinte.springboot.pgexample.springbootpgexample.model.Customer;;


@Repository
public class CustomRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<Customer> getPasswordByUsername(String email){
		
		Query q = entityManager.createNativeQuery("SELECT password FROM public.\"anand_test_table\" WHERE email LIKE :email");
		          q.setParameter("email", email);
		 
	   List<Customer> customers = q.getResultList();
	   
	   return customers;
		          
		          
		          
	}
	
	

}
