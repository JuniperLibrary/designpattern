package com.uin.structurapattern.compositepattern.tranining;

public class Client {

  public static void main(String[] args) {
    // 创建单元控件
    Component button1 = new Button("Submit");
    Component button2 = new Button("Cancel");
    Component textBox = new TextBox("Enter text here...");

    // 创建容器控件
    Container form = new Container();
    form.add(button1);
    form.add(button2);
    form.add(textBox);

    // 创建子容器
    Container panel = new Container();
    panel.add(new Button("OK"));
    panel.add(new TextBox("Enter your name"));

    // 添加子容器到容器控件
    form.add(panel);

    // 绘制整个界面
    form.draw();
  }
}
