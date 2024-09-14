package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

    Optional<Roles> findByName(String name);
}
