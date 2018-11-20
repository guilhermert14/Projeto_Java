
public class TesteSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(342);
		
		Cliente cliente = new Cliente();
		
		SistemaInterno si = new SistemaInterno();
		si.auntentica(g);
		si.auntentica(adm);
		si.auntentica(cliente);
	}

}
