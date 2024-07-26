package mybatis.springstudy.account.mapper;

import mybatis.springstudy.account.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    void insertAccount(Account account);
}
