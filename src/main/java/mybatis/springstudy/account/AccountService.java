package mybatis.springstudy.account;


public interface AccountService {

    void accountInsert(AccountDto accountDto);

    ResLoginDto accountLogin(AccountLoginDto accountLoginDto);


    void AccountDelete(String accountId);
}
