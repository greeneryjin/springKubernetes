package mybatis.springstudy.write.mapper;

import mybatis.springstudy.write.RequestList;
import mybatis.springstudy.write.Writes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WriteMapper {

    List<Map<String, Object>> getListWrite(RequestList<?> requestList);

    int getListWritesCount(Writes writes);

    void insertWrites(Writes writes);
}
