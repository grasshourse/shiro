package org.jsecurity.web.support;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * TODO class JavaDoc
 *
 * @since 0.2
 * @author Les Hazlewood
 */
public class RequestParamStore<T> extends AbstractWebStore<T> {

    public RequestParamStore() {
        setCheckRequestParams( false );
    }

    public RequestParamStore( String name ) {
        super( name );
        setCheckRequestParams( false );
    }

    protected T onRetrieveValue( ServletRequest request, ServletResponse response ) {
        return getFromRequestParam( request );
    }

    protected void onStoreValue( T value, ServletRequest request, ServletResponse response ) {
        throw new UnsupportedOperationException( "RequestParamStores are read-only." );
    }
}
