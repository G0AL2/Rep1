package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.z;
import ha.f;
import ha.l;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f22511a;

    /* renamed from: b  reason: collision with root package name */
    private Button f22512b;

    /* renamed from: c  reason: collision with root package name */
    private int f22513c;

    /* renamed from: d  reason: collision with root package name */
    private int f22514d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.Z1);
        this.f22513c = obtainStyledAttributes.getDimensionPixelSize(l.f31270a2, -1);
        this.f22514d = obtainStyledAttributes.getDimensionPixelSize(l.f31295f2, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i10, int i11) {
        if (z.W(view)) {
            z.E0(view, z.H(view), i10, z.G(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f22511a.getPaddingTop() == i11 && this.f22511a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f22511a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f22512b;
    }

    public TextView getMessageView() {
        return this.f22511a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f22511a = (TextView) findViewById(f.f31215v);
        this.f22512b = (Button) findViewById(f.f31214u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (b(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (b(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f22513c
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f22513c
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = ha.d.f31167g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = ha.d.f31166f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f22511a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f22514d
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f22512b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f22514d
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.b(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.b(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
