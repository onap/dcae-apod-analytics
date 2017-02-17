/*
 * ============LICENSE_START=========================================================
 * dcae-analytics
 * ================================================================================
 *  Copyright © 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.openecomp.dcae.analytics.dmaap.domain.config;

/**
 * <p>
 *      Marker Interface for all DMaaP MR Configs.
 *      Holds Default configuration parameters for all Configs
 * <p>
 * @author Rajiv Singla. Creation Date: 10/12/2016.
 */
public interface DMaaPMRConfig {

    Integer DEFAULT_PORT_NUMBER = 80; // default port number
    String DEFAULT_USER_NAME = null; // default to no username
    String DEFAULT_USER_PASSWORD = null; // defaults to no userPassword
    String DEFAULT_PROTOCOL = "https"; // defaults to using https protocol
    String DEFAULT_CONTENT_TYPE = "application/json";  // defaults to json content type

}