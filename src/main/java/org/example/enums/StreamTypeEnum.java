package org.example.enums;

import java.lang.Integer;
import java.lang.String;

/**
 * This is the example for generating class
 */
public enum StreamTypeEnum {
  Test1(1, "Test1"),

  Test4(4, "Test4"),

  Test3(3, "Test3"),

  Test2(2, "Test2");

  /**
   * 枚举值
   */
  private Integer value;

  /**
   * 枚举备注
   */
  private String desc;

  StreamTypeEnum(Integer value, String desc) {
    this.value=value;
    this.desc=desc;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value=value;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc=desc;
  }
}
