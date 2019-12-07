package com.sy.base.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author ssssyy
 * 2019/12/4 20:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private BigInteger id;
    private BigInteger order_id;
    private BigInteger vender_id;
    private BigInteger order_state;
}
