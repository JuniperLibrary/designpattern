package com.uin.structurapattern.bridgepattern.adapterandbridge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExcelDataCollectorAdapter implements DataCollector {

  private final ExcelAPI excelAPI;

  @Override
  public String collectData() {
    return excelAPI.getExcelData();
  }
}
