package com.jojoldu.ci;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jojoldu@gmail.com on 2018. 3. 9.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

public class CalculatorTest {

    @Test
    public void 숫자2개를_더한값이_반환된다(){
        //given
        long num1 = 1;
        long num2 = 2;

        //when
        long sum = Calculator.sum(num1, num2);

        //thwn
        assertThat(sum).isEqualTo(3);
    }
}
