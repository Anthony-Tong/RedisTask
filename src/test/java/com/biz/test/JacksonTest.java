package com.biz.test;

import com.biz.dao.StudentDao;
import com.biz.entity.Student;
import com.biz.utils.RedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

/**
 * @author ChunjieTang
 * @create 2018-02-08 11:28
 */
public class JacksonTest {
    @Test
    public void test1() throws ParseException, IOException {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Student stu = new Student("0001", "zhangsan", "1999-2-2", "hello", 18);

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(stu);
        System.out.println(str);

        Student student = mapper.readValue(str, Student.class);
        System.out.println(student);
    }

    @Test
    public void test2() {
        Jedis jedis = RedisUtil.getJedis();
        jedis.set("str", "123");
        System.out.println(jedis.get("str"));
    }

    @Test
    public void test3() throws Exception {
        StudentDao dao = new StudentDao();

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < 100; i++) {
            Student stu = new Student(String.valueOf(i), "zhangsan", "1999-2-2", "hello", i + 1);
            dao.addOrUpdate(stu);
        }
    }

    @Test
    public void test4() throws Exception {
        StudentDao dao = new StudentDao();
        List<String> stus = dao.findAll(1, 5);
        for (String stu : stus) {
            System.out.println(stu);
        }
    }

    @Test
    public void test5() throws Exception {
        StudentDao dao = new StudentDao();
        dao.del("73aff9d7e6bc423e921c407ee2c6f56d");
    }

    @Test
    public void test6() throws Exception {
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}
