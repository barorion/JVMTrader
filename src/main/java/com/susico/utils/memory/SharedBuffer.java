/*
 * Copyright (c) 2015. Suminda Sirinath Salpitikorala Dharmasena
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
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
 */

package com.susico.utils.memory;

import com.susico.utils.memory.MemoryRange;
import org.jetbrains.annotations.NotNull;

import java.io.Closeable;

/**
 * Created by sirin_000 on 06/10/2015.
 */
public interface SharedBuffer<T> extends Closeable {
    T map(@NotNull final MemoryRange memoryRange);

    default T map(final long position, final long size) {
        final MemoryRange memoryRange = MemoryRange.getInstance(position, size);

        return map(memoryRange);
    }

    boolean unmap(@NotNull final MemoryRange memoryRange);

    default boolean unmap(final long position, final long size) {
        final MemoryRange memoryRange = MemoryRange.getInstance(position, size);

        return unmap(memoryRange);
    }
}
