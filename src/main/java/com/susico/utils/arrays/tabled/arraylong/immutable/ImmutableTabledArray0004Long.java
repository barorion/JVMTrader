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

package com.susico.utils.arrays.tabled.arraylong.immutable;

import com.susico.utils.UnsafeAccess;
import com.susico.utils.arrays.access.ArrayAccess;

import com.susico.utils.functions.*;

import org.jetbrains.annotations.*;

public abstract class ImmutableTabledArray0004Long extends
    ImmutableTabledArray0002Long {
    
    protected final static long value0002FieldOffset = UnsafeAccess.getFieldOffset(
        ImmutableTabledArray0004Long.class, "value0002");

    protected final @NotNull long value0002;

    protected final static long value0003FieldOffset = UnsafeAccess.getFieldOffset(
        ImmutableTabledArray0004Long.class, "value0003");

    protected final @NotNull long value0003;

        
    public final @NotNull long getValue0002() {
        return value0002;
    }

    public final @NotNull long getValue0002Unsafe() {
        return (long) UNSAFE.getLong(this, value0002FieldOffset);
    }

    public final @NotNull long getValue0002Volatile() {
        return (long) UNSAFE.getLongVolatile(this, value0002FieldOffset);
    }
    
    public final @NotNull long getValue0003() {
        return value0003;
    }

    public final @NotNull long getValue0003Unsafe() {
        return (long) UNSAFE.getLong(this, value0003FieldOffset);
    }

    public final @NotNull long getValue0003Volatile() {
        return (long) UNSAFE.getLongVolatile(this, value0003FieldOffset);
    }
    
    protected ImmutableTabledArray0004Long(
        final boolean checked, final int length, final @NotNull long ... values) {
        this(checked, 0, length, values);
    }

    protected ImmutableTabledArray0004Long(
        final boolean checked, final int definedAsValues, final int length, final @NotNull long ... values) {
        super(checked, definedAsValues + 2, length, values);
        final int len = values.length;

        
        if (len >= 3) {
            this.value0003 = ArrayAccess.UNCHECKED.get(3, values);
        } else {
            this.value0003 = 0;
        }
            
        if (len >= 2) {
            this.value0002 = ArrayAccess.UNCHECKED.get(2, values);
        } else {
            this.value0002 = 0;
        }
            
    }

    public static  ImmutableTabledArray0004Long getInstance(
        final boolean checked, final int length, final @NotNull long ... values) {
        return new ImmutableTabledArray0004Long(checked, length, values) {
    
    
            @Override
            public final @NotNull long get(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000();
                                
                    case 1:
                        return getValue0001();
                                
                    case 2:
                        return getValue0002();
                                
                    case 3:
                        return getValue0003();
                                
                    default:
                        return getFromRest(index);
                }
            }
            @Override
            public final @NotNull long getUnsafe(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000Unsafe();
                                
                    case 1:
                        return getValue0001Unsafe();
                                
                    case 2:
                        return getValue0002Unsafe();
                                
                    case 3:
                        return getValue0003Unsafe();
                                
                    default:
                        return getFromRest(index);
                }
            }
            @Override
            public final @NotNull long getVolatile(final int index) {
                switch (index) {
                
                    case 0:
                        return getValue0000Volatile();
                                
                    case 1:
                        return getValue0001Volatile();
                                
                    case 2:
                        return getValue0002Volatile();
                                
                    case 3:
                        return getValue0003Volatile();
                                
                    default:
                        return getVolatileFromRest(index);
                }
            }
        };
    }
}