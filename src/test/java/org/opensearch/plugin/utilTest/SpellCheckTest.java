package org.opensearch.plugin.utilTest;

import static org.junit.Assert.assertEquals;

import org.opensearch.index.common.parser.KoreanJamoParser;
import org.junit.Test;

public class SpellCheckTest {


    @Test
    public void spellTest() {
        String token = "자바카페";
        KoreanJamoParser parser = new KoreanJamoParser();
        String result = parser.parse(token);

        System.out.println(result);
        assertEquals("ㅈㅏㅂㅏㅋㅏㅍㅔ", result);
    }
    

    
}

