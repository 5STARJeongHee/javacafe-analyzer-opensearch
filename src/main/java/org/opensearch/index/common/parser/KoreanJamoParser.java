package org.opensearch.index.common.parser;

import org.opensearch.index.common.util.JamoUtil;

/**
 * 한글 자모 Parser
 *
 * @author hrkim
 *
 */
public class KoreanJamoParser extends AbstractKoreanParser {

    
    
    
    @Override
    protected void processForKoreanChar(StringBuilder sb, char chosung, char jungsung, char jongsung) {
        sb.append(chosung).append(jungsung);

        if(jongsung != JamoUtil.UNICODE_JONG_SUNG_EMPTY) {
            // 겹받침인지 확인 후 분리
            String splitJongsung = JamoUtil.splitJongSung(jongsung);
            sb.append(splitJongsung);
        }
    }

    
    
    @Override
    protected void processForOther(StringBuilder sb, char eachToken) {
        sb.append(eachToken);
    }
}