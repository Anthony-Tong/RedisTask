package com.biz.test;

import com.biz.dao.StudentDao;
import com.biz.entity.Student;
import com.biz.utils.RedisUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

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

//        String json = "{\"WERKS\":\"7915\",\"WERKS_TEXT\":\"壹玖壹玖企业管理成都有限公司_新疆非商品仓\",\"BUKRS\":\"3014\",\"TITLE\":\"071\",\"STRAS\":\"成都市\",\"PFACH\":\"\",\"PSTLZ\":\"123456\",\"ORT01\":\"\",\"REGIO\":\"51\",\"COUNC\":\"\",\"CITYC\":\"\",\"VLFKZ\":\"B\",\"BZIRK\":\"\",\"ZZE58STTP\":\"\",\"ZZE58RP01\":\"\",\"ZZE58QSMC\":0,\"ZZE58LONGI\":\"\",\"ZZE58LATI\":\"\",\"ZZE58SMN\":\"\",\"ZZE58SMPN\":\"\",\"ZZE58HUS22\":\"\",\"ZZE58HUS23\":\"\",\"ZZE58HUS02\":\"\",\"ZZE58HU09\":\"\",\"ZZE58RP08\":\"\",\"ZZE58ASOR\":\"0000-00-00\",\"ZZE58ASOD\":\"0000-00-00\",\"ZZE58ASCD\":\"0000-00-00\",\"ZZE58SCYN\":\"\",\"ZZE58RP07\":\"\",\"ZZE58HUN02\":\"\",\"ZZE58HUN01\":\"\",\"ZZE58HUN05\":\"\",\"ZZE58HU10\":\"\",\"ZZE58HUS03\":\"\",\"ZZE58HUS04\":\"\",\"ZZE58HUS08\":\"\",\"ZZE58HUS05\":\"\",\"ZZE58HUS06\":\"\",\"ZZE58HUS07\":\"\",\"ZZE58HUS09\":\"\",\"ZZE58HUS10\":\"\",\"ZZE58HUS11\":\"\",\"ZZE58HUS12\":\"\",\"ZZE58HUS13\":\"\",\"ZZE58HUS14\":\"\",\"ZZE58HUS15\":\"\",\"ZZE58HUS16\":\"\",\"ZZE58HUS17\":\"\",\"ZZE58HUS18\":\"\",\"ZZE58TSBZ\":\"\",\"ZZE58TSGS\":\"\",\"ZZE58HUF01\":\"\",\"ZZE58HUF03\":\"\",\"ZZE58HUF04\":\"\",\"ZZE58HUF02\":\"\",\"ISCENTERSTORE\":\"\",\"ZZJDE\":\"\",\"ZKDSJ\":\"00:00:00\",\"ZGDSJ\":\"00:00:00\"}";
//        Factory factory = mapper.readValue(json, Factory.class);
//        System.out.println(factory);

    }

    @Test
    public void test2() {
        Jedis jedis = RedisUtil.getJedis();
        jedis.set("str", "123");

        System.out.println(jedis.get("str"));
    }

    /**
     *
     */
    @Test
    public void add() {
        LongAdder longAdder = new LongAdder();
        for (int i=0;i<100;i++) {
            longAdder.increment();
        }
        ThreadLocalRandom current = ThreadLocalRandom.current();
        int i = current.nextInt(0,10);
        System.out.println("random:"+i);
//        AtomicLong atomicLong = new AtomicLong(1);
//        atomicLong.addAndGet(1L);
        System.out.println(longAdder.longValue());

        System.out.println(tc());
        /// aaaa
        System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)));
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

    public String tc() {
        try {
            return "a";
        } catch (Exception e) {
            return "c";
        }finally {
            System.out.println("b");
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
    @Test
    public void test7() throws Exception {
        StudentDao dao = new StudentDao();
        String byId = dao.findById("95");
        System.out.println(byId);
    }

    public static void main(String[] args) {
        System.out.println("aaa");
    }

    public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String jsonText = jsonParser.getText();
        Timestamp deserializeResult = null;
        if (StringUtils.isNotBlank(jsonText)) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            try {
                deserializeResult = new Timestamp(df.parse(jsonText).getTime());
            } catch (ParseException e) {
                //log.warn("反序列化json字段[{}]出错, 字段内容: [{}]", jsonParser.getCurrentName(), jsonText);
                deserializeResult = null;
            }
        }
        return deserializeResult;
    }
}
