package br.univille.projfabsoftware2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.projfabsoftware2023.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
