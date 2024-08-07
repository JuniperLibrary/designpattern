package com.uin.structurapattern.flyweightpattern.training;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * 享元工厂类
 *
 * @author dingchuan
 */
public class MultimediaFlyweightFactory {

  private final Map<String, Multimedia> flyweights = new ConcurrentHashMap<>(16);
  private final Map<String, Function<String, Multimedia>> creators = new ConcurrentHashMap<>();

  public MultimediaFlyweightFactory() {
    // 预先注册所有的多媒体类型与对应的创建函数
    creators.put("image", this::createImageFlyweight);
    creators.put("video", this::createVideoFlyweight);
    creators.put("animation", this::createAnimationFlyweight);
  }

  public Multimedia getFlyweight(String filetype, String filepath) {
    if (filetype == null || filetype.isEmpty()) {
      throw new IllegalArgumentException("Filetype cannot be null or empty");
    }

    // 使用改进的组合key方法
    String key = composeKey(filetype, filepath);

    // 尝试从flyweights中获取，如果不存在则尝试创建新实例
    return flyweights.computeIfAbsent(key, k -> createFlyweight(filetype, filepath));
  }

  /**
   * 内存管理机制（示例性代码，实际应用中可能需要更复杂的策略）
   */
  private void limitSize() {
    // 假定阈值为100
    if (flyweights.size() > 100) {
      // 移除最不常使用的项，这里为了简单化处理，直接移除第一个元素
      flyweights.remove(flyweights.keySet().iterator().next());
    }
  }

  /**
   * 提取创建Flyweight实例的逻辑为单独方法，便于扩展
   *
   * @param filetype
   * @param filepath
   * @return
   */
  private Multimedia createFlyweight(String filetype, String filepath) {
    Function<String, Multimedia> creator = creators.get(filetype);
    if (creator == null) {
      throw new IllegalArgumentException("Unsupported filetype: " + filetype);
    }
    Multimedia multimedia = creator.apply(filepath);
    // 创建新实例后，检查是否需要进行内存管理
    limitSize();
    return multimedia;
  }

  /**
   * 具体的多媒体类型创建函数
   *
   * @param filepath
   * @return
   */
  private Multimedia createImageFlyweight(String filepath) {
    return new ImageFlyweight(filepath);
  }

  private Multimedia createVideoFlyweight(String filepath) {
    return new VideoFlyweight(filepath);
  }

  private Multimedia createAnimationFlyweight(String filepath) {
    return new AnimationFlyweight(filepath);
  }

  /**
   * 提取key的生成逻辑
   *
   * @param filetype
   * @param filepath
   * @return
   */
  private String composeKey(String filetype, String filepath) {
    return filetype + ":" + filepath;
  }
}

