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

package com.susico.utils.arrays.tabled.arrayboolean.mutable;

import com.susico.utils.arrays.access.ArrayAccess;

import com.susico.utils.UnsafeAccess;
import sun.misc.Unsafe;
import sun.misc.Contended;

import com.susico.utils.functions.*;

import org.jetbrains.annotations.*;

public abstract class MutableTabledArray0001Boolean extends
    MutableTabledArray0000Boolean {
    
    protected final static long value0000FieldOffset = UnsafeAccess.getFieldOffset(
        MutableTabledArray0001Boolean.class, "value0000");

    @Contended protected boolean value0000;

    public final @NotNull boolean getValue0000() {
        return value0000;
    }

    public final @NotNull boolean getValue0000Volatile() {
        return (boolean) UNSAFE.getBooleanVolatile(this, value0000FieldOffset);
    }

    public final @NotNull boolean getValue0000Unsafe() {
        return (boolean) UNSAFE.getBoolean(this, value0000FieldOffset);
    }
    
    public final void setValue0000(final @NotNull boolean value0000) {
        this.value0000 = value0000;
    }

    public final void putValue0000Volatile(final @NotNull boolean value0000) {
         UNSAFE.putBooleanVolatile(this, value0000FieldOffset, value0000);
    }

    public final void putValue0000Unsafe(final @NotNull boolean value0000) {
        UNSAFE.putBoolean(this, value0000FieldOffset, value0000);
    }
    
    protected MutableTabledArray0001Boolean(
        final boolean checked, final int length, final @NotNull boolean ... values) {
        this(checked, 0, length, values);
    }

    protected MutableTabledArray0001Boolean(
        final boolean checked, final int definedAsValues, final int length, final @NotNull boolean ... values) {
        super(checked, definedAsValues + 1, length, values);

        if (values.length >= 1) {
            this.value0000 = ArrayAccess.UNCHECKED.get(0, values);
        } else {
            this.value0000 = false;
        }

    }

    public static  MutableTabledArray0001Boolean getInstance(
        final boolean checked, final int length, final @NotNull boolean ... values) {
        return new MutableTabledArray0001Boolean(checked, length, values) {
    
            @Override
            public final void put(final int index, final @NotNull boolean value) {
                switch (index) {
                
                    case 0:
                        setValue0000(value);
                        break;
                    
                    default:
                        putToRest(index, value);
                }
            }
            
            @Override
            public final void putUnsafe(final int index, final @NotNull boolean value) {
                switch (index) {
                
                    case 0:
                        putValue0000Unsafe(value);
                        break;
                    
                    default:
                        putToRest(index, value);
                }
            }
            
            @Override
            public final void putVolatile(final int index, final @NotNull boolean value) {
                switch (index) {
                
                    case 0:
                        putValue0000Volatile(value);
                        break;
                    
                    default:
                        putVolatileToRest(index, value);
                }
            }
            
    
            @Override
            public final @NotNull boolean get(final int index) {
                switch (index) {
        
                    case 0:
                        return getValue0000();
                                
                    default:
                        return getFromRest(index);
                }
            }
            
            @Override
            public final @NotNull boolean getUnsafe(final int index) {
                switch (index) {
        
                    case 0:
                        return getValue0000Unsafe();
                                
                    default:
                        return getFromRest(index);
                }
            }
            
            @Override
            public final @NotNull boolean getVolatile(final int index) {
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
