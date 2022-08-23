import com.ths.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.math.BigDecimal;


/**
 * @Author JiangYu
 * @Description Spring测试类
 * @Date 2022-08-13 21:55
 * @Version 1.0
 */

@SpringJUnitConfig(locations = "classpath:application.xml")
public class SpringTest {
    @Resource
    UserService userService;


    @Test
    public void test1() {
        System.out.println(userService.transfer("1", "2", new BigDecimal("10.00")));
    }
}
