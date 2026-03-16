package org.opensearch.index.analysis.eng2kor;

import org.apache.lucene.analysis.TokenStream;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenFilterFactory;


public class JavacafeEng2KorConvertFilterFactory extends AbstractTokenFilterFactory {

    
    public JavacafeEng2KorConvertFilterFactory(IndexSettings indexSettings, Environment env , String name, Settings settings) {
        super(indexSettings, name, settings);
    }
    

    @Override
    public TokenStream create(TokenStream tokenStream) {
        return new JavacafeEng2KorConvertFilter(tokenStream);
    }
    
    
}
