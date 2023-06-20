package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class Q3 extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    @Nullable
    public C07517m A00;
    public WeakReference<Q2> A01;
    public final InterfaceC1215Qr A02;

    public Q3(C1400Xy c1400Xy, InterfaceC1215Qr interfaceC1215Qr) {
        super(c1400Xy);
        this.A02 = interfaceC1215Qr;
        MS.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(NQ nq) {
        addView(nq, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C07517m) nq;
    }

    public final void A01(NQ nq) {
        MS.A0J(nq);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A86();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C07517m c07517m = this.A00;
        if (c07517m != null) {
            c07517m.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r0 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Q3.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(Q2 q22) {
        this.A01 = new WeakReference<>(q22);
    }
}
