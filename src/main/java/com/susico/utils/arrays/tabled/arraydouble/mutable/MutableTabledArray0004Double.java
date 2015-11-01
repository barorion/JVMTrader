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

package com.susico.utils.arrays.tabled.arraydouble.mutable;

import com.susico.utils.UnsafeAccess;
import com.susico.utils.arrays.access.ArrayAccess;

import sun.misc.Contended;

import com.susico.utils.functions.*;

import org.jetbrains.annotations.*;

public abstract class MutableTabledArray0004Double extends
    MutableTabledArray0002Double {
    
    protected final static long value0002FieldOffset = UnsafeAccess.getFieldOffset(
        MutableTabledArray0004Double.class, "value0002");

    @Contended protected double value0002;

    protected final static long value0003FieldOffset = UnsafeAccess.getFieldOffset(
        MutableTabledArray0004Double.class, "value0003");

    @Contended protected double value0003;

        
    public final @NotNull double getValue0002() {
        return value0002;
    }

    public final @NotNull double getValue0002Unsafe() {
        return (double) UNSAFE.getDouble(this, value0002FieldOffset);
    }

    public final @NotNull double getValue0002Volatile() {
        return (double) UNSAFE.getDoubleVolatile(this, value0002FieldOffset);
    }
    
    public final @NotNull double getValue0003() {
        return value0003;
    }

    public final @NotNull double getValue0003Unsafe() {
        return (double) UNSAFE.getDouble(this, value0003FieldOffset);
    }

    public final @NotNull double getValue0003Volatile() {
        return (double) UNSAFE.getDoubleVolatile(this, value0003FieldOffset);
    }
    
    public final void setValue0002(final @NotNull double value0002) {
        this.value0002 = value0002;
    }

    public final void putValue0002Unsafe(final @NotNull double value0002) {
        UNSAFE.putDouble(this, value0002FieldOffset, value0002);
    }

    public final void putValue0002Volatile(final @NotNull double value0002) {
        UNSAFE.putDoubleVolatile(this, value0002FieldOffset, value0002);
    }
    
    public final void putValue0002Ordered(
        final @NotNull double value0002) {
            UNSAFE.putOrderedLong(this, value0002FieldOffset, Double.doubleToRawLongBits(value0002));
    }

    public final boolean compareAndSwapValue0002(final @NotNull double expected,
        final @NotNull double value0002) {
        return UNSAFE.compareAndSwapLong(this,
            value0002FieldOffset,
            Double.doubleToRawLongBits(expected), Double.doubleToRawLongBits(value0002));
    }

    public final @NotNull double getAndSetValue0002(
        final @NotNull double value0002) {
        return (double) Double.longBitsToDouble(UNSAFE.getAndSetLong(this,
            value0000FieldOffset,
            Double.doubleToRawLongBits(value0002)));
    }
        
    public final @NotNull double getAndUpdateValue0002(final @NotNull BiOpDouble op, final @NotNull double value0002) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0002FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current, value0002))));
        return current;
    }

    public final @NotNull double updateAndGetValue0002(final @NotNull BiOpDouble op, final @NotNull double value0002) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0002FieldOffset);
            newValue = op.apply(current, value0002);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    public final @NotNull double getAndUpdateValue0002(final @NotNull UnaryOpDouble op) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0002FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current))));
        return current;
    }

    public final @NotNull double updateAndGetValue0002(final @NotNull UnaryOpDouble op) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0002FieldOffset);
            newValue = op.apply(current);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    public final @NotNull double getAndUpdateValue0002(final @NotNull MultiOpDouble op, final @NotNull double ... value0002) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0002FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current, value0002))));
        return current;
    }

    public final @NotNull double updateAndGetValue0002(final @NotNull MultiOpDouble op, final @NotNull double ... value0002) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0002FieldOffset);
            newValue = op.apply(current, value0002);
        } while (!UNSAFE.compareAndSwapLong(this, value0002FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    public final void setValue0003(final @NotNull double value0003) {
        this.value0003 = value0003;
    }

    public final void putValue0003Unsafe(final @NotNull double value0003) {
        UNSAFE.putDouble(this, value0003FieldOffset, value0003);
    }

    public final void putValue0003Volatile(final @NotNull double value0003) {
        UNSAFE.putDoubleVolatile(this, value0003FieldOffset, value0003);
    }
    
    public final void putValue0003Ordered(
        final @NotNull double value0003) {
            UNSAFE.putOrderedLong(this, value0003FieldOffset, Double.doubleToRawLongBits(value0003));
    }

    public final boolean compareAndSwapValue0003(final @NotNull double expected,
        final @NotNull double value0003) {
        return UNSAFE.compareAndSwapLong(this,
            value0003FieldOffset,
            Double.doubleToRawLongBits(expected), Double.doubleToRawLongBits(value0003));
    }

    public final @NotNull double getAndSetValue0003(
        final @NotNull double value0003) {
        return (double) Double.longBitsToDouble(UNSAFE.getAndSetLong(this,
            value0000FieldOffset,
            Double.doubleToRawLongBits(value0003)));
    }
        
    public final @NotNull double getAndUpdateValue0003(final @NotNull BiOpDouble op, final @NotNull double value0003) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0003FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current, value0003))));
        return current;
    }

    public final @NotNull double updateAndGetValue0003(final @NotNull BiOpDouble op, final @NotNull double value0003) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0003FieldOffset);
            newValue = op.apply(current, value0003);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    public final @NotNull double getAndUpdateValue0003(final @NotNull UnaryOpDouble op) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0003FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current))));
        return current;
    }

    public final @NotNull double updateAndGetValue0003(final @NotNull UnaryOpDouble op) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0003FieldOffset);
            newValue = op.apply(current);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    public final @NotNull double getAndUpdateValue0003(final @NotNull MultiOpDouble op, final @NotNull double ... value0003) {
        double current;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this,
                value0003FieldOffset);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(op.apply(current, value0003))));
        return current;
    }

    public final @NotNull double updateAndGetValue0003(final @NotNull MultiOpDouble op, final @NotNull double ... value0003) {
        double current;
        double newValue;

        do {
            current = (double) UNSAFE.getDoubleVolatile(this, value0003FieldOffset);
            newValue = op.apply(current, value0003);
        } while (!UNSAFE.compareAndSwapLong(this, value0003FieldOffset,
            Double.doubleToRawLongBits(current), Double.doubleToRawLongBits(newValue)));

        return newValue;
    }

    protected MutableTabledArray0004Double(
        final boolean checked, final int length, final @NotNull double ... values) {
        this(checked, 0, length, values);
    }

    protected MutableTabledArray0004Double(
        final boolean checked, final int definedAsValues, final int length, final @NotNull double ... values) {
        super(checked, definedAsValues + 2, length, values);
        final int len = values.length;

        
        if (len >= 3) {
            this.value0003 = ArrayAccess.UNCHECKED.get(3, values);
        } else {
            this.value0003 = Double.NaN;
        }
            
        if (len >= 2) {
            this.value0002 = ArrayAccess.UNCHECKED.get(2, values);
        } else {
            this.value0002 = Double.NaN;
        }
            
    }

    public static  MutableTabledArray0004Double getInstance(
        final boolean checked, final int length, final @NotNull double ... values) {
        return new MutableTabledArray0004Double(checked, length, values) {
    
            @Override
            public final void put(final int index, final @NotNull double value) {
                switch (index) {
                    
                    case 0:
                        setValue0000(value);
                        break;
                    
                    case 1:
                        setValue0001(value);
                        break;
                    
                    case 2:
                        setValue0002(value);
                        break;
                    
                    case 3:
                        setValue0003(value);
                        break;
                    
                    default:
                        putToRest(index, value);
                }
            }
            
            @Override
            public final void putVolatile(final int index, final @NotNull double value) {
                switch (index) {
                    
                    case 0:
                        putValue0000Volatile(value);
                        break;
                    
                    case 1:
                        putValue0001Volatile(value);
                        break;
                    
                    case 2:
                        putValue0002Volatile(value);
                        break;
                    
                    case 3:
                        putValue0003Volatile(value);
                        break;
                    
                    default:
                        putVolatileToRest(index, value);
                }
            }
            
            @Override
            public final void putUnsafe(final int index, final @NotNull double value) {
                switch (index) {
                    
                    case 0:
                        putValue0000Unsafe(value);
                        break;
                    
                    case 1:
                        putValue0001Unsafe(value);
                        break;
                    
                    case 2:
                        putValue0002Unsafe(value);
                        break;
                    
                    case 3:
                        putValue0003Unsafe(value);
                        break;
                    
                    default:
                        putToRest(index, value);
                }
            }
            
            @Override
            public final void putOrdered(final int index, final @NotNull double value) {
                switch (index) {
                
                    case 0:
                        putValue0000Ordered(value);
                        break;
                    
                    case 1:
                        putValue0001Ordered(value);
                        break;
                    
                    case 2:
                        putValue0002Ordered(value);
                        break;
                    
                    case 3:
                        putValue0003Ordered(value);
                        break;
                    
                    default:
                        putOrderedToRest(index, value);
                }
            }
            
            @Override
            public final boolean compareAndSwap(final int index, final @NotNull double expected, final @NotNull double value) {
                switch (index) {
                
                    case 0:
                        return compareAndSwapValue0000(expected, value);
                    
                    case 1:
                        return compareAndSwapValue0001(expected, value);
                    
                    case 2:
                        return compareAndSwapValue0002(expected, value);
                    
                    case 3:
                        return compareAndSwapValue0003(expected, value);
                    
                    default:
                        return compareAndSwapFromRest(index, expected, value);
                }
            }
            
            @Override
            public final @NotNull double getAndSet(final int index, final @NotNull double value) {
                switch (index) {
                
                    case 0:
                        return getAndSetValue0000(value);
                    
                    case 1:
                        return getAndSetValue0001(value);
                    
                    case 2:
                        return getAndSetValue0002(value);
                    
                    case 3:
                        return getAndSetValue0003(value);
                    
                    default:
                        return getAndSetFromRest(index, value);
                }
            }
            
            @Override
            public final @NotNull double getAndUpdate(final int index, final @NotNull BiOpDouble op, final @NotNull double value) {
                switch (index) {
                
                    case 0:
                        return getAndUpdateValue0000(op, value);
                    
                    case 1:
                        return getAndUpdateValue0001(op, value);
                    
                    case 2:
                        return getAndUpdateValue0002(op, value);
                    
                    case 3:
                        return getAndUpdateValue0003(op, value);
                    
                    default:
                        return getAndUpdateFromRest(index, op, value);
                }
            }
            
            @Override
            public final @NotNull double updateAndGet(final int index, final @NotNull BiOpDouble op, final @NotNull double value) {
                switch (index) {
                
                    case 0:
                        return updateAndGetValue0000(op, value);
                    
                    case 1:
                        return updateAndGetValue0001(op, value);
                    
                    case 2:
                        return updateAndGetValue0002(op, value);
                    
                    case 3:
                        return updateAndGetValue0003(op, value);
                    
                    default:
                        return updateAndGetFromRest(index, op, value);
                }
            }
            
            @Override
            public final @NotNull double getAndUpdate(final int index, final @NotNull UnaryOpDouble op) {
                switch (index) {
                
                    case 0:
                        return getAndUpdateValue0000(op);
                    
                    case 1:
                        return getAndUpdateValue0001(op);
                    
                    case 2:
                        return getAndUpdateValue0002(op);
                    
                    case 3:
                        return getAndUpdateValue0003(op);
                    
                    default:
                        return getAndUpdateFromRest(index, op);
                }
            }
            
            @Override
            public final @NotNull double updateAndGet(final int index, final @NotNull UnaryOpDouble op) {
                switch (index) {
                
                    case 0:
                        return updateAndGetValue0000(op);
                    
                    case 1:
                        return updateAndGetValue0001(op);
                    
                    case 2:
                        return updateAndGetValue0002(op);
                    
                    case 3:
                        return updateAndGetValue0003(op);
                    
                    default:
                        return updateAndGetFromRest(index, op);
                }
            }
            
            @Override
            public final @NotNull double getAndUpdate(final int index, final @NotNull MultiOpDouble op, final @NotNull double ... value) {
                switch (index) {
                
                    case 0:
                        return getAndUpdateValue0000(op, value);
                    
                    case 1:
                        return getAndUpdateValue0001(op, value);
                    
                    case 2:
                        return getAndUpdateValue0002(op, value);
                    
                    case 3:
                        return getAndUpdateValue0003(op, value);
                    
                    default:
                        return getAndUpdateFromRest(index, op, value);
                }
            }
            
            @Override
            public final @NotNull double updateAndGet(final int index, final @NotNull MultiOpDouble op, final @NotNull double ... value) {
                switch (index) {
                
                    case 0:
                        return updateAndGetValue0000(op, value);
                    
                    case 1:
                        return updateAndGetValue0001(op, value);
                    
                    case 2:
                        return updateAndGetValue0002(op, value);
                    
                    case 3:
                        return updateAndGetValue0003(op, value);
                    
                    default:
                        return updateAndGetFromRest(index, op, value);
                }
            }
            
    
            @Override
            public final @NotNull double get(final int index) {
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
            public final @NotNull double getUnsafe(final int index) {
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
            public final @NotNull double getVolatile(final int index) {
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
