package io.mycat.app.controller;

import java.sql.Connection;
import javax.annotation.Resource;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.Results;
import org.jooq.impl.DSL;
import org.jooq.tools.json.JSONArray;
import org.jooq.tools.json.JSONParser;
import org.jooq.tools.json.ParseException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycat")
public class MycatController {
  @Resource
  private JdbcTemplate jdbcTemplate;

  static class SQLResult{
    String serverStatus;
    String resultSet;

    public String getServerStatus() {
      return serverStatus;
    }

    public void setServerStatus(String serverStatus) {
      this.serverStatus = serverStatus;
    }

    public String getResultSet() {
      return resultSet;
    }

    public void setResultSet(String resultSet) {
      this.resultSet = resultSet;
    }
  }
  @PostMapping("/sendSQL/")
  public String sendSQL(@RequestParam("sql") String sql) {
    SQLResult result = new SQLResult();
    jdbcTemplate.execute((ConnectionCallback<Connection>) c -> {
      Results results = DSL.using(c).fetchMany(sql);
      JSONArray array = new JSONArray();
      for (Result<Record> records : results) {
          JSONParser parser = new JSONParser();
        Object o;
        try {
          o = parser.parse(records.formatJSON());
        } catch (ParseException e) {
          throw new  RuntimeException(e);
        }
        array.add(o);
      }
      result.setResultSet(array.toString());
      return c;
    });
    return result.getResultSet();
  }
}