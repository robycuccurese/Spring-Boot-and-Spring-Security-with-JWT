package it.cuccurese.userservice.repo;

import it.cuccurese.userservice.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
