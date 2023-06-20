package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Vd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1330Vd implements InterfaceC0919Fa {
    public XH A00;
    public B1 A01;
    public Object A02;
    public final ArrayList<FZ> A04 = new ArrayList<>(1);
    public final C0930Fl A03 = new C0930Fl();

    public abstract void A02();

    public abstract void A03(XH xh, boolean z10);

    public final C0930Fl A00(@Nullable FY fy) {
        return this.A03.A02(0, fy, 0L);
    }

    public final void A01(B1 b12, @Nullable Object obj) {
        this.A01 = b12;
        this.A02 = obj;
        Iterator<FZ> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ACM(this, b12, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void A3C(Handler handler, InterfaceC0933Fo interfaceC0933Fo) {
        this.A03.A07(handler, interfaceC0933Fo);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void ADJ(XH xh, boolean z10, FZ fz) {
        XH xh2 = this.A00;
        IK.A03(xh2 == null || xh2 == xh);
        this.A04.add(fz);
        if (this.A00 == null) {
            this.A00 = xh;
            A03(xh, z10);
            return;
        }
        B1 b12 = this.A01;
        if (b12 == null) {
            return;
        }
        fz.ACM(this, b12, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void ADt(FZ fz) {
        this.A04.remove(fz);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0919Fa
    public final void ADv(InterfaceC0933Fo interfaceC0933Fo) {
        this.A03.A0D(interfaceC0933Fo);
    }
}
