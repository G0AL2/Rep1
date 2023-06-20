package xa;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    d f38822a;

    /* renamed from: b  reason: collision with root package name */
    d f38823b;

    /* renamed from: c  reason: collision with root package name */
    d f38824c;

    /* renamed from: d  reason: collision with root package name */
    d f38825d;

    /* renamed from: e  reason: collision with root package name */
    xa.c f38826e;

    /* renamed from: f  reason: collision with root package name */
    xa.c f38827f;

    /* renamed from: g  reason: collision with root package name */
    xa.c f38828g;

    /* renamed from: h  reason: collision with root package name */
    xa.c f38829h;

    /* renamed from: i  reason: collision with root package name */
    f f38830i;

    /* renamed from: j  reason: collision with root package name */
    f f38831j;

    /* renamed from: k  reason: collision with root package name */
    f f38832k;

    /* renamed from: l  reason: collision with root package name */
    f f38833l;

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes3.dex */
    public interface c {
        xa.c a(xa.c cVar);
    }

    static {
        new i(0.5f);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new xa.a(i12));
    }

    private static b d(Context context, int i10, int i11, xa.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, ha.l.O1);
        try {
            int i12 = obtainStyledAttributes.getInt(ha.l.P1, 0);
            int i13 = obtainStyledAttributes.getInt(ha.l.S1, i12);
            int i14 = obtainStyledAttributes.getInt(ha.l.T1, i12);
            int i15 = obtainStyledAttributes.getInt(ha.l.R1, i12);
            int i16 = obtainStyledAttributes.getInt(ha.l.Q1, i12);
            xa.c m10 = m(obtainStyledAttributes, ha.l.U1, cVar);
            xa.c m11 = m(obtainStyledAttributes, ha.l.X1, m10);
            xa.c m12 = m(obtainStyledAttributes, ha.l.Y1, m10);
            xa.c m13 = m(obtainStyledAttributes, ha.l.W1, m10);
            return new b().x(i13, m11).B(i14, m12).t(i15, m13).p(i16, m(obtainStyledAttributes, ha.l.V1, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new xa.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, xa.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ha.l.C1, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(ha.l.D1, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(ha.l.E1, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static xa.c m(TypedArray typedArray, int i10, xa.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new xa.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f38832k;
    }

    public d i() {
        return this.f38825d;
    }

    public xa.c j() {
        return this.f38829h;
    }

    public d k() {
        return this.f38824c;
    }

    public xa.c l() {
        return this.f38828g;
    }

    public f n() {
        return this.f38833l;
    }

    public f o() {
        return this.f38831j;
    }

    public f p() {
        return this.f38830i;
    }

    public d q() {
        return this.f38822a;
    }

    public xa.c r() {
        return this.f38826e;
    }

    public d s() {
        return this.f38823b;
    }

    public xa.c t() {
        return this.f38827f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f38833l.getClass().equals(f.class) && this.f38831j.getClass().equals(f.class) && this.f38830i.getClass().equals(f.class) && this.f38832k.getClass().equals(f.class);
        float a10 = this.f38826e.a(rectF);
        return z10 && ((this.f38827f.a(rectF) > a10 ? 1 : (this.f38827f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f38829h.a(rectF) > a10 ? 1 : (this.f38829h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f38828g.a(rectF) > a10 ? 1 : (this.f38828g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f38823b instanceof j) && (this.f38822a instanceof j) && (this.f38824c instanceof j) && (this.f38825d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(c cVar) {
        return v().A(cVar.a(r())).E(cVar.a(t())).s(cVar.a(j())).w(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f38822a = bVar.f38834a;
        this.f38823b = bVar.f38835b;
        this.f38824c = bVar.f38836c;
        this.f38825d = bVar.f38837d;
        this.f38826e = bVar.f38838e;
        this.f38827f = bVar.f38839f;
        this.f38828g = bVar.f38840g;
        this.f38829h = bVar.f38841h;
        this.f38830i = bVar.f38842i;
        this.f38831j = bVar.f38843j;
        this.f38832k = bVar.f38844k;
        this.f38833l = bVar.f38845l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f38834a;

        /* renamed from: b  reason: collision with root package name */
        private d f38835b;

        /* renamed from: c  reason: collision with root package name */
        private d f38836c;

        /* renamed from: d  reason: collision with root package name */
        private d f38837d;

        /* renamed from: e  reason: collision with root package name */
        private xa.c f38838e;

        /* renamed from: f  reason: collision with root package name */
        private xa.c f38839f;

        /* renamed from: g  reason: collision with root package name */
        private xa.c f38840g;

        /* renamed from: h  reason: collision with root package name */
        private xa.c f38841h;

        /* renamed from: i  reason: collision with root package name */
        private f f38842i;

        /* renamed from: j  reason: collision with root package name */
        private f f38843j;

        /* renamed from: k  reason: collision with root package name */
        private f f38844k;

        /* renamed from: l  reason: collision with root package name */
        private f f38845l;

        public b() {
            this.f38834a = h.b();
            this.f38835b = h.b();
            this.f38836c = h.b();
            this.f38837d = h.b();
            this.f38838e = new xa.a(0.0f);
            this.f38839f = new xa.a(0.0f);
            this.f38840g = new xa.a(0.0f);
            this.f38841h = new xa.a(0.0f);
            this.f38842i = h.c();
            this.f38843j = h.c();
            this.f38844k = h.c();
            this.f38845l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f38821a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f38773a;
            }
            return -1.0f;
        }

        public b A(xa.c cVar) {
            this.f38838e = cVar;
            return this;
        }

        public b B(int i10, xa.c cVar) {
            return C(h.a(i10)).E(cVar);
        }

        public b C(d dVar) {
            this.f38835b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                D(n10);
            }
            return this;
        }

        public b D(float f10) {
            this.f38839f = new xa.a(f10);
            return this;
        }

        public b E(xa.c cVar) {
            this.f38839f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return z(f10).D(f10).v(f10).r(f10);
        }

        public b p(int i10, xa.c cVar) {
            return q(h.a(i10)).s(cVar);
        }

        public b q(d dVar) {
            this.f38837d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                r(n10);
            }
            return this;
        }

        public b r(float f10) {
            this.f38841h = new xa.a(f10);
            return this;
        }

        public b s(xa.c cVar) {
            this.f38841h = cVar;
            return this;
        }

        public b t(int i10, xa.c cVar) {
            return u(h.a(i10)).w(cVar);
        }

        public b u(d dVar) {
            this.f38836c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                v(n10);
            }
            return this;
        }

        public b v(float f10) {
            this.f38840g = new xa.a(f10);
            return this;
        }

        public b w(xa.c cVar) {
            this.f38840g = cVar;
            return this;
        }

        public b x(int i10, xa.c cVar) {
            return y(h.a(i10)).A(cVar);
        }

        public b y(d dVar) {
            this.f38834a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                z(n10);
            }
            return this;
        }

        public b z(float f10) {
            this.f38838e = new xa.a(f10);
            return this;
        }

        public b(k kVar) {
            this.f38834a = h.b();
            this.f38835b = h.b();
            this.f38836c = h.b();
            this.f38837d = h.b();
            this.f38838e = new xa.a(0.0f);
            this.f38839f = new xa.a(0.0f);
            this.f38840g = new xa.a(0.0f);
            this.f38841h = new xa.a(0.0f);
            this.f38842i = h.c();
            this.f38843j = h.c();
            this.f38844k = h.c();
            this.f38845l = h.c();
            this.f38834a = kVar.f38822a;
            this.f38835b = kVar.f38823b;
            this.f38836c = kVar.f38824c;
            this.f38837d = kVar.f38825d;
            this.f38838e = kVar.f38826e;
            this.f38839f = kVar.f38827f;
            this.f38840g = kVar.f38828g;
            this.f38841h = kVar.f38829h;
            this.f38842i = kVar.f38830i;
            this.f38843j = kVar.f38831j;
            this.f38844k = kVar.f38832k;
            this.f38845l = kVar.f38833l;
        }
    }

    public k() {
        this.f38822a = h.b();
        this.f38823b = h.b();
        this.f38824c = h.b();
        this.f38825d = h.b();
        this.f38826e = new xa.a(0.0f);
        this.f38827f = new xa.a(0.0f);
        this.f38828g = new xa.a(0.0f);
        this.f38829h = new xa.a(0.0f);
        this.f38830i = h.c();
        this.f38831j = h.c();
        this.f38832k = h.c();
        this.f38833l = h.c();
    }
}
