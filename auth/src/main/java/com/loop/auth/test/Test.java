package com.loop.auth.test;

import com.loop.common.entiy.User;
import org.omg.CORBA.UserException;

/**
 * @author: yf
 * @date: 2021/11/17  16:22
 * @desc:
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        System.out.println(user);
    }


}
