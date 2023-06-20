package h7;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import b6.c;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.r;
import com.facebook.react.views.image.d;
import com.facebook.react.views.text.v;
import u4.q;

/* compiled from: FrescoBasedReactTextInlineImageSpan.java */
/* loaded from: classes.dex */
public class b extends v {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f31113a;

    /* renamed from: b  reason: collision with root package name */
    private final r4.b f31114b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.drawee.view.b<v4.a> f31115c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f31116d;

    /* renamed from: e  reason: collision with root package name */
    private int f31117e;

    /* renamed from: f  reason: collision with root package name */
    private int f31118f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f31119g;

    /* renamed from: h  reason: collision with root package name */
    private int f31120h;

    /* renamed from: i  reason: collision with root package name */
    private ReadableMap f31121i;

    /* renamed from: j  reason: collision with root package name */
    private String f31122j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f31123k;

    public b(Resources resources, int i10, int i11, int i12, Uri uri, ReadableMap readableMap, r4.b bVar, Object obj, String str) {
        this.f31115c = new com.facebook.drawee.view.b<>(v4.b.t(resources).a());
        this.f31114b = bVar;
        this.f31116d = obj;
        this.f31118f = i12;
        this.f31119g = uri == null ? Uri.EMPTY : uri;
        this.f31121i = readableMap;
        this.f31120h = (int) r.c(i11);
        this.f31117e = (int) r.c(i10);
        this.f31122j = str;
    }

    private q.b i(String str) {
        return d.c(str);
    }

    @Override // com.facebook.react.views.text.v
    public Drawable a() {
        return this.f31113a;
    }

    @Override // com.facebook.react.views.text.v
    public int b() {
        return this.f31117e;
    }

    @Override // com.facebook.react.views.text.v
    public void c() {
        this.f31115c.k();
    }

    @Override // com.facebook.react.views.text.v
    public void d() {
        this.f31115c.l();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (this.f31113a == null) {
            r6.a w10 = r6.a.w(c.s(this.f31119g), this.f31121i);
            this.f31115c.h().u(i(this.f31122j));
            this.f31115c.o(this.f31114b.y().a(this.f31115c.g()).A(this.f31116d).C(w10).build());
            this.f31114b.y();
            Drawable i15 = this.f31115c.i();
            this.f31113a = i15;
            i15.setBounds(0, 0, this.f31120h, this.f31117e);
            int i16 = this.f31118f;
            if (i16 != 0) {
                this.f31113a.setColorFilter(i16, PorterDuff.Mode.SRC_IN);
            }
            this.f31113a.setCallback(this.f31123k);
        }
        canvas.save();
        canvas.translate(f10, ((i13 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f31113a.getBounds().bottom - this.f31113a.getBounds().top) / 2));
        this.f31113a.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.v
    public void e() {
        this.f31115c.k();
    }

    @Override // com.facebook.react.views.text.v
    public void f() {
        this.f31115c.l();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i12 = -this.f31117e;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f31120h;
    }

    @Override // com.facebook.react.views.text.v
    public void h(TextView textView) {
        this.f31123k = textView;
    }
}
