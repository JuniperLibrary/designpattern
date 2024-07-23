package com.uin.structuralPattern.bridgePattern.adapterAndBridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GUIReportDisplay implements ReportDisplay{

  @Override
  public void displayReport(String data) {
    log.info("Displaying report in GUI: {}", data);
  }
}
