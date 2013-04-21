/**
 *
 *  Copyright (C) 2009 SYSNET International, Inc. <support@sysnetint.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.openhie.openempi.transformation.function;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractByteArrayTransformationFunction extends AbstractTransformationFunctionBase
{
	protected final Log log = LogFactory.getLog(getClass());

	public AbstractByteArrayTransformationFunction() {
	}
	
	protected Object stringTransformCore(String field, Map<String, Object> parameters) {
		throw new UnsupportedOperationException("Function " + getName() + " is not string type transformation");
	}
	
	public Object transform(Object field, Map<String, Object> parameters) {
		return transformByteArray(field, parameters != null ? parameters : new HashMap<String, Object>());
	}
}
