package com.javassist.test;

import org.apache.ibatis.javassist.*;
import org.apache.ibatis.javassist.util.HotSwapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by songz on 2017/7/6.
 */
public class APP {


    public static void main(String[] args) {
        //User user = new User();

        ClassPool pool = ClassPool.getDefault();
        try {
            pool.removeClassPath(new LoaderClassPath(User.class.getClassLoader()));
            CtClass cc = pool.get("com.javassist.test.User");
            CtMethod method = cc.getDeclaredMethod("move",new CtClass[]{pool.get("java.lang.String")});
            method.setBody("return $1.trim()+\"11s\";");
            cc.toClass();

        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        System.out.println(new User().move("ttt       "));
    }

}
