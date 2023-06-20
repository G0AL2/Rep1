package r4;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.datasource.g;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import r4.b;
import y3.j;
import y3.k;
import y3.n;

/* compiled from: AbstractDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements x4.d {

    /* renamed from: q  reason: collision with root package name */
    private static final d<Object> f36200q = new a();

    /* renamed from: r  reason: collision with root package name */
    private static final NullPointerException f36201r = new NullPointerException("No image request was specified!");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicLong f36202s = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final Context f36203a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<d> f36204b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<h5.b> f36205c;

    /* renamed from: d  reason: collision with root package name */
    private Object f36206d;

    /* renamed from: e  reason: collision with root package name */
    private REQUEST f36207e;

    /* renamed from: f  reason: collision with root package name */
    private REQUEST f36208f;

    /* renamed from: g  reason: collision with root package name */
    private REQUEST[] f36209g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36210h;

    /* renamed from: i  reason: collision with root package name */
    private n<com.facebook.datasource.c<IMAGE>> f36211i;

    /* renamed from: j  reason: collision with root package name */
    private d<? super INFO> f36212j;

    /* renamed from: k  reason: collision with root package name */
    private e f36213k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f36214l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36215m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36216n;

    /* renamed from: o  reason: collision with root package name */
    private String f36217o;

    /* renamed from: p  reason: collision with root package name */
    private x4.a f36218p;

    /* compiled from: AbstractDraweeControllerBuilder.java */
    /* loaded from: classes.dex */
    static class a extends r4.c<Object> {
        a() {
        }

        @Override // r4.c, r4.d
        public void l(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDraweeControllerBuilder.java */
    /* renamed from: r4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0487b implements n<com.facebook.datasource.c<IMAGE>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x4.a f36219a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36220b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f36221c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f36222d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f36223e;

        C0487b(x4.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f36219a = aVar;
            this.f36220b = str;
            this.f36221c = obj;
            this.f36222d = obj2;
            this.f36223e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // y3.n
        /* renamed from: a */
        public com.facebook.datasource.c<IMAGE> get() {
            return b.this.i(this.f36219a, this.f36220b, this.f36221c, this.f36222d, this.f36223e);
        }

        public String toString() {
            return j.c(this).b("request", this.f36221c.toString()).toString();
        }
    }

    /* compiled from: AbstractDraweeControllerBuilder.java */
    /* loaded from: classes.dex */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Set<d> set, Set<h5.b> set2) {
        this.f36203a = context;
        this.f36204b = set;
        this.f36205c = set2;
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String e() {
        return String.valueOf(f36202s.getAndIncrement());
    }

    private void s() {
        this.f36206d = null;
        this.f36207e = null;
        this.f36208f = null;
        this.f36209g = null;
        this.f36210h = true;
        this.f36212j = null;
        this.f36213k = null;
        this.f36214l = false;
        this.f36215m = false;
        this.f36218p = null;
        this.f36217o = null;
    }

    public BUILDER A(Object obj) {
        this.f36206d = obj;
        return r();
    }

    public BUILDER B(d<? super INFO> dVar) {
        this.f36212j = dVar;
        return r();
    }

    public BUILDER C(REQUEST request) {
        this.f36207e = request;
        return r();
    }

    public BUILDER D(REQUEST request) {
        this.f36208f = request;
        return r();
    }

    @Override // x4.d
    /* renamed from: E */
    public BUILDER a(x4.a aVar) {
        this.f36218p = aVar;
        return r();
    }

    protected void F() {
        boolean z10 = false;
        k.j(this.f36209g == null || this.f36207e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f36211i == null || (this.f36209g == null && this.f36207e == null && this.f36208f == null)) {
            z10 = true;
        }
        k.j(z10, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // x4.d
    /* renamed from: c */
    public r4.a build() {
        REQUEST request;
        F();
        if (this.f36207e == null && this.f36209g == null && (request = this.f36208f) != null) {
            this.f36207e = request;
            this.f36208f = null;
        }
        return d();
    }

    protected r4.a d() {
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        r4.a w10 = w();
        w10.b0(q());
        w10.X(g());
        w10.Z(h());
        v(w10);
        t(w10);
        if (c6.b.d()) {
            c6.b.b();
        }
        return w10;
    }

    public Object f() {
        return this.f36206d;
    }

    public String g() {
        return this.f36217o;
    }

    public e h() {
        return this.f36213k;
    }

    protected abstract com.facebook.datasource.c<IMAGE> i(x4.a aVar, String str, REQUEST request, Object obj, c cVar);

    protected n<com.facebook.datasource.c<IMAGE>> j(x4.a aVar, String str, REQUEST request) {
        return k(aVar, str, request, c.FULL_FETCH);
    }

    protected n<com.facebook.datasource.c<IMAGE>> k(x4.a aVar, String str, REQUEST request, c cVar) {
        return new C0487b(aVar, str, request, f(), cVar);
    }

    protected n<com.facebook.datasource.c<IMAGE>> l(x4.a aVar, String str, REQUEST[] requestArr, boolean z10) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z10) {
            for (REQUEST request : requestArr) {
                arrayList.add(k(aVar, str, request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(j(aVar, str, request2));
        }
        return com.facebook.datasource.f.b(arrayList);
    }

    public REQUEST[] m() {
        return this.f36209g;
    }

    public REQUEST n() {
        return this.f36207e;
    }

    public REQUEST o() {
        return this.f36208f;
    }

    public x4.a p() {
        return this.f36218p;
    }

    public boolean q() {
        return this.f36216n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BUILDER r() {
        return this;
    }

    protected void t(r4.a aVar) {
        Set<d> set = this.f36204b;
        if (set != null) {
            for (d dVar : set) {
                aVar.j(dVar);
            }
        }
        Set<h5.b> set2 = this.f36205c;
        if (set2 != null) {
            for (h5.b bVar : set2) {
                aVar.k(bVar);
            }
        }
        d<? super INFO> dVar2 = this.f36212j;
        if (dVar2 != null) {
            aVar.j(dVar2);
        }
        if (this.f36215m) {
            aVar.j(f36200q);
        }
    }

    protected void u(r4.a aVar) {
        if (aVar.u() == null) {
            aVar.a0(w4.a.c(this.f36203a));
        }
    }

    protected void v(r4.a aVar) {
        if (this.f36214l) {
            aVar.A().d(this.f36214l);
            u(aVar);
        }
    }

    protected abstract r4.a w();

    /* JADX INFO: Access modifiers changed from: protected */
    public n<com.facebook.datasource.c<IMAGE>> x(x4.a aVar, String str) {
        n<com.facebook.datasource.c<IMAGE>> nVar = this.f36211i;
        if (nVar != null) {
            return nVar;
        }
        n<com.facebook.datasource.c<IMAGE>> nVar2 = null;
        REQUEST request = this.f36207e;
        if (request != null) {
            nVar2 = j(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f36209g;
            if (requestArr != null) {
                nVar2 = l(aVar, str, requestArr, this.f36210h);
            }
        }
        if (nVar2 != null && this.f36208f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVar2);
            arrayList.add(j(aVar, str, this.f36208f));
            nVar2 = g.c(arrayList, false);
        }
        return nVar2 == null ? com.facebook.datasource.d.a(f36201r) : nVar2;
    }

    public BUILDER y() {
        s();
        return r();
    }

    public BUILDER z(boolean z10) {
        this.f36215m = z10;
        return r();
    }
}
