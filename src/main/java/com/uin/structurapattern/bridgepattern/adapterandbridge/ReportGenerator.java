package com.uin.structurapattern.bridgepattern.adapterandbridge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ReportGenerator {

  private final ReportDisplay reportDisplay;

  private final DataCollector dataCollector;

  public void generateReport() {
    String data = dataCollector.collectData();
    reportDisplay.displayReport(data);
  }
}
