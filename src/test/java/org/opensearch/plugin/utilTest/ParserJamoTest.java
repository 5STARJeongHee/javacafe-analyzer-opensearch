package org.opensearch.plugin.utilTest;

import static org.junit.Assert.assertEquals;

import org.opensearch.index.common.parser.KoreanJamoParser;
import org.junit.Test;

public class ParserJamoTest {


    @Test
    public void jamoTest() {
        String token = "자바카페";
        KoreanJamoParser parser = new KoreanJamoParser();
        String result = parser.parse(token);

        System.out.println(result);
        assertEquals("ㅈㅏㅂㅏㅋㅏㅍㅔ", result);
    }
    
    
    @Test
    public void jamoTest2() {
        String token = "삼성전자";
        KoreanJamoParser parser = new KoreanJamoParser();
        String result = parser.parse(token);

        System.out.println(result);
        assertEquals("ㅅㅏㅁㅅㅓㅇㅈㅓㄴㅈㅏ", result);
    }
    @Test
    public void jamoTest3() {
        String token = "싢";
        KoreanJamoParser parser = new KoreanJamoParser();
        String result = parser.parse(token);

        System.out.println(result);
        assertEquals("ㅅㅣㄴㅎ", result);
    }

    @Test
    public void jamoTest4() {
        String token = "samsung";
        KoreanJamoParser parser = new KoreanJamoParser();
        String result = parser.parse(token);

        System.out.println(result);
        assertEquals("samsung", result);
    }
}
