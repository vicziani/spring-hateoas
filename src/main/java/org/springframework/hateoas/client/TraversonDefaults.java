/*
 * Copyright 2019-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.hateoas.client;

import java.util.Collection;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * SPI that exposes {@link HttpMessageConverter}s and {@link LinkDiscoverer}s to be used by default by
 * {@link Traverson}. Not intended for public implementation.
 *
 * @author Oliver Drotbohm
 */
public interface TraversonDefaults {

	/**
	 * Returns the {@link HttpMessageConverter} instances to be registered for the given {@link MediaType}s.
	 *
	 * @param mediaTypes will never be {@literal null}.
	 * @return
	 */
	List<HttpMessageConverter<?>> getHttpMessageConverters(Collection<MediaType> mediaTypes);

	/**
	 * Returns the {@link LinkDiscoverer}s to be registered by default for the given {@link MediaType}s.
	 *
	 * @param mediaTypes will never be {@literal null}.
	 * @return
	 */
	List<LinkDiscoverer> getLinkDiscoverers(Collection<MediaType> mediaTypes);
}
