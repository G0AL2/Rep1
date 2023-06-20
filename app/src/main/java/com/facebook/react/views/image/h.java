package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import f7.b;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import u4.l;
import u4.q;
import v4.d;
import y3.j;

/* compiled from: ReactImageView.java */
/* loaded from: classes.dex */
public class h extends com.facebook.drawee.view.d {
    private static float[] H = new float[4];
    private static final Matrix I = new Matrix();
    private static final Matrix J = new Matrix();
    private static final Matrix K = new Matrix();
    private g A;
    private r4.d B;
    private com.facebook.react.views.image.a C;
    private Object D;
    private int E;
    private boolean F;
    private ReadableMap G;

    /* renamed from: g  reason: collision with root package name */
    private com.facebook.react.views.image.c f16097g;

    /* renamed from: h  reason: collision with root package name */
    private final List<f7.a> f16098h;

    /* renamed from: i  reason: collision with root package name */
    private f7.a f16099i;

    /* renamed from: j  reason: collision with root package name */
    private f7.a f16100j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f16101k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f16102l;

    /* renamed from: m  reason: collision with root package name */
    private l f16103m;

    /* renamed from: n  reason: collision with root package name */
    private int f16104n;

    /* renamed from: o  reason: collision with root package name */
    private int f16105o;

    /* renamed from: p  reason: collision with root package name */
    private int f16106p;

    /* renamed from: q  reason: collision with root package name */
    private float f16107q;

    /* renamed from: r  reason: collision with root package name */
    private float f16108r;

    /* renamed from: s  reason: collision with root package name */
    private float[] f16109s;

    /* renamed from: t  reason: collision with root package name */
    private q.b f16110t;

    /* renamed from: u  reason: collision with root package name */
    private Shader.TileMode f16111u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f16112v;

    /* renamed from: w  reason: collision with root package name */
    private final r4.b f16113w;

    /* renamed from: x  reason: collision with root package name */
    private b f16114x;

    /* renamed from: y  reason: collision with root package name */
    private c f16115y;

    /* renamed from: z  reason: collision with root package name */
    private a6.a f16116z;

    /* compiled from: ReactImageView.java */
    /* loaded from: classes.dex */
    class a extends g<w5.h> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f16117d;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f16117d = dVar;
        }

        @Override // r4.d
        public void f(String str, Throwable th) {
            this.f16117d.g(com.facebook.react.views.image.b.a(t0.f(h.this), h.this.getId(), th));
        }

        @Override // r4.d
        public void p(String str, Object obj) {
            this.f16117d.g(com.facebook.react.views.image.b.e(t0.f(h.this), h.this.getId()));
        }

        @Override // com.facebook.react.views.image.g
        public void w(int i10, int i11) {
            this.f16117d.g(com.facebook.react.views.image.b.f(t0.f(h.this), h.this.getId(), h.this.f16099i.d(), i10, i11));
        }

        @Override // r4.d
        /* renamed from: x */
        public void l(String str, w5.h hVar, Animatable animatable) {
            if (hVar != null) {
                this.f16117d.g(com.facebook.react.views.image.b.d(t0.f(h.this), h.this.getId(), h.this.f16099i.d(), hVar.getWidth(), hVar.getHeight()));
                this.f16117d.g(com.facebook.react.views.image.b.c(t0.f(h.this), h.this.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactImageView.java */
    /* loaded from: classes.dex */
    public class b extends b6.a {
        private b() {
        }

        @Override // b6.a
        public void f(Bitmap bitmap, Bitmap bitmap2) {
            h.this.p(h.H);
            bitmap.setHasAlpha(true);
            if (com.facebook.react.uimanager.e.a(h.H[0], 0.0f) && com.facebook.react.uimanager.e.a(h.H[1], 0.0f) && com.facebook.react.uimanager.e.a(h.H[2], 0.0f) && com.facebook.react.uimanager.e.a(h.H[3], 0.0f)) {
                super.f(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            g(bitmap2, h.H, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }

        void g(Bitmap bitmap, float[] fArr, float[] fArr2) {
            h.this.f16110t.a(h.I, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            h.I.invert(h.J);
            fArr2[0] = h.J.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = h.J.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = h.J.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = h.J.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactImageView.java */
    /* loaded from: classes.dex */
    public class c extends b6.a {
        private c() {
        }

        @Override // b6.a, b6.d
        public c4.a<Bitmap> a(Bitmap bitmap, o5.f fVar) {
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f16110t.a(h.K, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, h.this.f16111u, h.this.f16111u);
            bitmapShader.setLocalMatrix(h.K);
            paint.setShader(bitmapShader);
            c4.a<Bitmap> a10 = fVar.a(h.this.getWidth(), h.this.getHeight());
            try {
                new Canvas(a10.y()).drawRect(rect, paint);
                return a10.clone();
            } finally {
                c4.a.w(a10);
            }
        }

        /* synthetic */ c(h hVar, a aVar) {
            this();
        }
    }

    public h(Context context, r4.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, o(context));
        this.f16097g = com.facebook.react.views.image.c.AUTO;
        this.f16098h = new LinkedList();
        this.f16104n = 0;
        this.f16108r = Float.NaN;
        this.f16110t = d.b();
        this.f16111u = d.a();
        this.E = -1;
        this.f16113w = bVar;
        this.C = aVar;
        this.D = obj;
    }

    private static v4.a o(Context context) {
        return new v4.b(context.getResources()).u(v4.d.a(0.0f)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float[] fArr) {
        float f10 = !com.facebook.yoga.g.a(this.f16108r) ? this.f16108r : 0.0f;
        float[] fArr2 = this.f16109s;
        fArr[0] = (fArr2 == null || com.facebook.yoga.g.a(fArr2[0])) ? f10 : this.f16109s[0];
        float[] fArr3 = this.f16109s;
        fArr[1] = (fArr3 == null || com.facebook.yoga.g.a(fArr3[1])) ? f10 : this.f16109s[1];
        float[] fArr4 = this.f16109s;
        fArr[2] = (fArr4 == null || com.facebook.yoga.g.a(fArr4[2])) ? f10 : this.f16109s[2];
        float[] fArr5 = this.f16109s;
        if (fArr5 != null && !com.facebook.yoga.g.a(fArr5[3])) {
            f10 = this.f16109s[3];
        }
        fArr[3] = f10;
    }

    private boolean q() {
        return this.f16098h.size() > 1;
    }

    private boolean r() {
        return this.f16111u != Shader.TileMode.CLAMP;
    }

    private void u() {
        this.f16099i = null;
        if (this.f16098h.isEmpty()) {
            this.f16098h.add(new f7.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (q()) {
            b.C0381b a10 = f7.b.a(getWidth(), getHeight(), this.f16098h);
            this.f16099i = a10.a();
            this.f16100j = a10.b();
            return;
        }
        this.f16099i = this.f16098h.get(0);
    }

    private boolean v(f7.a aVar) {
        com.facebook.react.views.image.c cVar = this.f16097g;
        return cVar == com.facebook.react.views.image.c.AUTO ? g4.f.i(aVar.e()) || g4.f.j(aVar.e()) : cVar == com.facebook.react.views.image.c.RESIZE;
    }

    private boolean w() {
        q.b bVar = this.f16110t;
        return (bVar == q.b.f37551e || bVar == q.b.f37552f || !ReactFeatureFlags.enableRoundedCornerPostprocessing) ? false : true;
    }

    private void y(String str) {
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f16112v = this.f16112v || q() || r();
        s();
    }

    public void s() {
        if (this.f16112v) {
            if (!q() || (getWidth() > 0 && getHeight() > 0)) {
                u();
                f7.a aVar = this.f16099i;
                if (aVar == null) {
                    return;
                }
                boolean v10 = v(aVar);
                if (!v10 || (getWidth() > 0 && getHeight() > 0)) {
                    if (!r() || (getWidth() > 0 && getHeight() > 0)) {
                        v4.a hierarchy = getHierarchy();
                        hierarchy.u(this.f16110t);
                        Drawable drawable = this.f16101k;
                        if (drawable != null) {
                            hierarchy.z(drawable, this.f16110t);
                        }
                        Drawable drawable2 = this.f16102l;
                        if (drawable2 != null) {
                            hierarchy.z(drawable2, q.b.f37549c);
                        }
                        p(H);
                        v4.d p10 = hierarchy.p();
                        float[] fArr = H;
                        p10.m(fArr[0], fArr[1], fArr[2], fArr[3]);
                        l lVar = this.f16103m;
                        if (lVar != null) {
                            lVar.b(this.f16105o, this.f16107q);
                            this.f16103m.s(p10.d());
                            hierarchy.v(this.f16103m);
                        }
                        if (w()) {
                            p10.n(0.0f);
                        }
                        p10.l(this.f16105o, this.f16107q);
                        int i10 = this.f16106p;
                        if (i10 != 0) {
                            p10.o(i10);
                        } else {
                            p10.p(d.a.BITMAP_ONLY);
                        }
                        hierarchy.C(p10);
                        int i11 = this.E;
                        if (i11 < 0) {
                            i11 = this.f16099i.f() ? 0 : ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
                        }
                        hierarchy.x(i11);
                        LinkedList linkedList = new LinkedList();
                        b bVar = this.f16114x;
                        if (bVar != null) {
                            linkedList.add(bVar);
                        }
                        a6.a aVar2 = this.f16116z;
                        if (aVar2 != null) {
                            linkedList.add(aVar2);
                        }
                        c cVar = this.f16115y;
                        if (cVar != null) {
                            linkedList.add(cVar);
                        }
                        b6.d d10 = e.d(linkedList);
                        q5.e eVar = v10 ? new q5.e(getWidth(), getHeight()) : null;
                        r6.a w10 = r6.a.w(b6.c.s(this.f16099i.e()).A(d10).E(eVar).t(true).B(this.F), this.G);
                        com.facebook.react.views.image.a aVar3 = this.C;
                        if (aVar3 != null) {
                            aVar3.a(this.f16099i.e());
                        }
                        this.f16113w.y();
                        this.f16113w.z(true).A(this.D).a(getController()).C(w10);
                        f7.a aVar4 = this.f16100j;
                        if (aVar4 != null) {
                            this.f16113w.D(b6.c.s(aVar4.e()).A(d10).E(eVar).t(true).B(this.F).a());
                        }
                        g gVar = this.A;
                        if (gVar != null && this.B != null) {
                            r4.f fVar = new r4.f();
                            fVar.b(this.A);
                            fVar.b(this.B);
                            this.f16113w.B(fVar);
                        } else {
                            r4.d dVar = this.B;
                            if (dVar != null) {
                                this.f16113w.B(dVar);
                            } else if (gVar != null) {
                                this.f16113w.B(gVar);
                            }
                        }
                        g gVar2 = this.A;
                        if (gVar2 != null) {
                            hierarchy.B(gVar2);
                        }
                        setController(this.f16113w.build());
                        this.f16112v = false;
                        this.f16113w.y();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.f16104n != i10) {
            this.f16104n = i10;
            this.f16103m = new l(i10);
            this.f16112v = true;
        }
    }

    public void setBlurRadius(float f10) {
        int c10 = ((int) r.c(f10)) / 2;
        if (c10 == 0) {
            this.f16116z = null;
        } else {
            this.f16116z = new a6.a(2, c10);
        }
        this.f16112v = true;
    }

    public void setBorderColor(int i10) {
        if (this.f16105o != i10) {
            this.f16105o = i10;
            this.f16112v = true;
        }
    }

    public void setBorderRadius(float f10) {
        if (com.facebook.react.uimanager.e.a(this.f16108r, f10)) {
            return;
        }
        this.f16108r = f10;
        this.f16112v = true;
    }

    public void setBorderWidth(float f10) {
        float c10 = r.c(f10);
        if (com.facebook.react.uimanager.e.a(this.f16107q, c10)) {
            return;
        }
        this.f16107q = c10;
        this.f16112v = true;
    }

    public void setControllerListener(r4.d dVar) {
        this.B = dVar;
        this.f16112v = true;
        s();
    }

    public void setDefaultSource(String str) {
        Drawable c10 = f7.c.b().c(getContext(), str);
        if (j.a(this.f16101k, c10)) {
            return;
        }
        this.f16101k = c10;
        this.f16112v = true;
    }

    public void setFadeDuration(int i10) {
        this.E = i10;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.G = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable c10 = f7.c.b().c(getContext(), str);
        u4.b bVar = c10 != null ? new u4.b(c10, 1000) : null;
        if (j.a(this.f16102l, bVar)) {
            return;
        }
        this.f16102l = bVar;
        this.f16112v = true;
    }

    public void setOverlayColor(int i10) {
        if (this.f16106p != i10) {
            this.f16106p = i10;
            this.f16112v = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z10) {
        this.F = z10;
    }

    public void setResizeMethod(com.facebook.react.views.image.c cVar) {
        if (this.f16097g != cVar) {
            this.f16097g = cVar;
            this.f16112v = true;
        }
    }

    public void setScaleType(q.b bVar) {
        if (this.f16110t != bVar) {
            this.f16110t = bVar;
            if (w()) {
                this.f16114x = new b(this, null);
            } else {
                this.f16114x = null;
            }
            this.f16112v = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z10) {
        if (z10 == (this.A != null)) {
            return;
        }
        if (!z10) {
            this.A = null;
        } else {
            this.A = new a(t0.c((ReactContext) getContext(), getId()));
        }
        this.f16112v = true;
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList<f7.a> linkedList = new LinkedList();
        if (readableArray != null && readableArray.size() != 0) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                f7.a aVar = new f7.a(getContext(), string);
                linkedList.add(aVar);
                if (Uri.EMPTY.equals(aVar.e())) {
                    y(string);
                }
            } else {
                for (int i10 = 0; i10 < readableArray.size(); i10++) {
                    ReadableMap map = readableArray.getMap(i10);
                    String string2 = map.getString("uri");
                    f7.a aVar2 = new f7.a(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    linkedList.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.e())) {
                        y(string2);
                    }
                }
            }
        } else {
            linkedList.add(new f7.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        }
        if (this.f16098h.equals(linkedList)) {
            return;
        }
        this.f16098h.clear();
        for (f7.a aVar3 : linkedList) {
            this.f16098h.add(aVar3);
        }
        this.f16112v = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.f16111u != tileMode) {
            this.f16111u = tileMode;
            if (r()) {
                this.f16115y = new c(this, null);
            } else {
                this.f16115y = null;
            }
            this.f16112v = true;
        }
    }

    public void t(float f10, int i10) {
        if (this.f16109s == null) {
            float[] fArr = new float[4];
            this.f16109s = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (com.facebook.react.uimanager.e.a(this.f16109s[i10], f10)) {
            return;
        }
        this.f16109s[i10] = f10;
        this.f16112v = true;
    }

    public void x(Object obj) {
        if (j.a(this.D, obj)) {
            return;
        }
        this.D = obj;
        this.f16112v = true;
    }
}
