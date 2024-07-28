package mybatis.springstudy.write;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/search")
    public ResponseEntity<Page<Map<String, Object>>> getListWrite(Writes writes, @PageableDefault Pageable pageable) {
        Page<Map<String, Object>> listWrite = writeServiceImpl.getListWrite(writes ,pageable);
        return ResponseEntity.ok(listWrite);
    }
}
