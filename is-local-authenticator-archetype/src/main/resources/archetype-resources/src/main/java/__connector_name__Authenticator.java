#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.wso2.carbon.identity.application.authentication.framework.AbstractApplicationAuthenticator;
import org.wso2.carbon.identity.application.authentication.framework.LocalApplicationAuthenticator;
import org.wso2.carbon.identity.application.authentication.framework.context.AuthenticationContext;
import org.wso2.carbon.identity.application.authentication.framework.exception.AuthenticationFailedException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Authenticator of ${connector_name}.
 */
public class ${connector_name}Authenticator extends AbstractApplicationAuthenticator
        implements LocalApplicationAuthenticator {

    private static Log log = LogFactory.getLog(${connector_name}Authenticator.class);

    /**
     * This method is used to initiate the authentication request
     *
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @param context AuthenticationContext
     * @throws AuthenticationFailedException
     */
    @Override
    protected void initiateAuthenticationRequest(HttpServletRequest request,
                                                 HttpServletResponse response, AuthenticationContext context)
        throws AuthenticationFailedException {

        // Use this method to initiate the authentication request. Eg. this may be used to redirect user to a page
        // for submitting credentials.

        //TODO: Implement the required logic
        super.initiateAuthenticationRequest(request, response, context);
    }

    /**
     * This method is used to handle the authentication request, this would be a check to see if request has both
     * username and password params
     *
     * @param request HttpServletRequest
     */
    public boolean canHandle(HttpServletRequest request) {

        // In a multi option scenario, check whether the request from user is meant to this authenticator or not.
        // eg. For basic authentication, this would be a check to see if request has both username and password params.

        //TODO: Implement the required logic
        return true;
    }

    /**
     * This method is used to process the authentication response
     *
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @param context AuthenticationContext
     * @throws AuthenticationFailedException
     */
    @Override
    protected void processAuthenticationResponse(HttpServletRequest request,
                                                 HttpServletResponse response, AuthenticationContext context)
        throws AuthenticationFailedException {

        // Does the actual authentication

        //TODO: Implement the required logic
    }

    /**
     * This method is to get the correlation ID from the request
     *
     * @param request HttpServletRequest
     */
    public String getContextIdentifier(HttpServletRequest request) {

        // The requests are correlated by a UUID which is generated at the beginning of the authentication flow
        // This method is to get the correlation ID from the request
        // In most cases this should be unchanged.
        return request.getParameter("sessionDataKey");
    }

    /**
     * Get the friendly name of the Authenticator
     */
    public String getFriendlyName() {

        return ${connector_name}AuthenticatorConstants.AUTHENTICATOR_FRIENDLY_NAME;
    }

    /**
     * Get the name of the Authenticator
     */
    public String getName() {

        return ${connector_name}AuthenticatorConstants.AUTHENTICATOR_NAME;
    }
}
