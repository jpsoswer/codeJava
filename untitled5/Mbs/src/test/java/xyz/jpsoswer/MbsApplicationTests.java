package xyz.jpsoswer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.jpsoswer.mappar.UserMappar;
import xyz.jpsoswer.pojo.User;

import java.util.List;

@SpringBootTest
class MbsApplicationTests {

    @Autowired
    private UserMappar userMappar;
    @Test
    public void um()
    {
        List<User> all = userMappar.findAll();
        all.forEach(
                System.out::println
        );
    }

    @Test
    public void deleteTest()
    {
        userMappar.deleteGid(5);
    }

    @Test
    public void insert()
    {
        User user = new User(null,"zhaoyun","234567","赵云",25);
        userMappar.insertShu(user);
    }

    @Test
    public void updateShu()
    {
        User user = new User(6,"zhouyv","123456","周瑜",20);
        userMappar.updateShu(user);
    }

    @Test
    public void selectuser()
    {
        User user = userMappar.selectUser("zhouyv", "123456");
        System.out.println(user);
    }
}
