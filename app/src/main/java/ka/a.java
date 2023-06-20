package ka;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.d;
import ha.b;
import ha.k;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: g  reason: collision with root package name */
    private static final int f33442g = k.f31263l;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f33443h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f33444e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33445f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f31133d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f33444e == null) {
            int[][] iArr = f33443h;
            int[] iArr2 = new int[iArr.length];
            int c10 = na.a.c(this, b.f31136g);
            int c11 = na.a.c(this, b.f31141l);
            int c12 = na.a.c(this, b.f31138i);
            iArr2[0] = na.a.f(c11, c10, 1.0f);
            iArr2[1] = na.a.f(c11, c12, 0.54f);
            iArr2[2] = na.a.f(c11, c12, 0.38f);
            iArr2[3] = na.a.f(c11, c12, 0.38f);
            this.f33444e = new ColorStateList(iArr, iArr2);
        }
        return this.f33444e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33445f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f33445f = z10;
        if (z10) {
            d.c(this, getMaterialThemeColorsTintList());
        } else {
            d.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = ka.a.f33442g
            android.content.Context r8 = com.google.android.material.internal.g.f(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = ha.l.f31384x1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r10 = ha.l.f31389y1
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = ua.c.a(r8, r9, r10)
            androidx.core.widget.d.c(r7, r8)
        L28:
            int r8 = ha.l.f31394z1
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f33445f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
