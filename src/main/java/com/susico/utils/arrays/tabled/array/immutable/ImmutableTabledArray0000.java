// Auto generated. Do not edit directly!
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

package com.susico.utils.arrays.tabled.array.immutable;

public abstract class ImmutableTabledArray0000<T> extends ImmutableTabledArray<T> {
    protected ImmutableTabledArray0000(final boolean checked, final int length, final T ... values) {
        this(checked, 0, length, values);
    }

    protected ImmutableTabledArray0000(final boolean checked, final int definedAsValues, final int length, final T ... values) {
        super(checked, definedAsValues, length, values);
    }

    public static <T> ImmutableTabledArray0000<T> getInstance(final boolean checked, final int length, final T ... values) {
        return new ImmutableTabledArray0000<T>(checked, length, values) {
            @Override
            public final T get(final int index) {
                return getFromRest(index);
            }
        };
    }
}

