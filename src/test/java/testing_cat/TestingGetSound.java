package testing_cat;

import com.example.Cat;
import com.example.Feline;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestingGetSound {

    @Mock
    Feline feline;

    // Проверка, что метод вызывается.
    @Test
    public void catMustSayMeow() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }


    // Проверка, что ожидаемый результат соответствует фактическому.
    @Test
    public void getSoundExpectedAndActual() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Ожидаемый результат не соответствует фактическому", expected, actual);
        System.out.println("Ожидаемый результат соответствует фактическому: выводится строка - " + actual);
    }
}