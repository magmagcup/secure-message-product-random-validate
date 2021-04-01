package ku.message.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MessageDto {
    @NotBlank
    private String user;
    @NotBlank
    private String text;
}
