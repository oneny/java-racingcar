package step1_study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void 요구사항1_test() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    void 요구사항2_test() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @DisplayName("요구사항2 Parameterized 테스트 적용")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void 요구사항2_parameterize_test(int number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void 요구사항3_test(int input, boolean expect) {
        assertThat(numbers.contains(input)).isEqualTo(expect);
    }
}
