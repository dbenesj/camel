/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.ExtendedCamelContext;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ExtendedCamelContextConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": target.setAnnotationBasedProcessorFactory(property(camelContext, org.apache.camel.spi.AnnotationBasedProcessorFactory.class, value)); return true;
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": target.setAsyncProcessorAwaitManager(property(camelContext, org.apache.camel.spi.AsyncProcessorAwaitManager.class, value)); return true;
        case "basepackagescan":
        case "BasePackageScan": target.setBasePackageScan(property(camelContext, java.lang.String.class, value)); return true;
        case "beanintrospection":
        case "BeanIntrospection": target.setBeanIntrospection(property(camelContext, org.apache.camel.spi.BeanIntrospection.class, value)); return true;
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": target.setBootstrapConfigurerResolver(property(camelContext, org.apache.camel.spi.ConfigurerResolver.class, value)); return true;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": target.setBootstrapFactoryFinder(property(camelContext, org.apache.camel.spi.FactoryFinder.class, value)); return true;
        case "dataformatresolver":
        case "DataFormatResolver": target.setDataFormatResolver(property(camelContext, org.apache.camel.spi.DataFormatResolver.class, value)); return true;
        case "deferservicefactory":
        case "DeferServiceFactory": target.setDeferServiceFactory(property(camelContext, org.apache.camel.spi.DeferServiceFactory.class, value)); return true;
        case "description":
        case "Description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "devconsoleresolver":
        case "DevConsoleResolver": target.setDevConsoleResolver(property(camelContext, org.apache.camel.console.DevConsoleResolver.class, value)); return true;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": target.setErrorHandlerFactory(property(camelContext, org.apache.camel.ErrorHandlerFactory.class, value)); return true;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": target.setEventNotificationApplicable(property(camelContext, boolean.class, value)); return true;
        case "exchangefactory":
        case "ExchangeFactory": target.setExchangeFactory(property(camelContext, org.apache.camel.spi.ExchangeFactory.class, value)); return true;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": target.setExchangeFactoryManager(property(camelContext, org.apache.camel.spi.ExchangeFactoryManager.class, value)); return true;
        case "factoryfinderresolver":
        case "FactoryFinderResolver": target.setFactoryFinderResolver(property(camelContext, org.apache.camel.spi.FactoryFinderResolver.class, value)); return true;
        case "headersmapfactory":
        case "HeadersMapFactory": target.setHeadersMapFactory(property(camelContext, org.apache.camel.spi.HeadersMapFactory.class, value)); return true;
        case "healthcheckresolver":
        case "HealthCheckResolver": target.setHealthCheckResolver(property(camelContext, org.apache.camel.health.HealthCheckResolver.class, value)); return true;
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": target.setInterceptEndpointFactory(property(camelContext, org.apache.camel.spi.InterceptEndpointFactory.class, value)); return true;
        case "internalprocessorfactory":
        case "InternalProcessorFactory": target.setInternalProcessorFactory(property(camelContext, org.apache.camel.spi.InternalProcessorFactory.class, value)); return true;
        case "lightweight":
        case "Lightweight": target.setLightweight(property(camelContext, boolean.class, value)); return true;
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": target.setModelJAXBContextFactory(property(camelContext, org.apache.camel.spi.ModelJAXBContextFactory.class, value)); return true;
        case "modeltoxmldumper":
        case "ModelToXMLDumper": target.setModelToXMLDumper(property(camelContext, org.apache.camel.spi.ModelToXMLDumper.class, value)); return true;
        case "modelinefactory":
        case "ModelineFactory": target.setModelineFactory(property(camelContext, org.apache.camel.spi.ModelineFactory.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "packagescanclassresolver":
        case "PackageScanClassResolver": target.setPackageScanClassResolver(property(camelContext, org.apache.camel.spi.PackageScanClassResolver.class, value)); return true;
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": target.setPackageScanResourceResolver(property(camelContext, org.apache.camel.spi.PackageScanResourceResolver.class, value)); return true;
        case "periodtaskresolver":
        case "PeriodTaskResolver": target.setPeriodTaskResolver(property(camelContext, org.apache.camel.spi.PeriodTaskResolver.class, value)); return true;
        case "periodtaskscheduler":
        case "PeriodTaskScheduler": target.setPeriodTaskScheduler(property(camelContext, org.apache.camel.spi.PeriodTaskScheduler.class, value)); return true;
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": target.setProcessorExchangeFactory(property(camelContext, org.apache.camel.spi.ProcessorExchangeFactory.class, value)); return true;
        case "processorfactory":
        case "ProcessorFactory": target.setProcessorFactory(property(camelContext, org.apache.camel.spi.ProcessorFactory.class, value)); return true;
        case "reactiveexecutor":
        case "ReactiveExecutor": target.setReactiveExecutor(property(camelContext, org.apache.camel.spi.ReactiveExecutor.class, value)); return true;
        case "registry":
        case "Registry": target.setRegistry(property(camelContext, org.apache.camel.spi.Registry.class, value)); return true;
        case "resourceloader":
        case "ResourceLoader": target.setResourceLoader(property(camelContext, org.apache.camel.spi.ResourceLoader.class, value)); return true;
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": target.setRestBindingJaxbDataFormatFactory(property(camelContext, org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class, value)); return true;
        case "routefactory":
        case "RouteFactory": target.setRouteFactory(property(camelContext, org.apache.camel.spi.RouteFactory.class, value)); return true;
        case "routesloader":
        case "RoutesLoader": target.setRoutesLoader(property(camelContext, org.apache.camel.spi.RoutesLoader.class, value)); return true;
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": target.setRuntimeCamelCatalog(property(camelContext, org.apache.camel.catalog.RuntimeCamelCatalog.class, value)); return true;
        case "startupsteprecorder":
        case "StartupStepRecorder": target.setStartupStepRecorder(property(camelContext, org.apache.camel.spi.StartupStepRecorder.class, value)); return true;
        case "unitofworkfactory":
        case "UnitOfWorkFactory": target.setUnitOfWorkFactory(property(camelContext, org.apache.camel.spi.UnitOfWorkFactory.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": return org.apache.camel.spi.AnnotationBasedProcessorFactory.class;
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": return org.apache.camel.spi.AsyncProcessorAwaitManager.class;
        case "basepackagescan":
        case "BasePackageScan": return java.lang.String.class;
        case "beanintrospection":
        case "BeanIntrospection": return org.apache.camel.spi.BeanIntrospection.class;
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": return org.apache.camel.spi.ConfigurerResolver.class;
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return org.apache.camel.spi.FactoryFinder.class;
        case "dataformatresolver":
        case "DataFormatResolver": return org.apache.camel.spi.DataFormatResolver.class;
        case "deferservicefactory":
        case "DeferServiceFactory": return org.apache.camel.spi.DeferServiceFactory.class;
        case "description":
        case "Description": return java.lang.String.class;
        case "devconsoleresolver":
        case "DevConsoleResolver": return org.apache.camel.console.DevConsoleResolver.class;
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return org.apache.camel.ErrorHandlerFactory.class;
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return boolean.class;
        case "exchangefactory":
        case "ExchangeFactory": return org.apache.camel.spi.ExchangeFactory.class;
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return org.apache.camel.spi.ExchangeFactoryManager.class;
        case "factoryfinderresolver":
        case "FactoryFinderResolver": return org.apache.camel.spi.FactoryFinderResolver.class;
        case "headersmapfactory":
        case "HeadersMapFactory": return org.apache.camel.spi.HeadersMapFactory.class;
        case "healthcheckresolver":
        case "HealthCheckResolver": return org.apache.camel.health.HealthCheckResolver.class;
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": return org.apache.camel.spi.InterceptEndpointFactory.class;
        case "internalprocessorfactory":
        case "InternalProcessorFactory": return org.apache.camel.spi.InternalProcessorFactory.class;
        case "lightweight":
        case "Lightweight": return boolean.class;
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": return org.apache.camel.spi.ModelJAXBContextFactory.class;
        case "modeltoxmldumper":
        case "ModelToXMLDumper": return org.apache.camel.spi.ModelToXMLDumper.class;
        case "modelinefactory":
        case "ModelineFactory": return org.apache.camel.spi.ModelineFactory.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "packagescanclassresolver":
        case "PackageScanClassResolver": return org.apache.camel.spi.PackageScanClassResolver.class;
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": return org.apache.camel.spi.PackageScanResourceResolver.class;
        case "periodtaskresolver":
        case "PeriodTaskResolver": return org.apache.camel.spi.PeriodTaskResolver.class;
        case "periodtaskscheduler":
        case "PeriodTaskScheduler": return org.apache.camel.spi.PeriodTaskScheduler.class;
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": return org.apache.camel.spi.ProcessorExchangeFactory.class;
        case "processorfactory":
        case "ProcessorFactory": return org.apache.camel.spi.ProcessorFactory.class;
        case "reactiveexecutor":
        case "ReactiveExecutor": return org.apache.camel.spi.ReactiveExecutor.class;
        case "registry":
        case "Registry": return org.apache.camel.spi.Registry.class;
        case "resourceloader":
        case "ResourceLoader": return org.apache.camel.spi.ResourceLoader.class;
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": return org.apache.camel.spi.RestBindingJaxbDataFormatFactory.class;
        case "routefactory":
        case "RouteFactory": return org.apache.camel.spi.RouteFactory.class;
        case "routesloader":
        case "RoutesLoader": return org.apache.camel.spi.RoutesLoader.class;
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": return org.apache.camel.catalog.RuntimeCamelCatalog.class;
        case "startupsteprecorder":
        case "StartupStepRecorder": return org.apache.camel.spi.StartupStepRecorder.class;
        case "unitofworkfactory":
        case "UnitOfWorkFactory": return org.apache.camel.spi.UnitOfWorkFactory.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.ExtendedCamelContext target = (org.apache.camel.ExtendedCamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "annotationbasedprocessorfactory":
        case "AnnotationBasedProcessorFactory": return target.getAnnotationBasedProcessorFactory();
        case "asyncprocessorawaitmanager":
        case "AsyncProcessorAwaitManager": return target.getAsyncProcessorAwaitManager();
        case "basepackagescan":
        case "BasePackageScan": return target.getBasePackageScan();
        case "beanintrospection":
        case "BeanIntrospection": return target.getBeanIntrospection();
        case "bootstrapconfigurerresolver":
        case "BootstrapConfigurerResolver": return target.getBootstrapConfigurerResolver();
        case "bootstrapfactoryfinder":
        case "BootstrapFactoryFinder": return target.getBootstrapFactoryFinder();
        case "dataformatresolver":
        case "DataFormatResolver": return target.getDataFormatResolver();
        case "deferservicefactory":
        case "DeferServiceFactory": return target.getDeferServiceFactory();
        case "description":
        case "Description": return target.getDescription();
        case "devconsoleresolver":
        case "DevConsoleResolver": return target.getDevConsoleResolver();
        case "errorhandlerfactory":
        case "ErrorHandlerFactory": return target.getErrorHandlerFactory();
        case "eventnotificationapplicable":
        case "EventNotificationApplicable": return target.isEventNotificationApplicable();
        case "exchangefactory":
        case "ExchangeFactory": return target.getExchangeFactory();
        case "exchangefactorymanager":
        case "ExchangeFactoryManager": return target.getExchangeFactoryManager();
        case "factoryfinderresolver":
        case "FactoryFinderResolver": return target.getFactoryFinderResolver();
        case "headersmapfactory":
        case "HeadersMapFactory": return target.getHeadersMapFactory();
        case "healthcheckresolver":
        case "HealthCheckResolver": return target.getHealthCheckResolver();
        case "interceptendpointfactory":
        case "InterceptEndpointFactory": return target.getInterceptEndpointFactory();
        case "internalprocessorfactory":
        case "InternalProcessorFactory": return target.getInternalProcessorFactory();
        case "lightweight":
        case "Lightweight": return target.isLightweight();
        case "modeljaxbcontextfactory":
        case "ModelJAXBContextFactory": return target.getModelJAXBContextFactory();
        case "modeltoxmldumper":
        case "ModelToXMLDumper": return target.getModelToXMLDumper();
        case "modelinefactory":
        case "ModelineFactory": return target.getModelineFactory();
        case "name":
        case "Name": return target.getName();
        case "packagescanclassresolver":
        case "PackageScanClassResolver": return target.getPackageScanClassResolver();
        case "packagescanresourceresolver":
        case "PackageScanResourceResolver": return target.getPackageScanResourceResolver();
        case "periodtaskresolver":
        case "PeriodTaskResolver": return target.getPeriodTaskResolver();
        case "periodtaskscheduler":
        case "PeriodTaskScheduler": return target.getPeriodTaskScheduler();
        case "processorexchangefactory":
        case "ProcessorExchangeFactory": return target.getProcessorExchangeFactory();
        case "processorfactory":
        case "ProcessorFactory": return target.getProcessorFactory();
        case "reactiveexecutor":
        case "ReactiveExecutor": return target.getReactiveExecutor();
        case "registry":
        case "Registry": return target.getRegistry();
        case "resourceloader":
        case "ResourceLoader": return target.getResourceLoader();
        case "restbindingjaxbdataformatfactory":
        case "RestBindingJaxbDataFormatFactory": return target.getRestBindingJaxbDataFormatFactory();
        case "routefactory":
        case "RouteFactory": return target.getRouteFactory();
        case "routesloader":
        case "RoutesLoader": return target.getRoutesLoader();
        case "runtimecamelcatalog":
        case "RuntimeCamelCatalog": return target.getRuntimeCamelCatalog();
        case "startupsteprecorder":
        case "StartupStepRecorder": return target.getStartupStepRecorder();
        case "unitofworkfactory":
        case "UnitOfWorkFactory": return target.getUnitOfWorkFactory();
        default: return null;
        }
    }
}

