package com.anasdidi.mstaskmgmtcmd.domain.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/task")
class TaskController {

  @GetMapping("")
  ResponseEntity<String> helloWorld() {
    return ResponseEntity.ok("HELLO WORLD");
  }
}
