package edu.miu.annapurnabe.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author bijayshrestha on 6/24/22
 * @project annapurna-be
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO implements Serializable {
    private Integer userId;
    private String fullName;
    private String email;
    private String username;
    private LocalDate dateOfBirth;
    private Character status;
    private boolean subscribed;
}
