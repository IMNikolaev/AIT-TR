package lesson_28.src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MemberTest {

    Member member;
    String startEmail = "john@test.com";
    String startPassword = "Qwerty1Q@";


    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @Test
    void testValidPasswordlSet() {
        String validPassword = "Qwerty123!";
        System.out.println("getPassword after: " + member.getPassword());

        member.setPassword(validPassword);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword, member.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String invalidEmail) {
        member.setEmail(invalidEmail);
        Assertions.assertEquals(startEmail, member.getEmail());
    }
    /*
     1. done - @ should be present and there should only be one
    2. Done - the dot after the dog
    3. done - The dot can't be right after the dog
    4. done - There must be at least two characters after the last period
    5. done - Only alphabet characters, numbers, '-', '_', '.', '@' can be present.
    6. done - The first character should be - alphabetical
     */
    static Stream<String> invalidEmailData() {
        return Stream.of(
                "test@ema@il.net",
                "test@emailnet",
                "test@email.net.",
                "test@.email.net",
                "test@.emailne.t",
                "test@.em%ail.net",
                "test@.em ail.net",
                "@test.email.net"
        );
    }
    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testSetInvalidPassword(String invalidPassword) {
        member.setPassword(invalidPassword);
        Assertions.assertEquals(startPassword, member.getPassword());
    }
    /* Требования к валидности пароля
      1. длина пароля >= 8
      2. мин 1 маленькая буква
      3. мин 1 большая буква
      4. мин 1 цифра
      5. мин 1 спец символ ("!%$@&*()[]")

       */
    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "Qwert1!",
                "QWERTY123!",
                "qwerty123!",
                "Qwerty!@",
                "Qwerty123456"
        );
    }
}