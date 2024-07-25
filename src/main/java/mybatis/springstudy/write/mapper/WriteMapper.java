package mybatis.springstudy.write.mapper;

import mybatis.springstudy.write.Writes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WriteMapper {

    List<Writes> getListWrite();

    void insertWrites(Writes writes);
}
