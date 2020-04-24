/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: luban-cloud
 * Module Name: luban-cloud-component-common
 * File Name: OAuth2GrantType.java
 * Author: gengwei.zheng
 * Date: 2019/11/8 下午4:14
 * LastModified: 2019/10/28 上午11:56
 */

package cn.herodotus.eurynome.component.security.enums;

import cn.herodotus.eurynome.component.common.constants.SecurityConstants;
import com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum OAuth2GrantType {

    /**
     * enum
     */
    AUTHORIZATION_CODE(SecurityConstants.AUTHORIZATION_CODE, "Authorization Code 模式"),
    IMPLICIT(SecurityConstants.IMPLICIT, "Implicit 模式"),
    PASSWORD(SecurityConstants.PASSWORD, "Password 模式"),
    CLIENT_CREDENTIALS(SecurityConstants.CLIENT_CREDENTIALS, "Client Credentials 模式");

    private final String grant;
    private final String description;

    private static final Map<Integer, OAuth2GrantType> indexMap = new HashMap<>();
    private static final List<Map<String, Object>> toJsonStruct = new ArrayList<>();

    static {
        for (OAuth2GrantType oAuth2GrantType : OAuth2GrantType.values()) {
            indexMap.put(oAuth2GrantType.ordinal(), oAuth2GrantType);
            toJsonStruct.add(oAuth2GrantType.ordinal(),
                    ImmutableMap.<String, Object>builder()
                            .put("value", oAuth2GrantType.getGrant())
                            .put("key", oAuth2GrantType.name())
                            .put("text", oAuth2GrantType.getDescription())
                            .put("index", oAuth2GrantType.ordinal())
                            .build());
        }
    }

    OAuth2GrantType(String grant, String description) {
        this.grant = grant;
        this.description = description;
    }

    public String getGrant() {
        return grant;
    }

    public String getDescription() {
        return description;
    }

    public static OAuth2GrantType getGrant(Integer grant) {
        return indexMap.get(grant);
    }

    public static List<Map<String, Object>> getToJsonStruct() {
        return toJsonStruct;
    }
}
