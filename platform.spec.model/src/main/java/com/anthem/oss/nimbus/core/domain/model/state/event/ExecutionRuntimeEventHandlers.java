/**
 * 
 */
package com.anthem.oss.nimbus.core.domain.model.state.event;

import java.lang.annotation.Annotation;

import com.anthem.oss.nimbus.core.domain.EventHandler;
import com.anthem.oss.nimbus.core.domain.definition.event.ExecutionRuntimeEvent.OnRuntimeStart;
import com.anthem.oss.nimbus.core.domain.definition.event.ExecutionRuntimeEvent.OnRuntimeStop;
import com.anthem.oss.nimbus.core.domain.model.state.ExecutionRuntime;

/**
 * @author Soham Chakravarti
 *
 */
public final class ExecutionRuntimeEventHandlers {

	@EventHandler(OnRuntimeStart.class)
	public interface OnRuntimeStartHandler<A extends Annotation> {
		
		public void handle(A configuredAnnotation, ExecutionRuntime execRt);
	}
	
	
	@EventHandler(OnRuntimeStop.class)
	public interface OnRuntimeStopHandler<A extends Annotation> {
		
		public void handle(A configuredAnnotation, ExecutionRuntime execRt);
	}
}
