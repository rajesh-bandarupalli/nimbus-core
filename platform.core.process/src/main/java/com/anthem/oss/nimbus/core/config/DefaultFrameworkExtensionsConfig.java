/**
 * 
 */
package com.anthem.oss.nimbus.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anthem.oss.nimbus.core.BeanResolverStrategy;
import com.anthem.oss.nimbus.core.domain.model.state.extension.ActivateConditionalStateEventHandler;
import com.anthem.oss.nimbus.core.domain.model.state.extension.AuditStateChangeHandler;
import com.anthem.oss.nimbus.core.domain.model.state.extension.ConfigConditionalStateChangeHandler;

/**
 * @author Soham Chakravarti
 *
 */
@Configuration
public class DefaultFrameworkExtensionsConfig {

	@Bean
	public ActivateConditionalStateEventHandler extensionActivateConditionalHandler(BeanResolverStrategy beanResolver) {
		return new ActivateConditionalStateEventHandler(beanResolver);
	}

	@Bean
	public AuditStateChangeHandler extensionAuditStateChangeHandler(BeanResolverStrategy beanResolver) {
		return new AuditStateChangeHandler(beanResolver);
	}
	
	@Bean
	public ConfigConditionalStateChangeHandler extensionConfigConditionalStateChangeHandler(BeanResolverStrategy beanResolver) {
		return new ConfigConditionalStateChangeHandler(beanResolver);
	}
}