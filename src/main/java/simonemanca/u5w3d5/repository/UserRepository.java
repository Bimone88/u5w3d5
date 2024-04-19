package simonemanca.u5w3d5.repository;

import simonemanca.u5w3d5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // aggiungerò in seguito metodi per cercare utenti per username se faccio in tempo
    User findByUsername(String username);
}

