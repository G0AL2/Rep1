package ta;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.v;
import androidx.core.widget.d;
import ha.b;
import ha.k;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes3.dex */
public class a extends v {

    /* renamed from: g  reason: collision with root package name */
    private static final int f37238g = k.f31264m;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f37239h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f37240e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f37241f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f31149t);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f37240e == null) {
            int c10 = na.a.c(this, b.f31136g);
            int c11 = na.a.c(this, b.f31138i);
            int c12 = na.a.c(this, b.f31141l);
            int[][] iArr = f37239h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = na.a.f(c12, c10, 1.0f);
            iArr2[1] = na.a.f(c12, c11, 0.54f);
            iArr2[2] = na.a.f(c12, c11, 0.38f);
            iArr2[3] = na.a.f(c12, c11, 0.38f);
            this.f37240e = new ColorStateList(iArr, iArr2);
        }
        return this.f37240e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37241f && d.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f37241f = z10;
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
    public a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = ta.a.f37238g
            android.content.Context r7 = com.google.android.material.internal.g.f(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = ha.l.A1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.g.k(r0, r1, r2, r3, r4, r5)
            int r9 = ha.l.B1
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f37241f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
