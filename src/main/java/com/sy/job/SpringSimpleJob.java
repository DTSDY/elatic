package com.sy.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.sy.base.dao.UserDao1;
import com.sy.base.dao.UserDao2;
import com.sy.base.dao.UserDao3;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ssssyy
 * 2019/12/5 14:17
 */
public class SpringSimpleJob implements SimpleJob {

    @Resource
    private UserDao1 userDao1;
    @Resource
    private UserDao2 userDao2;
    @Resource
    private UserDao3 userDao3;

    //自定义job 需要执行的事情
    @Override
    public void execute(ShardingContext shardingContext) {
        System.err.println(
                String.format("Item: %s |ShardingParameter: %s | Time: %s | Thread: %s | %s",
                        shardingContext.getShardingItem(),                          // 序列号
                        shardingContext.getShardingParameter(),                     // 参数
                        new SimpleDateFormat("HH:mm:ss").format(new Date()),// 时间
                        Thread.currentThread().getId(),"SIMPLE"));                  // 线程Id
        //根据不同的序列号 执行不同的任务
        switch (shardingContext.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                // 删除表1 中的1000条数据
                for (int i = 0; i < 1000; i++) {
                    userDao1.delete(new BigInteger(String.valueOf(i)));
                }
                break;
            case 1:
                // do something by sharding item 1
                // 删除表1 中的1000条数据
                for (int i = 0; i < 1000; i++) {
                    userDao2.delete(new BigInteger(String.valueOf(i)));
                }
                break;
            case 2:
                // do something by sharding item 2
                // 删除表1 中的1000条数据
                for (int i = 0; i < 1000; i++) {
                    userDao3.delete(new BigInteger(String.valueOf(i)));
                }
                break;
            // case n: ...
        }

    }
}
