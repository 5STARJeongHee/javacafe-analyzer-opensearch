package org.opensearch.plugin.utilTest;

import static org.junit.Assert.assertEquals;

import org.opensearch.index.common.converter.KorToEngConverter;
import org.junit.Test;

public class ConverterK2ETest {
    
    

    @Test
    public void test1() {
        String token = "ㅓㅁㅍㅁㅊㅁㄹㄷ";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("javacafe", result);
    }
    
    
    @Test
    public void test2() {
        String token = "ㅑㅔㅙne";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("iphone", result);
    }
    
    
    @Test
    public void test3() {
        String token = "재ㅡ무";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("woman", result);
    }
    
    
    @Test
    public void test4() {
        String token = "ㄴ므녀ㅜㅎ";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("samsung", result);
    }
    

    @Test
    public void test5() {
        String token = "ㅐㅔ둔ㄷㅁㄱ초";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("opensearch", result);
    }
    
    
    @Test
    public void test6() {
        String token = "신혼여행(身魂旅行)";
        
        KorToEngConverter convert = new KorToEngConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("tlsghsdugod()", result);
    }

}
