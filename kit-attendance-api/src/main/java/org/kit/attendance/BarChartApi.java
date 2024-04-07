package org.kit.attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BarChartApi {

    public static void main(String[] args) {
        SpringApplication.run(BarChartApi.class, args);
    }
}

@RestController
class DataController2 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/bar")
    public List<Map<String, Object>> getDataFromDatabase() {
        String sqlQuery = "SELECT * FROM bar_chart";
        List<Map<String, Object>> data = jdbcTemplate.queryForList(sqlQuery);
        return data;
    }
}
