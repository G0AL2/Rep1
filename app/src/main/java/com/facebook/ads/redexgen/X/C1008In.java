package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.In  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1008In {
    public final Object A01 = new Object();
    public final PriorityQueue<Integer> A02 = new PriorityQueue<>(10, Collections.reverseOrder());
    public int A00 = RecyclerView.UNDEFINED_DURATION;

    public final void A00(int i10) {
        synchronized (this.A01) {
            this.A02.add(Integer.valueOf(i10));
            this.A00 = Math.max(this.A00, i10);
        }
    }

    public final void A01(int i10) throws InterruptedException {
        synchronized (this.A01) {
            while (this.A00 != i10) {
                this.A01.wait();
            }
        }
    }

    public final void A02(int i10) throws C1007Im {
        synchronized (this.A01) {
            if (this.A00 != i10) {
                throw new C1007Im(i10, this.A00);
            }
        }
    }

    public final void A03(int i10) {
        synchronized (this.A01) {
            this.A02.remove(Integer.valueOf(i10));
            this.A00 = this.A02.isEmpty() ? RecyclerView.UNDEFINED_DURATION : this.A02.peek().intValue();
            this.A01.notifyAll();
        }
    }
}
