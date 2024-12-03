package Up_Sport.backend.App.Domain.Models.JwtRequest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtRequest {
    private String login;
    private String password;
}