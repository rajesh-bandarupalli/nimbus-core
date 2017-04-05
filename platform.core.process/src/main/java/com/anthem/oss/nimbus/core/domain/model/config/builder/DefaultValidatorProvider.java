/**
 * 
 */
package com.anthem.oss.nimbus.core.domain.model.config.builder;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.anthem.oss.nimbus.core.domain.model.config.ValidatorProvider;

/**
 * @author Rakesh Patel
 *
 */
public class DefaultValidatorProvider implements ValidatorProvider {

	public static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    
    public Validator getValidator() {
    	return factory.getValidator();
    }
} 
