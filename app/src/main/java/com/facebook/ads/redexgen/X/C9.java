package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class C9 {
    public final CopyOnWriteArrayList<C8> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new C4(this, handlerAndListener.A01));
        }
    }

    public final void A01() {
        Iterator<C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new C7(this, handlerAndListener.A01));
        }
    }

    public final void A02() {
        Iterator<C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new C6(this, handlerAndListener.A01));
        }
    }

    public final void A03(Handler handler, CA ca2) {
        IK.A03((handler == null || ca2 == null) ? false : true);
        this.A00.add(new C8(handler, ca2));
    }

    public final void A04(Exception exc) {
        Iterator<C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C8 next = it.next();
            next.A00.post(new C5(this, next.A01, exc));
        }
    }
}
