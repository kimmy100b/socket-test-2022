package src.main.java.socket.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BasicDataService {
    private static final Logger log = LoggerFactory.getLogger(BasicDataService.class);

    public int updateData(Map<String, Object> payload) {
        log.info("update");
        return 1;
    }
}
