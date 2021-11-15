package uc.us_security.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uc.us_security.entity.Usuario;
import uc.us_security.repository.Usuariorepository;
import uc.us_security.service.UsuarioS;
@Service
public class UsuarioServiceImpl implements UsuarioS {
@Autowired
public Usuariorepository usuariorepository;
	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return usuariorepository.findAll();
	}

}
