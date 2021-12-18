/*
 * Copyright (c) 2019-2021 Gengwei Zheng (herodotus@aliyun.com)
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
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-upms-logic
 * File Name: SysDefaultRoleRepository.java
 * Author: gengwei.zheng
 * Date: 2021/08/18 17:48:18
 */

package cn.herodotus.eurynome.upms.logic.repository.system;

import cn.herodotus.eurynome.data.base.repository.BaseRepository;
import cn.herodotus.eurynome.assistant.enums.AccountType;
import cn.herodotus.eurynome.upms.logic.entity.system.SysDefaultRole;
import org.springframework.data.jpa.repository.QueryHints;

import javax.persistence.QueryHint;

/**
 * <p>Description: 默认角色管理Repository </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/8/5 17:47
 */
public interface SysDefaultRoleRepository extends BaseRepository<SysDefaultRole, String> {

    /**
     * 根据场景查询当前场景对应的默认角色
     *
     * @param scene 场景 {@link AccountType}
     * @return {@link SysDefaultRole}
     */
    @QueryHints(@QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true"))
    SysDefaultRole findByScene(AccountType scene);

    /**
     * 根据默认角色ID查询默认角色
     *
     * @param defaultId 默认角色ID
     * @return {@link SysDefaultRole}
     */
    @QueryHints(@QueryHint(name = org.hibernate.annotations.QueryHints.CACHEABLE, value = "true"))
    SysDefaultRole findByDefaultId(String defaultId);
}
