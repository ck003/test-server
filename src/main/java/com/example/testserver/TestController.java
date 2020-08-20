package com.example.testserver;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
  @PostMapping("/testServer/{requestId}")
  public ResultDTO test(@PathVariable String requestId, @RequestBody String body) {
    System.out.println("requestId: " + requestId + "  body: " + body);
    ResultDTO resultDTO = new ResultDTO();
    resultDTO.setReCode("200");
    resultDTO.setReInfo("成功");
    return resultDTO;
  }
}
