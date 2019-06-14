package io.mycat.app.controller;

import io.mycat.app.mapper.TravelRecordMapper;
import io.mycat.app.pojo.TravelRecord;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/travelrecord")
public class TravelRecordController {

  private final TravelRecordMapper travelRecordMapper;

  public TravelRecordController(TravelRecordMapper travelRecordMapper) {
    this.travelRecordMapper = travelRecordMapper;
  }

  @GetMapping("/get/{id}")
  @ResponseBody
  public TravelRecord findById(@PathVariable int id) {
    TravelRecord travelRecord = travelRecordMapper.findById(id);
    return travelRecord;
  }
  @GetMapping("/list")
  @ResponseBody
  public List<TravelRecord> list() {
    List<TravelRecord> list = travelRecordMapper.list();
    return list;
  }
}