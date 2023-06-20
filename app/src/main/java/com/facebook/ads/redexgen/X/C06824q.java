package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06824q {
    public C06794n A00 = new C06794n();
    public final InterfaceC06804o A01;

    public C06824q(InterfaceC06804o interfaceC06804o) {
        this.A01 = interfaceC06804o;
    }

    public final View A00(int end, int next, int i10, int i11) {
        int childStart = this.A01.A78();
        int A77 = this.A01.A77();
        int i12 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View A5z = this.A01.A5z(end);
            this.A00.A03(childStart, A77, this.A01.A62(A5z), this.A01.A61(A5z));
            if (i10 != 0) {
                this.A00.A01();
                this.A00.A02(i10);
                if (this.A00.A04()) {
                    return A5z;
                }
            }
            if (i11 != 0) {
                this.A00.A01();
                this.A00.A02(i11);
                if (this.A00.A04()) {
                    view = A5z;
                }
            }
            end += i12;
        }
        return view;
    }
}
