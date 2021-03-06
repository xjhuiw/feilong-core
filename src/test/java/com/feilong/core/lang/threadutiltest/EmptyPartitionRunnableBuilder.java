/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.lang.threadutiltest;

import java.util.List;
import java.util.Map;

import com.feilong.core.lang.PartitionRunnableBuilder;
import com.feilong.core.lang.PartitionThreadEntity;

/**
 * 
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.10.4
 */
public class EmptyPartitionRunnableBuilder implements PartitionRunnableBuilder<Integer>{

    /** Static instance. */
    // the static instance works for all types
    public static final EmptyPartitionRunnableBuilder INSTANCE = new EmptyPartitionRunnableBuilder();

    /*
     * (non-Javadoc)
     * 
     * @see com.feilong.core.lang.PartitionRunnableBuilder#build(java.util.List, com.feilong.core.lang.PartitionThreadEntity, java.util.Map)
     */
    @Override
    public Runnable build(final List<Integer> perBatchList,final PartitionThreadEntity partitionThreadEntity,Map<String, ?> paramsMap){
        return null;
    }

}
