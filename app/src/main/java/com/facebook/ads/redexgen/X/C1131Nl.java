package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Nl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1131Nl extends ViewGroup {
    public static final int A01 = (int) (Lr.A00 * 8.0f);
    public int A00;

    public C1131Nl(C1400Xy c1400Xy) {
        super(c1400Xy);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childHeight = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingLeft + measuredWidth > childHeight) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.A00;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
            paddingLeft += A01 + measuredWidth;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0033 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r10.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r10.getPaddingRight()
            int r6 = r6 - r0
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = r10.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r10.getPaddingBottom()
            int r1 = r1 - r0
            int r9 = r10.getPaddingLeft()
            r8 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            int r0 = r10.getChildCount()
            if (r0 <= 0) goto L60
            r4 = 1
        L2e:
            r3 = 0
        L2f:
            int r0 = r10.getChildCount()
            if (r3 >= r0) goto L62
            android.view.View r1 = r10.getChildAt(r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r1.measure(r0, r5)
            int r2 = r1.getMeasuredWidth()
            int r1 = r1.getMeasuredHeight()
            int r0 = com.facebook.ads.redexgen.X.C1131Nl.A01
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r8, r1)
            int r0 = r9 + r2
            if (r0 <= r6) goto L59
            int r4 = r4 + 1
            int r9 = r10.getPaddingLeft()
        L59:
            int r0 = com.facebook.ads.redexgen.X.C1131Nl.A01
            int r0 = r0 + r2
            int r9 = r9 + r0
            int r3 = r3 + 1
            goto L2f
        L60:
            r4 = 0
            goto L2e
        L62:
            r10.A00 = r8
            int r1 = r10.A00
            int r1 = r1 * r4
            int r0 = com.facebook.ads.redexgen.X.C1131Nl.A01
            int r1 = r1 + r0
            r10.setMeasuredDimension(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1131Nl.onMeasure(int, int):void");
    }
}
