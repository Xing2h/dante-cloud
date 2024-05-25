/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2020-2030 郑庚伟 ZHENGGENGWEI (码匠君), <herodotus@aliyun.com> Licensed under the AGPL License
 *
 * This file is part of Dante Cloud.
 *
 * Dante Cloud is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Dante Cloud is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.herodotus.cn>.
 */

package cn.herodotus.dante.bpmn.logic.domain.debezium;

import cn.herodotus.dante.bpmn.logic.domain.base.BaseEntity;
import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * <p>Description: Debezium事件响应对应实体Message </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/7/20 19:03
 */
public class Message<T extends BaseEntity> implements Serializable {

    private Field schema;
    private Payload<T> payload;

    public Field getSchema() {
        return schema;
    }

    public void setSchema(Field schema) {
        this.schema = schema;
    }

    public Payload<T> getPayload() {
        return payload;
    }

    public void setPayload(Payload<T> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("schema", schema)
                .add("payload", payload)
                .toString();
    }
}
