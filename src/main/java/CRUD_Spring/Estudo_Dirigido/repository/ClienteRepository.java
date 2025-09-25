package CRUD_Spring.Estudo_Dirigido.repository;

import CRUD_Spring.Estudo_Dirigido.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}