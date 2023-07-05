package br.edu.atitus.pooavancado.CadUsuario.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.pooavancado.CadUsuario.Entities.Pedido;
import br.edu.atitus.pooavancado.CadUsuario.repositories.GenericRepository;
import br.edu.atitus.pooavancado.CadUsuario.repositories.PedidoRepository;
import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;
import br.edu.atitus.pooavancado.CadUsuario.services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	  final PedidoRepository pedidoRepository;
	  final ProdutoRepository produtoRepository;
	

	  public PedidoServiceImpl(PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
	    super();
	    this.pedidoRepository = pedidoRepository;
	    this.produtoRepository = produtoRepository;
	  }

	  @Override
	  public GenericRepository<Pedido> getRepository() {
	    return pedidoRepository;
	  }

	  @Override
	  public void validarSave(Pedido objeto) throws Exception {
	    PedidoService.super.validarSave(objeto);
	  }
}

