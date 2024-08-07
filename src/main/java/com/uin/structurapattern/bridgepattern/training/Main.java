package com.uin.structurapattern.bridgepattern.training;

public class Main {

  public static void main(String[] args) {
    // 数据源实例
    DataSource dbSource = new DatabaseDataSource("jdbc:mysql://localhost:3306/mydatabase");

    // TXT转换器实例
    DataConverter txtConverter = new TXTDataConverter();
    DataConversionTool txtTool = new DataConversionTool(txtConverter, dbSource);
    txtTool.convertData("output.txt");

    // XML转换器实例
    DataConverter xmlConverter = new XMLDataConverter();
    DataConversionTool xmlTool = new DataConversionTool(xmlConverter, dbSource);
    xmlTool.convertData("output.xml");

    // PDF转换器实例
    DataConverter pdfConverter = new PDFDataConverter();
    DataConversionTool pdfTool = new DataConversionTool(pdfConverter, dbSource);
    pdfTool.convertData("output.pdf");
  }
}
