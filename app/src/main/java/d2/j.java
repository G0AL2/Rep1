package d2;

import android.graphics.PointF;
import com.airbnb.lottie.d0;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f28977a;

    /* renamed from: b  reason: collision with root package name */
    private final a f28978b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.b f28979c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.m<PointF, PointF> f28980d;

    /* renamed from: e  reason: collision with root package name */
    private final c2.b f28981e;

    /* renamed from: f  reason: collision with root package name */
    private final c2.b f28982f;

    /* renamed from: g  reason: collision with root package name */
    private final c2.b f28983g;

    /* renamed from: h  reason: collision with root package name */
    private final c2.b f28984h;

    /* renamed from: i  reason: collision with root package name */
    private final c2.b f28985i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f28986j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f28987k;

    /* compiled from: PolystarShape.java */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f28991a;

        a(int i10) {
            this.f28991a = i10;
        }

        public static a a(int i10) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.f28991a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, c2.b bVar, c2.m<PointF, PointF> mVar, c2.b bVar2, c2.b bVar3, c2.b bVar4, c2.b bVar5, c2.b bVar6, boolean z10, boolean z11) {
        this.f28977a = str;
        this.f28978b = aVar;
        this.f28979c = bVar;
        this.f28980d = mVar;
        this.f28981e = bVar2;
        this.f28982f = bVar3;
        this.f28983g = bVar4;
        this.f28984h = bVar5;
        this.f28985i = bVar6;
        this.f28986j = z10;
        this.f28987k = z11;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.n(d0Var, bVar, this);
    }

    public c2.b b() {
        return this.f28982f;
    }

    public c2.b c() {
        return this.f28984h;
    }

    public String d() {
        return this.f28977a;
    }

    public c2.b e() {
        return this.f28983g;
    }

    public c2.b f() {
        return this.f28985i;
    }

    public c2.b g() {
        return this.f28979c;
    }

    public c2.m<PointF, PointF> h() {
        return this.f28980d;
    }

    public c2.b i() {
        return this.f28981e;
    }

    public a j() {
        return this.f28978b;
    }

    public boolean k() {
        return this.f28986j;
    }

    public boolean l() {
        return this.f28987k;
    }
}
