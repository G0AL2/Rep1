package v4;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.List;
import u4.q;
import y3.k;

/* compiled from: GenericDraweeHierarchyBuilder.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: r  reason: collision with root package name */
    public static final q.b f37778r = q.b.f37550d;

    /* renamed from: s  reason: collision with root package name */
    public static final q.b f37779s = q.b.f37551e;

    /* renamed from: a  reason: collision with root package name */
    private Resources f37780a;

    /* renamed from: b  reason: collision with root package name */
    private int f37781b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f37782c;

    /* renamed from: d  reason: collision with root package name */
    private q.b f37783d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f37784e;

    /* renamed from: f  reason: collision with root package name */
    private q.b f37785f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f37786g;

    /* renamed from: h  reason: collision with root package name */
    private q.b f37787h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f37788i;

    /* renamed from: j  reason: collision with root package name */
    private q.b f37789j;

    /* renamed from: k  reason: collision with root package name */
    private q.b f37790k;

    /* renamed from: l  reason: collision with root package name */
    private PointF f37791l;

    /* renamed from: m  reason: collision with root package name */
    private ColorFilter f37792m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f37793n;

    /* renamed from: o  reason: collision with root package name */
    private List<Drawable> f37794o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f37795p;

    /* renamed from: q  reason: collision with root package name */
    private d f37796q;

    public b(Resources resources) {
        this.f37780a = resources;
        s();
    }

    private void s() {
        this.f37781b = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
        this.f37782c = null;
        q.b bVar = f37778r;
        this.f37783d = bVar;
        this.f37784e = null;
        this.f37785f = bVar;
        this.f37786g = null;
        this.f37787h = bVar;
        this.f37788i = null;
        this.f37789j = bVar;
        this.f37790k = f37779s;
        this.f37791l = null;
        this.f37792m = null;
        this.f37793n = null;
        this.f37794o = null;
        this.f37795p = null;
        this.f37796q = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    private void v() {
        List<Drawable> list = this.f37794o;
        if (list != null) {
            for (Drawable drawable : list) {
                k.g(drawable);
            }
        }
    }

    public a a() {
        v();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f37792m;
    }

    public PointF c() {
        return this.f37791l;
    }

    public q.b d() {
        return this.f37790k;
    }

    public Drawable e() {
        return this.f37793n;
    }

    public int f() {
        return this.f37781b;
    }

    public Drawable g() {
        return this.f37786g;
    }

    public q.b h() {
        return this.f37787h;
    }

    public List<Drawable> i() {
        return this.f37794o;
    }

    public Drawable j() {
        return this.f37782c;
    }

    public q.b k() {
        return this.f37783d;
    }

    public Drawable l() {
        return this.f37795p;
    }

    public Drawable m() {
        return this.f37788i;
    }

    public q.b n() {
        return this.f37789j;
    }

    public Resources o() {
        return this.f37780a;
    }

    public Drawable p() {
        return this.f37784e;
    }

    public q.b q() {
        return this.f37785f;
    }

    public d r() {
        return this.f37796q;
    }

    public b u(d dVar) {
        this.f37796q = dVar;
        return this;
    }
}
