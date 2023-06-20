package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: j  reason: collision with root package name */
    private int f2062j;

    /* renamed from: k  reason: collision with root package name */
    private int f2063k;

    /* renamed from: l  reason: collision with root package name */
    private s.a f2064l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(s.e eVar, int i10, boolean z10) {
        this.f2063k = i10;
        if (Build.VERSION.SDK_INT < 17) {
            int i11 = this.f2062j;
            if (i11 == 5) {
                this.f2063k = 0;
            } else if (i11 == 6) {
                this.f2063k = 1;
            }
        } else if (z10) {
            int i12 = this.f2062j;
            if (i12 == 5) {
                this.f2063k = 1;
            } else if (i12 == 6) {
                this.f2063k = 0;
            }
        } else {
            int i13 = this.f2062j;
            if (i13 == 5) {
                this.f2063k = 0;
            } else if (i13 == 6) {
                this.f2063k = 1;
            }
        }
        if (eVar instanceof s.a) {
            ((s.a) eVar).x1(this.f2063k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2064l.r1();
    }

    public int getMargin() {
        return this.f2064l.t1();
    }

    public int getType() {
        return this.f2062j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f2064l = new s.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2250d1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f2242c1) {
                    this.f2064l.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f2258e1) {
                    this.f2064l.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2086d = this.f2064l;
        s();
    }

    @Override // androidx.constraintlayout.widget.c
    public void n(s.e eVar, boolean z10) {
        t(eVar, this.f2062j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2064l.w1(z10);
    }

    public void setDpMargin(int i10) {
        s.a aVar = this.f2064l;
        aVar.y1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2064l.y1(i10);
    }

    public void setType(int i10) {
        this.f2062j = i10;
    }
}
