package com.example.testserver;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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

  @PostMapping("/testServer2")
  public void testServer2(HttpServletRequest request) {
    System.out.println("testServer2-request=========================================");
    System.out.println(request.getParameter("msg"));
    System.out.println("testServer2-request=========================================");
  }
}
