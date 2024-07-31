package mybatis.springstudy.write.mapper;

import mybatis.springstudy.write.RequestList;
import mybatis.springstudy.write.Writes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WriteMapper {

    void insertWrites(Writes writes);

    int getListWritesCount(Writes writes);

    List<Map<String, Object>> getListWrite(RequestList<?> requestList);

    List<Map<String, Object>> getQueryWrite(String query, Map<String, Object> paramMap);

    Writes getDetailWrite(Long write_id);

    List<Map<String, Object>> getMyWrite(RequestList<?> requestList);
}
