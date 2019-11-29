package com.chainfsoft.jedis;



import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

public class JedisDemo1 {
	@Test
	/**
	 *一般方式链接
	 */
  public void demo1() {
	  //1.设置IP地址和端口
	  Jedis jedis = new Jedis("127.0.0.1",6379);
	  //2.保存数据
	  jedis.set("name", "fengjifei");
	  //3.获取数据
	  String value = jedis.get("name");
	  System.out.println(value);
	  //4.释放资源
	  jedis.close();

		System.out.println(value);
  }
	
}
