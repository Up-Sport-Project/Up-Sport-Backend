package Up_Sport.backend.App.Application.Intrefaces;

import Up_Sport.backend.App.Domain.Models.JwtAuthentication.JwtAuthentication;
import Up_Sport.backend.App.Domain.Models.JwtRequest.JwtRequest;
import Up_Sport.backend.App.Domain.Models.JwtResponse.JwtResponse;
import jakarta.security.auth.message.AuthException;
import lombok.NonNull;

public interface IAuthService {
    JwtResponse register(JwtRequest request) throws AuthException;
    JwtResponse login(JwtRequest authRequest) throws AuthException;
    JwtResponse getAccessToken(String refreshToken) throws AuthException;
    JwtResponse refresh(String refreshToken) throws AuthException;
    JwtAuthentication getAuthInfo();
}
