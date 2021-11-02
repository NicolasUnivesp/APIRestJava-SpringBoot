package Univesp.tutorialrestapi.repository;

import Univesp.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
