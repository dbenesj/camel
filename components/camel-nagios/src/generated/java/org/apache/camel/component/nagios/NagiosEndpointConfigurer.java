/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nagios;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NagiosEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NagiosEndpoint target = (NagiosEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "encryption": target.getConfiguration().setEncryption(property(camelContext, com.googlecode.jsendnsca.encryption.Encryption.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sendsync":
        case "sendSync": target.setSendSync(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "encryption": return com.googlecode.jsendnsca.encryption.Encryption.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "sendsync":
        case "sendSync": return boolean.class;
        case "timeout": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NagiosEndpoint target = (NagiosEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "encryption": return target.getConfiguration().getEncryption();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "sendsync":
        case "sendSync": return target.isSendSync();
        case "timeout": return target.getConfiguration().getTimeout();
        default: return null;
        }
    }
}
