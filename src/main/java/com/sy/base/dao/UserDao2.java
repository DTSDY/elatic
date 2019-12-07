package com.sy.base.dao;

import com.sy.base.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;


/**
 * @author ssssyy
 * 2019/12/4 20:36
 */
@Mapper
public interface UserDao2 {
    @Insert("insert into pop_order_data2(id,order_id,vender_id,order_state) values (#{id},#{order_id},#{vender_id},#{order_state})")
    public void add(User user);

    @Delete("delete from pop_order_data2 where id = #{id} and order_state = 5 ")
    public void delete(BigInteger id);


}
