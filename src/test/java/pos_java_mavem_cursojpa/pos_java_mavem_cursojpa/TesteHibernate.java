package pos_java_mavem_cursojpa.pos_java_mavem_cursojpa;

import javax.persistence.EntityManager;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernate() {
		HibernateUtil.getEntityManager();
		
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setNome("Juliandson Barros");
		pessoa.setSobrenome("Soares");
		pessoa.setEmail("j@gmail.com");
		pessoa.setLogin("AND");
		pessoa.setSenha("123");	
		
		daoGeneric.salvar(pessoa);
	}
	
	@Test
	public void testeBuscar() 
	{
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(1L);
		
		pessoa = daoGeneric.pesquisar(pessoa);
		
		System.out.println(pessoa);
	}
	
	@Test
	public void testeBuscar2() 
	{
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L, UsuarioPessoa.class);

		System.out.println(pessoa);
	}
	
	@Test
	public void testeUpdate() 
	{
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = daoGeneric.pesquisar(2L, UsuarioPessoa.class);
		
		pessoa.setNome("Juliandson Barros lll");
		
		pessoa = daoGeneric.updateMerge(pessoa);
		
		System.out.println(pessoa);
	}
	
	@Test
	public void testedelete() 
	{
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L, UsuarioPessoa.class);

		System.out.println(pessoa);
	}
	
}

