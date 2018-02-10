package com.biz.dao;

import com.biz.entity.Student;
import com.biz.utils.RedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 持久层
 *
 * @author ChunjieTang
 * @create 2018-02-08 12:37
 */
public class StudentDao {
    private static final Logger logger = LoggerFactory.getLogger(StudentDao.class);
    /**
     * redis学生信息前缀
     */
    private static final String PREFIX = "student:";

    public void addOrUpdate(Student student) throws Exception {
        Jedis jedis = RedisUtil.getJedis();
        ObjectMapper mapper = new ObjectMapper();
        String stuJson = mapper.writeValueAsString(student);
        jedis.set(PREFIX + student.getId(), stuJson);
        jedis.zadd("topicId", student.getAvgScore(), PREFIX + student.getId());

        RedisUtil.closeRedis(jedis);
    }

    public void del(String id) {
        Jedis jedis = RedisUtil.getJedis();
        jedis.del(PREFIX + id);
        jedis.zrem("topicId", PREFIX + id);

        RedisUtil.closeRedis(jedis);
    }

    public List<String> findAll(int pageNO, int pageSize) {
        List<String> students = new ArrayList<String>();
        Jedis jedis = RedisUtil.getJedis();
        int start = (pageNO - 1) * pageSize;
        int end = start + pageSize - 1;
        Set<String> ids = jedis.zrevrange("topicId", start, end);
        for (String id : ids) {
            String stuJson = jedis.get(id);
            students.add(stuJson);
        }
        RedisUtil.closeRedis(jedis);
        return students;
    }

    public int getCount() {
        Jedis jedis = RedisUtil.getJedis();
        //long count = jedis.zcount("topicId", 0, 1000);
        Set<String> ids = jedis.zrevrange("topicId", 0, -1);
        int count = ids.size();
        RedisUtil.closeRedis(jedis);
        return count;
    }

    /**
     * 按id查询学生信息
     * @param id
     * @return 学生信息
     */
    public String findById(String id){
        Jedis jedis = RedisUtil.getJedis();
        String stu = jedis.get(PREFIX + id);
        RedisUtil.closeRedis(jedis);
        return stu;
    }

}
