package org.opensearch.plugin.esTest;

import java.io.IOException;

import org.opensearch.common.settings.Settings;
import org.opensearch.core.index.Index;
import org.opensearch.index.analysis.TokenFilterFactory;
import org.opensearch.plugin.analysis.JavacafePlugin;


public class JavacafeKor2EngTest extends AbstractPluginTest {

    
    /**
     * 한영 오타 변환기를 테스트한다.
     * 
     * @throws IOException
     */
    public void test() throws Exception {
                
        String source = "딤ㄴ샻ㄴㄷㅁㄱ초 ㅓㅁㅍㅁㅊㅁㄹㄷ ㅑㅔㅗㅐㅜㄷ";
        
        String[] result = new String[]{
                "opensearch",
                "javacafe",
                "iphone"
        };
        
        String filterName = "javacafe_kor2eng";
        

        // 실행
        TestAnalysis analysis = createTestAnalysis(
                new Index("test", ""), Settings.builder().build(), new JavacafePlugin()
        );
        
        TokenFilterFactory myFilter = analysis.tokenFilter.get(filterName);
        runFilter(myFilter, source, result);
    }
    
    
    
}
