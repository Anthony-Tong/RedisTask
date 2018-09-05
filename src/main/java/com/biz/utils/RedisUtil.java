package com.biz.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * redis工具
 *
 * @author ChunjieTang
 * @create 2018-02-08 13:02
 */
public class RedisUtil {
    private static JedisPool pool;
    private static final String REDIS_SERVER_URL = "118.24.21.136";
    private static final int REDIS_SERVER_PORT = 6379;
    private static final String REDIS_SERVER_PASSWORD = "jie123";
    private static final int POOL_TIMEOUT = 2000;

    public static JedisPool getPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数
        config.setMaxTotal(50);
        //空闲时最大连接数
        config.setMaxIdle(10);
        if (pool == null) {
            pool = new JedisPool(config, REDIS_SERVER_URL, REDIS_SERVER_PORT, POOL_TIMEOUT, REDIS_SERVER_PASSWORD);
        }
        return pool;
    }

    public static Jedis getJedis() {
        return getPool().getResource();
    }

    public static void closeRedis(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }

}
