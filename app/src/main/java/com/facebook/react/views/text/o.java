package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.w0;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.api.Api;
import java.util.Comparator;

/* compiled from: ReactTextView.java */
/* loaded from: classes.dex */
public class o extends AppCompatTextView implements com.facebook.react.uimanager.w {

    /* renamed from: s  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f16225s = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: g  reason: collision with root package name */
    private boolean f16226g;

    /* renamed from: h  reason: collision with root package name */
    private int f16227h;

    /* renamed from: i  reason: collision with root package name */
    private int f16228i;

    /* renamed from: j  reason: collision with root package name */
    private int f16229j;

    /* renamed from: k  reason: collision with root package name */
    private int f16230k;

    /* renamed from: l  reason: collision with root package name */
    private TextUtils.TruncateAt f16231l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16232m;

    /* renamed from: n  reason: collision with root package name */
    private int f16233n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16234o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16235p;

    /* renamed from: q  reason: collision with root package name */
    private com.facebook.react.views.view.f f16236q;

    /* renamed from: r  reason: collision with root package name */
    private Spannable f16237r;

    /* compiled from: ReactTextView.java */
    /* loaded from: classes.dex */
    class a implements Comparator {
        a(o oVar) {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public o(Context context) {
        super(context);
        this.f16229j = 0;
        this.f16230k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f16231l = TextUtils.TruncateAt.END;
        this.f16232m = false;
        this.f16233n = 0;
        this.f16235p = false;
        this.f16236q = new com.facebook.react.views.view.f(this);
        this.f16227h = getGravity() & 8388615;
        this.f16228i = getGravity() & 112;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof w0) {
            return (ReactContext) ((w0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private static WritableMap h(int i10, int i11, int i12, int i13, int i14, int i15) {
        WritableMap createMap = Arguments.createMap();
        if (i10 == 8) {
            createMap.putString("visibility", "gone");
            createMap.putInt("index", i11);
        } else if (i10 == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i11);
            createMap.putDouble("left", com.facebook.react.uimanager.r.a(i12));
            createMap.putDouble("top", com.facebook.react.uimanager.r.a(i13));
            createMap.putDouble("right", com.facebook.react.uimanager.r.a(i14));
            createMap.putDouble("bottom", com.facebook.react.uimanager.r.a(i15));
        } else {
            createMap.putString("visibility", DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
            createMap.putInt("index", i11);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.w
    public int d(float f10, float f11) {
        int i10;
        CharSequence text = getText();
        int id2 = getId();
        int i11 = (int) f10;
        int i12 = (int) f11;
        Layout layout = getLayout();
        if (layout == null) {
            return id2;
        }
        int lineForVertical = layout.getLineForVertical(i12);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i11 >= lineLeft && i11 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i11);
                k[] kVarArr = (k[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, k.class);
                if (kVarArr != null) {
                    int length = text.length();
                    for (int i13 = 0; i13 < kVarArr.length; i13++) {
                        int spanStart = spanned.getSpanStart(kVarArr[i13]);
                        int spanEnd = spanned.getSpanEnd(kVarArr[i13]);
                        if (spanEnd >= offsetForHorizontal && (i10 = spanEnd - spanStart) <= length) {
                            id2 = kVarArr[i13].a();
                            length = i10;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                z3.a.j("ReactNative", "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
            }
        }
        return id2;
    }

    public Spannable getSpanned() {
        return this.f16237r;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i(int i10, float f10, float f11) {
        this.f16236q.c(i10, f10, f11);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                if (vVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void j(float f10, int i10) {
        this.f16236q.e(f10, i10);
    }

    public void k(int i10, float f10) {
        this.f16236q.g(i10, f10);
    }

    public void l() {
        setEllipsize((this.f16230k == Integer.MAX_VALUE || this.f16232m) ? null : this.f16231l);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f16235p);
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                vVar.c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                vVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                vVar.e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
        if (r5 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.o.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                vVar.f();
            }
        }
    }

    public void setAdjustFontSizeToFit(boolean z10) {
        this.f16232m = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f16236q.b(i10);
    }

    public void setBorderRadius(float f10) {
        this.f16236q.d(f10);
    }

    public void setBorderStyle(String str) {
        this.f16236q.f(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f16231l = truncateAt;
    }

    void setGravityHorizontal(int i10) {
        if (i10 == 0) {
            i10 = this.f16227h;
        }
        setGravity(i10 | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i10) {
        if (i10 == 0) {
            i10 = this.f16228i;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    public void setLinkifyMask(int i10) {
        this.f16233n = i10;
    }

    public void setNotifyOnInlineViewLayout(boolean z10) {
        this.f16234o = z10;
    }

    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f16230k = i10;
        setSingleLine(i10 == 1);
        setMaxLines(this.f16230k);
    }

    public void setSpanned(Spannable spannable) {
        this.f16237r = spannable;
    }

    public void setText(n nVar) {
        int i10;
        this.f16226g = nVar.b();
        if (getLayoutParams() == null) {
            setLayoutParams(f16225s);
        }
        Spannable k10 = nVar.k();
        int i11 = this.f16233n;
        if (i11 > 0) {
            Linkify.addLinks(k10, i11);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(k10);
        float f10 = nVar.f();
        float h10 = nVar.h();
        float g10 = nVar.g();
        float e10 = nVar.e();
        if (f10 != -1.0f && e10 != -1.0f && g10 != -1.0f && i10 != 0) {
            setPadding((int) Math.floor(f10), (int) Math.floor(h10), (int) Math.floor(g10), (int) Math.floor(e10));
        }
        int l10 = nVar.l();
        if (this.f16229j != l10) {
            this.f16229j = l10;
        }
        setGravityHorizontal(this.f16229j);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23 && getBreakStrategy() != nVar.m()) {
            setBreakStrategy(nVar.m());
        }
        if (i12 >= 26 && getJustificationMode() != nVar.d()) {
            setJustificationMode(nVar.d());
        }
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z10) {
        this.f16235p = z10;
        super.setTextIsSelectable(z10);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f16226g && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (v vVar : (v[]) spanned.getSpans(0, spanned.length(), v.class)) {
                if (vVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
