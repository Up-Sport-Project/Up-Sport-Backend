package Up_Sport.backend.App.Domain.Respositories;

import Up_Sport.backend.App.Domain.Models.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByLogin(String login);
}
