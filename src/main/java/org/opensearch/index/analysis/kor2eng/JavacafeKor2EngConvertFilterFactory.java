package org.opensearch.index.analysis.kor2eng;

import org.apache.lucene.analysis.TokenStream;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenFilterFactory;


public class JavacafeKor2EngConvertFilterFactory extends AbstractTokenFilterFactory {

    
    public JavacafeKor2EngConvertFilterFactory(IndexSettings indexSettings, Environment env , String name, Settings settings) {
        super(indexSettings, name, settings);
    }
    

    @Override
    public TokenStream create(TokenStream tokenStream) {
        return new JavacafeKor2EngConvertFilter(tokenStream);
    }
    
    
}
