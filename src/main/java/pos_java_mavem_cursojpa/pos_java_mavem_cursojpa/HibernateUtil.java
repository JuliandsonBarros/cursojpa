package pos_java_mavem_cursojpa.pos_java_mavem_cursojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory;
	
	static {
		init();
	}
	
	private static void init() {
		
		try {
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("cursojpa"); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() { /*Alimenta a parte de persistencia*/
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) /*Retorna primarykey*/
	{
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}
