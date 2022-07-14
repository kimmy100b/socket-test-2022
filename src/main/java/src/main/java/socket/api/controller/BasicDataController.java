package src.main.java.socket.api.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.socket.api.service.BasicDataService;

import java.util.Map;

/**
 * @see : Web Socket 간단한 테스트 관련 컨트롤러
 * @author : shin
 */

@RestController
@RequestMapping("api/basic-data")
public class BasicDataController {

    private final BasicDataService basicDataService;

    public BasicDataController(BasicDataService basicDataService) {
        this.basicDataService = basicDataService;
    }

    @ApiOperation("Date 업데이트 Api")
    @PostMapping(value = "/model/update-data", consumes = "application/json")
    public int updateData(@RequestBody(required = false) Map<String, Object> payload) throws Exception {
        return basicDataService.updateData(payload);
    }
}
