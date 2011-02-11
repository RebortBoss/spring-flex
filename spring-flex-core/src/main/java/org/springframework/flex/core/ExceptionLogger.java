/*
 * Copyright 2002-2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.flex.core;

import flex.messaging.MessageException;

/**
 * Strategy interface for pluggable logging of {@link MessageException}s
 *
 * @author Jeremy Grelle
 */
public interface ExceptionLogger {

	/**
	 * Logs the {@link MessageException} that is the end result of processing an incoming BlazeDS request.  
	 * This will be called at the final moment before the <code>MessageException</code> is serialized as AMF 
	 * to be returned to the client.
	 * 
	 * @param messageException the exception to be logged
	 */
	public void log(Throwable throwable);
}
