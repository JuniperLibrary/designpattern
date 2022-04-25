package com.uin.creationPattern.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //建造模式
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    /**
     *
     */
    protected String cpu;
    protected String mem;
    protected String disk;
    protected String cam;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}
