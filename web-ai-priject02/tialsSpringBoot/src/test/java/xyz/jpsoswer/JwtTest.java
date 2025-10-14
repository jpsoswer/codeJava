package xyz.jpsoswer;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {


    //生成JWT令牌
    @Test
    public void testGenerateJwt(){
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("id",1);
        dataMap.put("username","admin");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"anBzb3N3ZXI=")     //指定加密算法，密钥
                .addClaims(dataMap) //添加自定义信息
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000)) //设置过期时间(一小时后过期)
                .compact(); //生成令牌
        System.out.println(jwt);
    }

    //解析JWT令牌
    @Test
    public void testParseJwt(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJhZG1pbiIsImV4cCI6MTc2MDQxMDU4OH0.OXpFK8yL3AYmZ5iPUkT9euIrhRlB8q016eknJV8CHAA";    //令牌
        Claims claims = Jwts.parser()
                .setSigningKey("anBzb3N3ZXI=")   //指定密钥
                .parseClaimsJws(token)  //解析令牌
                .getBody(); //获取自定义信息
        System.out.println(claims);
    }
}
