package org.opensearch.index.analysis.spell;

import org.apache.lucene.analysis.TokenStream;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenFilterFactory;

public class JavacafeSpellFilterFactory extends AbstractTokenFilterFactory {

    
    public JavacafeSpellFilterFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
    }
    

    @Override
    public TokenStream create(TokenStream stream) {
        return new JavacafeSpellFilter(stream);
    }

    
    
}
