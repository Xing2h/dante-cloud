/*
 * Copyright (c) 2020-2030 ZHENGGENGWEI(码匠君)<herodotus@aliyun.com>
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
 * Eurynome Cloud 采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改 Eurynome Cloud 源码头部的版权声明。
 * 3.请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 https://gitee.com/herodotus/eurynome-cloud
 * 5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/herodotus/eurynome-cloud
 * 6.若您的项目无法满足以上几点，可申请商业授权
 */

package cn.herodotus.eurynome.module.upms.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableMap;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 机构类别 </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/9/22 17:12
 */
@Schema(title =  "机构类别")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum OrganizationCategory {

    /**
     * enum
     */
    ENTERPRISE(0, "企业机构"),
    PARTY(1, "党组机构"),
    LEAGUE(2, "团青机构");

    @Schema(title = "索引")
    private final Integer index;
    @Schema(title = "文字")
    private final String text;

    private static final Map<Integer, OrganizationCategory> INDEX_MAP = new HashMap<>();
    private static final List<Map<String, Object>> TO_JSON_STRUCT = new ArrayList<>();

    static {
        for (OrganizationCategory organizationCategory : OrganizationCategory.values()) {
            INDEX_MAP.put(organizationCategory.getIndex(), organizationCategory);
            TO_JSON_STRUCT.add(organizationCategory.getIndex(),
                    ImmutableMap.<String, Object>builder()
                            .put("value", organizationCategory.getIndex())
                            .put("key", organizationCategory.name())
                            .put("text", organizationCategory.getText())
                            .build());
        }
    }

    OrganizationCategory(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    /**
     * 不加@JsonValue，转换的时候转换出完整的对象。
     * 加了@JsonValue，只会显示相应的属性的值
     * <p>
     * 不使用@JsonValue @JsonDeserializer类里面要做相应的处理
     *
     * @return Enum索引
     */
    @JsonValue
    public Integer getIndex() {
        return index;
    }

    public String getText() {
        return this.text;
    }

    public static OrganizationCategory getOrganizationCategory(Integer index) {
        return INDEX_MAP.get(index);
    }

    public static List<Map<String, Object>> getToJsonStruct() {
        return TO_JSON_STRUCT;
    }
}
