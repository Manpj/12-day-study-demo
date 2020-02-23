package com.a.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain=true)//链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    //数据存在哪个数据库字段，为服务，一个服务对应一个数据库，同一个信息可能存在不同数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

}
