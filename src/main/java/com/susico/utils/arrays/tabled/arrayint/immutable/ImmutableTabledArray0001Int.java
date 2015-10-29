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

package com.susico.utils.arrays.tabled.arrayint.immutable;

import com.susico.utils.arrays.access.ArrayAccess;

import com.susico.utils.UnsafeAccess;
import sun.misc.Unsafe;

import com.susico.utils.functions.*;

import org.jetbrains.annotations.*;

public abstract class ImmutableTabledArray0001Int extends
    ImmutableTabledArray0000Int {
    
    protected final static long value0000FieldOffset = UnsafeAccess.getFieldOffset(
        ImmutableTabledArray0001Int.class, "value0000");

    protected final @NotNull int value0000;

    public final @NotNull int getValue0000() {
        return value0000;
    }

    public final @NotNull int getValue0000Volatile() {
        return (int) UNSAFE.getIntVolatile(this, value0000FieldOffset);
    }

    public final @NotNull int getValue0000Unsafe() {
        return (int) UNSAFE.getInt(this, value0000FieldOffset);
    }
    
    protected ImmutableTabledArray0001Int(
        final boolean checked, final int length, final @NotNull int ... values) {
        this(checked, 0, length, values);
    }

    protected ImmutableTabledArray0001Int(
        final boolean checked, final int definedAsValues, final int length, final @NotNull int ... values) {
        super(checked, definedAsValues + 1, length, values);

        if (values.length >= 1) {
            this.value0000 = ArrayAccess.UNCHECKED.get(0, values);
        } else {
            this.value0000 = 0;
        }

    }

    public static  ImmutableTabledArray0001Int getInstance(
        final boolean checked, final int length, final @NotNull int ... values) {
        return new ImmutableTabledArray0001Int(checked, length, values) {
    
    
            @Override
            public final @NotNull int get(final int index) {
                switch (index) {
        
                    case 0:
                        return getValue0000();
                                
                    default:
                        return getFromRest(index);
                }
            }
            
            @Override
            public final @NotNull int getUnsafe(final int index) {
                switch (index) {
        
                    case 0:
                        return getValue0000Unsafe();
                                
                    default:
                        return getFromRest(index);
                }
            }
            
            @Override
            public final @NotNull int getVolatile(final int index) {
                switch (index) {
        
                    case 0:
                        return getValue0000Volatile();
                                
                    default:
                        return getVolatileFromRest(index);
                }
            }
            
        };
    }
}