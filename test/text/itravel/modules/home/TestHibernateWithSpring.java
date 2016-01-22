package text.itravel.modules.home;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Log4jConfigurer;

import com.bkweb.common.utils.hibernatepage.HPage;
import com.bkweb.modules.tourism.entity.Tourism;
import com.bkweb.modules.tourism.service.CTourismService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring-*.xml" })
@Transactional
public class TestHibernateWithSpring {

	@Autowired
	private CTourismService tourismService;

	@Before
	public void before() {
		try {
			Log4jConfigurer.initLogging("classpath:confi/log4j.properties");
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot Initialize log4j");
		}
	}

	@Test
	public void test() {
		HPage<Tourism> page = new HPage<Tourism>(1);
		tourismService.findPageList(new Tourism(), false, page);
	}

}
