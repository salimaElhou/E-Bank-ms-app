package elhou.salima.bank_account_service.service;

import elhou.salima.bank_account_service.dto.BankAccountRequestDTO;
import elhou.salima.bank_account_service.dto.BankAccountResponseDTO;
import elhou.salima.bank_account_service.entities.BankAccount;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
