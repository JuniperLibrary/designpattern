package com.uin.structurapattern.bridgepattern.adapterandbridge;

public class Main {

  public static void main(String[] args) {
    // 文本文件数据采集和控制台显示
    DataCollector textFileCollector = new TextFileDataCollector("product_question.md");
    ReportDisplay consoleDisplay = new ConsoleReportDisplay();
    ReportGenerator textFileReport = new ReportGenerator(consoleDisplay, textFileCollector);
    textFileReport.generateReport();

    // 数据库数据采集和图形界面显示
    DataCollector databaseCollector = new DatabaseDataCollector();
    ReportDisplay guiDisplay = new GUIReportDisplay();
    ReportGenerator dbReport = new ReportGenerator(guiDisplay, databaseCollector);
    dbReport.generateReport();

    // Excel数据采集和控制台显示
    ExcelAPI excelAPI = new ExcelAPI();
    DataCollector excelCollector = new ExcelDataCollectorAdapter(excelAPI);
    ReportGenerator excelReport = new ReportGenerator(consoleDisplay, excelCollector);
    excelReport.generateReport();
  }
}
