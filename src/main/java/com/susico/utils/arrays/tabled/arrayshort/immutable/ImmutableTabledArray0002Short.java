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

package com.susico.utils.arrays.tabled.arrayshort.immutable;

import com.susico.utils.UnsafeAccess;
import com.susico.utils.arrays.access.ArrayAccess;

import sun.misc.Contended;

import com.susico.utils.functions.*;

import org.jetbrains.annotations.*;

public abstract class ImmutableTabledArray0002Short extends
    ImmutableTabledArray0001Short {
    
    protected final static long value0001FieldOffset = UnsafeAccess.getFieldOffset(
        ImmutableTabledArray0002Short.class, "value0001");

    protected final @NotNull short value0001;

        
    public final @NotNull short getValue0001() {
        return value0001;
    }

    public final @NotNull short getValue0001Unsafe() {
        return (short) UNSAFE.getShort(this, value0001FieldOffset);
    }

    public final @NotNull short getValue0001Volatile() {
        return (short) UNSAFE.getShortVolatile(this, value0001FieldOffset);
    }
    
    protected ImmutableTabledArray0002Short(
        final boolean checked, final int length, final @NotNull short ... values) {
        this(checked, 0, length, values);
    }

    protected ImmutableTabledArray0002Short(
        final boolean checked, final int definedAsValues, final int length, final @NotNull short ... values) {
        super(checked, definedAsValues + 1, length, values);
        final int len = values.length;

        
        if (len >= 1) {
            this.value0001 = ArrayAccess.UNCHECKED.get(1, values);
        } else {
            this.value0001 = 0;
        }
            
    }

    public static  ImmutableTabledArray0002Short getInstance(
        final boolean checked, final int length, final @NotNull short ... values) {
        return new ImmutableTabledArray0002Short(checked, length, values) {
    
    
            @Override
            public final @NotNull short get(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000();
                                
                    case 1:
                        return getValue0001();
                                
                    default:
                        return getFromRest(index);
                }
            }
            @Override
            public final @NotNull short getUnsafe(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000Unsafe();
                                
                    case 1:
                        return getValue0001Unsafe();
                                
                    default:
                        return getFromRest(index);
                }
            }
            @Override
            public final @NotNull short getVolatile(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000Volatile();
                                
                    case 1:
                        return getValue0001Volatile();
                                
                    default:
                        return getVolatileFromRest(index);
                }
            }
        };
    }
}
