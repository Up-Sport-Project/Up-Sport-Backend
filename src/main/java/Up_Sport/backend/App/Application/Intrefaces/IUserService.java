package Up_Sport.backend.App.Application.Intrefaces;

import Up_Sport.backend.App.Domain.Models.User.User;
import lombok.NonNull;

import java.util.Optional;

public interface IUserService {
    Optional<User> getByLogin(@NonNull String login);
    void save(User user);
}
