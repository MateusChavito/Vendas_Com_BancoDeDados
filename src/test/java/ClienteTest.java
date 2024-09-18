import dao.JBDC.ClienteDAO;
import dao.JBDC.IClienteDAO;
import domain.Cliente;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Mateus Chaves");
        Integer countcad = clienteDAO.cadastrar(cliente);
        assertEquals(1, (int) countcad);

        Cliente clienteBD = clienteDAO.buscar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        assertEquals(1, (int) countDel);
    }

}
