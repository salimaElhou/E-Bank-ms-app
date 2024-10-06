package elhou.salima.bank_account_service.dto;

import elhou.salima.bank_account_service.entities.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountResponseDTO {
    //envoyer
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
