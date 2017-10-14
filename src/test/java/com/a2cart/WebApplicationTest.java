package com.a2cart;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.a2cart.models.NumberPojo;
import com.a2cart.util.APIUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTest {

	@Test
	public void SumNumberTest() {
		NumberPojo number = new NumberPojo();
		Double a = 1.0;
		number.setA(a);
		Assert.assertEquals(a, number.getA());

		Double b = 1.0;
		number.setB(b);
		Assert.assertNotNull(number.getB());
		Assert.assertEquals(b, number.getB());

		Double sum = APIUtil.sumNumber(a, b);
		Double result = a + b;
		Assert.assertEquals(result, sum);

		b = 2.0;
		Assert.assertNotEquals(b, number.getB());

	}
}
