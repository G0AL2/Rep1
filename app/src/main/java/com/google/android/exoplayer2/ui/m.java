package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import ea.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WebViewSubtitleOutput.java */
/* loaded from: classes2.dex */
final class m extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f21787a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f21788b;

    /* renamed from: c  reason: collision with root package name */
    private List<r9.b> f21789c;

    /* renamed from: d  reason: collision with root package name */
    private ca.b f21790d;

    /* renamed from: e  reason: collision with root package name */
    private float f21791e;

    /* renamed from: f  reason: collision with root package name */
    private int f21792f;

    /* renamed from: g  reason: collision with root package name */
    private float f21793g;

    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: classes2.dex */
    class a extends WebView {
        a(m mVar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebViewSubtitleOutput.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21794a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f21794a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21794a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21794a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f21794a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(ca.b bVar) {
        int i10 = bVar.f5338d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? "unset" : n0.C("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f5339e));
                }
                return n0.C("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f5339e));
            }
            return n0.C("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(bVar.f5339e));
        }
        return n0.C("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(bVar.f5339e));
    }

    private String e(int i10, float f10) {
        float h10 = k.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return h10 == -3.4028235E38f ? "unset" : n0.C("%.2fpx", Float.valueOf(h10 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(r9.b bVar) {
        float f10 = bVar.f36499q;
        if (f10 != 0.0f) {
            int i10 = bVar.f36498p;
            return n0.C("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
        if (r13 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
        if (r13 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
        r21 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
        r22 = "top";
        r13 = 2;
        r23 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.m.i():void");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<r9.b> list, ca.b bVar, float f10, int i10, float f11) {
        this.f21790d = bVar;
        this.f21791e = f10;
        this.f21792f = i10;
        this.f21793g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r9.b bVar2 = list.get(i11);
            if (bVar2.f36486d != null) {
                arrayList.add(bVar2);
            } else {
                arrayList2.add(bVar2);
            }
        }
        if (!this.f21789c.isEmpty() || !arrayList2.isEmpty()) {
            this.f21789c = arrayList2;
            i();
        }
        this.f21787a.a(arrayList, bVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f21788b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f21789c.isEmpty()) {
            return;
        }
        i();
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21789c = Collections.emptyList();
        this.f21790d = ca.b.f5334g;
        this.f21791e = 0.0533f;
        this.f21792f = 0;
        this.f21793g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f21787a = aVar;
        a aVar2 = new a(this, context, attributeSet);
        this.f21788b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
