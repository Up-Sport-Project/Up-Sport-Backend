package Up_Sport.backend.App.Domain.Services.UserService;

import Up_Sport.backend.App.Application.Intrefaces.IUserService;
import Up_Sport.backend.App.Domain.Models.User.User;
import Up_Sport.backend.App.Domain.Respositories.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    public Optional<User> getByLogin(@NonNull String login) {
        try {
            log.info("Called function geByLogin!\n Params: " + login);
            return userRepository.findByLogin(login);
        }catch (Exception e) {
            log.error(e.getMessage());
            throw e;
        }
    }
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
