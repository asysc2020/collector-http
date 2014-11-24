/* Copyright 2010-2014 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.collector.http.fetch;

import org.apache.http.client.HttpClient;

import com.norconex.commons.lang.map.Properties;

/**
 * Fetches the HTTP Header, typically via a HEAD request.
 * @author Pascal Essiembre
 */
public interface IHttpMetadataFetcher {

    /**
     * Returning <code>null</code> means the headers could not be fetched
     * and the associated document will be skipped (treated as rejected).
     * @param httpClient the HTTP Client
     * @param url the url from which to fetch the headers
     * @return  HTTP headers as metadata
     */
    Properties fetchHTTPHeaders(HttpClient httpClient, String url);
	
}
