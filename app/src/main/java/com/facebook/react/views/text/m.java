package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.d0;
import com.facebook.react.uimanager.x0;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: ReactTextShadowNode.java */
@TargetApi(23)
/* loaded from: classes.dex */
public class m extends f {

    /* renamed from: d0  reason: collision with root package name */
    private static final TextPaint f16206d0 = new TextPaint(1);
    private Spannable Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f16207a0;

    /* renamed from: b0  reason: collision with root package name */
    private final com.facebook.yoga.m f16208b0;

    /* renamed from: c0  reason: collision with root package name */
    private final com.facebook.yoga.b f16209c0;

    /* compiled from: ReactTextShadowNode.java */
    /* loaded from: classes.dex */
    class a implements com.facebook.yoga.m {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
            if (r2 > r21) goto L58;
         */
        @Override // com.facebook.yoga.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long c(com.facebook.yoga.p r18, float r19, com.facebook.yoga.n r20, float r21, com.facebook.yoga.n r22) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.m.a.c(com.facebook.yoga.p, float, com.facebook.yoga.n, float, com.facebook.yoga.n):long");
        }
    }

    /* compiled from: ReactTextShadowNode.java */
    /* loaded from: classes.dex */
    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(com.facebook.yoga.p pVar, float f10, float f11) {
            Layout y12 = m.this.y1((Spannable) f6.a.d(m.this.Z, "Spannable element has not been prepared in onBeforeLayout"), f10, com.facebook.yoga.n.EXACTLY);
            return y12.getLineBaseline(y12.getLineCount() - 1);
        }
    }

    public m() {
        this(null);
    }

    private int w1() {
        int i10 = this.G;
        if (g0() == com.facebook.yoga.h.RTL) {
            if (i10 == 5) {
                return 3;
            }
            if (i10 == 3) {
                return 5;
            }
            return i10;
        }
        return i10;
    }

    private void x1() {
        if (R()) {
            return;
        }
        T0(this.f16208b0);
        F0(this.f16209c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout y1(Spannable spannable, float f10, com.facebook.yoga.n nVar) {
        TextPaint textPaint = f16206d0;
        textPaint.setTextSize(this.A.c());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z10 = nVar == com.facebook.yoga.n.UNDEFINED || f10 < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int w12 = w1();
        if (w12 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (w12 == 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (w12 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z10 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f10))) {
            int ceil = (int) Math.ceil(desiredWidth);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                return new StaticLayout(spannable, textPaint, ceil, alignment2, 1.0f, 0.0f, this.Q);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, ceil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.Q).setBreakStrategy(this.H).setHyphenationFrequency(this.I);
            if (i10 >= 26) {
                hyphenationFrequency.setJustificationMode(this.J);
            }
            if (i10 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring != null && (z10 || isBoring.width <= f10)) {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, 0.0f, isBoring, this.Q);
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 23) {
                return new StaticLayout(spannable, textPaint, (int) f10, alignment2, 1.0f, 0.0f, this.Q);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f10).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.Q).setBreakStrategy(this.H).setHyphenationFrequency(this.I);
            if (i11 >= 28) {
                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        }
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public Iterable<? extends d0> N() {
        Map<Integer, d0> map = this.Y;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) f6.a.d(this.Z, "Spannable element has not been prepared in onBeforeLayout");
        w[] wVarArr = (w[]) spanned.getSpans(0, spanned.length(), w.class);
        ArrayList arrayList = new ArrayList(wVarArr.length);
        for (w wVar : wVarArr) {
            d0 d0Var = this.Y.get(Integer.valueOf(wVar.b()));
            d0Var.Q();
            arrayList.add(d0Var);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public void a0(com.facebook.react.uimanager.o oVar) {
        this.Z = r1(this, null, true, oVar);
        x0();
    }

    @Override // com.facebook.react.uimanager.e0
    public boolean o0() {
        return true;
    }

    @w6.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z10) {
        this.f16207a0 = z10;
    }

    @Override // com.facebook.react.uimanager.e0
    public boolean u0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.e0
    public void x0() {
        super.x0();
        super.K();
    }

    @Override // com.facebook.react.uimanager.e0
    public void z0(x0 x0Var) {
        super.z0(x0Var);
        Spannable spannable = this.Z;
        if (spannable != null) {
            x0Var.Q(O(), new n(spannable, -1, this.X, k0(4), k0(1), k0(5), k0(3), w1(), this.H, this.J));
        }
    }

    public m(p pVar) {
        super(pVar);
        this.f16208b0 = new a();
        this.f16209c0 = new b();
        x1();
    }
}
