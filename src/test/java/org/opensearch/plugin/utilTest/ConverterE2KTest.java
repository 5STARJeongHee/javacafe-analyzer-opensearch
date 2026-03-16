package org.opensearch.plugin.utilTest;

import static org.junit.Assert.assertEquals;

import org.opensearch.index.common.converter.EngToKorConverter;
import org.junit.Test;

public class ConverterE2KTest {
    
    
    @Test
    public void test1() {
        String token = "wkqkzkvp";
        
        EngToKorConverter convert = new EngToKorConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("자바카페", result);
    }
    

    @Test
    public void test2() {
        String token = "tka성wjswk";
        
        EngToKorConverter convert = new EngToKorConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("삼성전자", result);
    }

   
    @Test
    public void test3() {
        String token = "한rmf";
        
        EngToKorConverter convert = new EngToKorConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("한글", result);
    }
    
    
    @Test
    public void test4() {
        String token = "dldhowls";
        
        EngToKorConverter convert = new EngToKorConverter();
        String result = convert.convert(token);
        
        System.out.println(result);
        assertEquals("이왜진", result);
    }

    
    
}
