import java.util.List;

import com.kkj.test.TestDao;
import com.kkj.test.TestDto;

public class Test {
	public static void main(String[] args) {
		List<TestDto> listDto = null;
		TestDao testDao = new TestDao();
		listDto = testDao.dbTest();
		System.out.println(listDto);
	}
}
