package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pedidovenda.model.Cliente;
import com.pedidovenda.model.Endereco;
import com.pedidovenda.model.Grupo;
import com.pedidovenda.model.TipoPessoa;
import com.pedidovenda.model.Usuario;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Cliente cliente = new Cliente();
		cliente.setNome("Andre Luiz da Silva");
		cliente.setEmail("andreluiz1013@hotmail.com");
		cliente.setDocumentoReceitaFederal("123.456.789-10");
		cliente.setTipo(TipoPessoa.JURIDICA);

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Avelino Pereia de Campos");
		endereco.setNumero("740");
		endereco.setCidade("Ponta Grossa");
		endereco.setUf("PR");
		endereco.setCep("84062-290");
		endereco.setCliente(cliente);

		Usuario usuario = new Usuario();
		usuario.setNome("Elyunterim");
		usuario.setEmail("andreluiz1013@hotmail.com");
		usuario.setSenha("123456");

		Grupo grupo = new Grupo();
		grupo.setNome("Vendedores");
		grupo.setDescricao("Vendedores da empresa");
		usuario.getGrupos().add(grupo);

		manager.persist(usuario);
		manager.persist(cliente);
		manager.persist(endereco);
		manager.persist(grupo);

		transaction.commit();
	}
}
