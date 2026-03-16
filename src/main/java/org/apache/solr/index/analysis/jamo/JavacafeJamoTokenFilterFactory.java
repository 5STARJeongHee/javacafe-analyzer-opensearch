package org.apache.solr.index.analysis.jamo;

import org.apache.lucene.analysis.TokenFilterFactory;
import org.apache.lucene.analysis.TokenStream;
import org.opensearch.index.analysis.jamo.JavacafeJamoTokenFilter;

import java.util.Map;

public class JavacafeJamoTokenFilterFactory  extends TokenFilterFactory {

    
    public JavacafeJamoTokenFilterFactory(Map<String, String> args) {
        super(args);
    }
    

    @Override
    public TokenStream create(TokenStream stream) {
        return new JavacafeJamoTokenFilter(stream);
    }

    
    
}
