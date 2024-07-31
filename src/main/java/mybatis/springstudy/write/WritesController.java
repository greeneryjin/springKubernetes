package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WritesController {

    private final WriteServiceImpl writeServiceImpl;

    @PostMapping("/write")
    public void saveWrite(@RequestBody RegWriteDto regWriteDto) {
        writeServiceImpl.insertWrites(regWriteDto);
    }

    //전체 조회
    @GetMapping("/search")
    public ResponseEntity<Page<Map<String, Object>>> getListWrite(Writes writes, @PageableDefault Pageable pageable) {
        Page<Map<String, Object>> listWrite = writeServiceImpl.getListWrite(writes ,pageable);
        return ResponseEntity.ok(listWrite);
    }

    //검색어 조회
    @GetMapping("/queryWrite")
    public ResponseEntity<Page<Map<String, Object>>> getQueryWrite(@RequestParam Map<String, Object> paramMap, String query, @PageableDefault Pageable pageable) {
        Map<String,Object> resultMap = new HashMap<String, Object>();
        Page<Map<String, Object>> listWrite = writeServiceImpl.getQueryWrite(paramMap, query ,pageable);
        return ResponseEntity.ok(listWrite);
    }

    //세부 조회
    @GetMapping("/detailWrite")
    public ResponseEntity<WriteOneDto> getDetailWrite(Writes writes, @PageableDefault Pageable pageable) {
        writeServiceImpl.getListWrite(writes ,pageable);
        return ResponseEntity.ok(null);
    }

    //내가 작성한 글 조회
    @GetMapping("/myWrite")
    public ResponseEntity<Page<Map<String, Object>>> getMyWrite(Writes writes, @PageableDefault Pageable pageable) {
        Page<Map<String, Object>> listWrite = writeServiceImpl.getListWrite(writes ,pageable);
        return ResponseEntity.ok(listWrite);
    }

}
