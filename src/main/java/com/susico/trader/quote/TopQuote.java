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

package com.susico.trader.quote;

import com.susico.utils.memory.pool.PooledObject;
import org.jetbrains.annotations.NotNull;
import org.jvirtanen.parity.top.Side;

import java.util.Objects;

public final class TopQuote extends PooledObject {
    protected long instrument = 0;
    protected Side side = null;
    protected double price = Double.NaN;
    protected long size = 0;

    protected TopQuote() {}

    public static TopQuote getInstance(final long instrument, @NotNull final Side side, final double price, final long size) {
        TopQuote tq = getFromPoolOrSupplierIfAbsent(TopQuote.class, TopQuote::new);

        tq.set(instrument, side, price, size);

        return tq;
    }

    protected final void set(final long instrument, @NotNull final Side side, final double price, final long size) {
        this.setInstrument(instrument);
        this.setSide(side);
        this.setPrice(price);
        this.setSize(size);
    }

    protected final void setInstrument(long instrument) {
        this.instrument = instrument;
    }

    public final long getInstrument() {
        return this.instrument;
    }

    protected final void setSide(Side side) {
        this.side = side;
    }

    public final Side getSide() {
        return this.side;
    }

    protected final void setPrice(double price) {
        this.price = price;
    }

    protected final void setSize(long size) {
        this.size = size;
    }

    public final double getPrice() {
        return this.price;
    }

    public final long getSize() {
        return this.size;
    }

    @Override
    public final boolean equals(@NotNull Object obj) {
        Quote o = (Quote) obj;
        return instrument == o.getInstrument() &&
                side.equals(o.getSide()) &&
                price == o.getPrice() &&
                size == o.getSize();
    }

    @Override
    public int hashCode() {
        return Long.hashCode(instrument ^ Double.doubleToRawLongBits(price) ^ size ^ side.hashCode());
    }
}
