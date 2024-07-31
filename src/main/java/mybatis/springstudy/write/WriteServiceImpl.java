package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import mybatis.springstudy.write.mapper.WriteMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WriteServiceImpl implements WriteService {

    private final WriteMapper writeMapper;

    @Override
    public void insertWrites(RegWriteDto regWriteDto) {
        Writes writes = new Writes(regWriteDto.getTitle(), regWriteDto.getContent(), regWriteDto.getWriter());
        writeMapper.insertWrites(writes);
    }

    @Override
    public Page<Map<String, Object>> getListWrite(Writes writes, Pageable pageable) {

        // 빌더 패턴으로 data, pageable 파라미터에 데이터 주입
        RequestList<?> requestList = RequestList.builder()
                .data(writes)
                .pageable(pageable)
                .build();

        List<Map<String, Object>> content =  writeMapper.getListWrite(requestList);
        int total = writeMapper.getListWritesCount(writes);
        return new PageImpl<>(content, pageable, total);
    }

    @Override
    public Page<Map<String, Object>> getQueryWrite(Map<String, Object> paramMap, String query, Pageable pageable) {

        paramMap.put("offset", pageable.getOffset());
        paramMap.put("pageSize", pageable.getPageSize());

        List<Map<String, Object>> content =  writeMapper.getQueryWrite(query, paramMap);
        int total = writeMapper.getListWritesCount(writes);
        return new PageImpl<>(content, pageable, total);
    }

    @Override
    public Writes getDetailWrite(Long writeId) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getMyWrite(Writes writes, Pageable pageable) {
        return null;
    }
}
