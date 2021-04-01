package ku.message.dto;

import ku.message.validation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class SignupDto {

    @NotBlank
    @Size(min=4, message="Username must be at least 4 char long")
    private String username;

    @NotBlank
    @ValidPassword
    @Size(min=12, max=120)
    private String password;

    @NotBlank(message = "Required first name")
    @Pattern(regexp = "^[a-zA-Z]+$",
            message = "First name can only contain letters")
    private String firstName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String lastName;

    @NotBlank
    private String role;
}
