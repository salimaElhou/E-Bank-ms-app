package elhou.salima.bank_account_service.service;

import elhou.salima.bank_account_service.dto.BankAccountRequestDTO;
import elhou.salima.bank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

     BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

}
