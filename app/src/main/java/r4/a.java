package r4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h5.b;
import java.util.Map;
import java.util.concurrent.Executor;
import q4.a;
import q4.c;
import u4.f;
import w4.a;
import y3.g;
import y3.j;
import y3.k;

/* compiled from: AbstractDraweeController.java */
/* loaded from: classes.dex */
public abstract class a<T, INFO> implements x4.a, a.InterfaceC0479a, a.InterfaceC0526a {

    /* renamed from: v  reason: collision with root package name */
    private static final Map<String, Object> f36172v = g.of("component_tag", "drawee");

    /* renamed from: w  reason: collision with root package name */
    private static final Map<String, Object> f36173w = g.of(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: x  reason: collision with root package name */
    private static final Class<?> f36174x = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final q4.a f36176b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f36177c;

    /* renamed from: d  reason: collision with root package name */
    private q4.d f36178d;

    /* renamed from: e  reason: collision with root package name */
    private w4.a f36179e;

    /* renamed from: f  reason: collision with root package name */
    protected d<INFO> f36180f;

    /* renamed from: h  reason: collision with root package name */
    protected h5.e f36182h;

    /* renamed from: i  reason: collision with root package name */
    private x4.c f36183i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f36184j;

    /* renamed from: k  reason: collision with root package name */
    private String f36185k;

    /* renamed from: l  reason: collision with root package name */
    private Object f36186l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36187m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36188n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f36189o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f36190p;

    /* renamed from: q  reason: collision with root package name */
    private String f36191q;

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.datasource.c<T> f36192r;

    /* renamed from: s  reason: collision with root package name */
    private T f36193s;

    /* renamed from: u  reason: collision with root package name */
    protected Drawable f36195u;

    /* renamed from: a  reason: collision with root package name */
    private final q4.c f36175a = q4.c.a();

    /* renamed from: g  reason: collision with root package name */
    protected h5.d<INFO> f36181g = new h5.d<>();

    /* renamed from: t  reason: collision with root package name */
    private boolean f36194t = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDraweeController.java */
    /* renamed from: r4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0486a implements f.a {
        C0486a() {
        }

        @Override // u4.f.a
        public void a() {
            a aVar = a.this;
            h5.e eVar = aVar.f36182h;
            if (eVar != null) {
                eVar.b(aVar.f36185k);
            }
        }

        @Override // u4.f.a
        public void b() {
        }

        @Override // u4.f.a
        public void c() {
            a aVar = a.this;
            h5.e eVar = aVar.f36182h;
            if (eVar != null) {
                eVar.a(aVar.f36185k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractDraweeController.java */
    /* loaded from: classes.dex */
    public class b extends com.facebook.datasource.b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f36198b;

        b(String str, boolean z10) {
            this.f36197a = str;
            this.f36198b = z10;
        }

        @Override // com.facebook.datasource.b, com.facebook.datasource.e
        public void d(com.facebook.datasource.c<T> cVar) {
            boolean c10 = cVar.c();
            a.this.M(this.f36197a, cVar, cVar.f(), c10);
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<T> cVar) {
            a.this.J(this.f36197a, cVar, cVar.d(), true);
        }

        @Override // com.facebook.datasource.b
        public void f(com.facebook.datasource.c<T> cVar) {
            boolean c10 = cVar.c();
            boolean g10 = cVar.g();
            float f10 = cVar.f();
            T a10 = cVar.a();
            if (a10 != null) {
                a.this.L(this.f36197a, cVar, a10, f10, c10, this.f36198b, g10);
            } else if (c10) {
                a.this.J(this.f36197a, cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractDraweeController.java */
    /* loaded from: classes.dex */
    public static class c<INFO> extends f<INFO> {
        private c() {
        }

        public static <INFO> c<INFO> e(d<? super INFO> dVar, d<? super INFO> dVar2) {
            if (c6.b.d()) {
                c6.b.a("AbstractDraweeController#createInternal");
            }
            c<INFO> cVar = new c<>();
            cVar.b(dVar);
            cVar.b(dVar2);
            if (c6.b.d()) {
                c6.b.b();
            }
            return cVar;
        }
    }

    public a(q4.a aVar, Executor executor, String str, Object obj) {
        this.f36176b = aVar;
        this.f36177c = executor;
        B(str, obj);
    }

    private synchronized void B(String str, Object obj) {
        q4.a aVar;
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeController#init");
        }
        this.f36175a.b(c.a.ON_INIT_CONTROLLER);
        if (!this.f36194t && (aVar = this.f36176b) != null) {
            aVar.a(this);
        }
        this.f36187m = false;
        O();
        this.f36190p = false;
        q4.d dVar = this.f36178d;
        if (dVar != null) {
            dVar.a();
        }
        w4.a aVar2 = this.f36179e;
        if (aVar2 != null) {
            aVar2.a();
            this.f36179e.f(this);
        }
        d<INFO> dVar2 = this.f36180f;
        if (dVar2 instanceof c) {
            ((c) dVar2).c();
        } else {
            this.f36180f = null;
        }
        x4.c cVar = this.f36183i;
        if (cVar != null) {
            cVar.reset();
            this.f36183i.g(null);
            this.f36183i = null;
        }
        this.f36184j = null;
        if (z3.a.u(2)) {
            z3.a.y(f36174x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f36185k, str);
        }
        this.f36185k = str;
        this.f36186l = obj;
        if (c6.b.d()) {
            c6.b.b();
        }
        if (this.f36182h != null) {
            c0();
        }
    }

    private boolean D(String str, com.facebook.datasource.c<T> cVar) {
        if (cVar == null && this.f36192r == null) {
            return true;
        }
        return str.equals(this.f36185k) && cVar == this.f36192r && this.f36188n;
    }

    private void E(String str, Throwable th) {
        if (z3.a.u(2)) {
            z3.a.z(f36174x, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f36185k, str, th);
        }
    }

    private void F(String str, T t10) {
        if (z3.a.u(2)) {
            z3.a.A(f36174x, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f36185k, str, w(t10), Integer.valueOf(x(t10)));
        }
    }

    private b.a G(com.facebook.datasource.c<T> cVar, INFO info, Uri uri) {
        return H(cVar == null ? null : cVar.getExtras(), I(info), uri);
    }

    private b.a H(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointF;
        x4.c cVar = this.f36183i;
        if (cVar instanceof v4.a) {
            String valueOf = String.valueOf(((v4.a) cVar).n());
            pointF = ((v4.a) this.f36183i).m();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return g5.a.a(f36172v, f36173w, map, t(), str, pointF, map2, o(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(String str, com.facebook.datasource.c<T> cVar, Throwable th, boolean z10) {
        Drawable drawable;
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!D(str, cVar)) {
            E("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (c6.b.d()) {
                c6.b.b();
                return;
            }
            return;
        }
        this.f36175a.b(z10 ? c.a.ON_DATASOURCE_FAILURE : c.a.ON_DATASOURCE_FAILURE_INT);
        if (z10) {
            E("final_failed @ onFailure", th);
            this.f36192r = null;
            this.f36189o = true;
            if (this.f36190p && (drawable = this.f36195u) != null) {
                this.f36183i.f(drawable, 1.0f, true);
            } else if (e0()) {
                this.f36183i.b(th);
            } else {
                this.f36183i.c(th);
            }
            R(th, cVar);
        } else {
            E("intermediate_failed @ onFailure", th);
            S(th);
        }
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(String str, com.facebook.datasource.c<T> cVar, T t10, float f10, boolean z10, boolean z11, boolean z12) {
        try {
            if (c6.b.d()) {
                c6.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!D(str, cVar)) {
                F("ignore_old_datasource @ onNewResult", t10);
                P(t10);
                cVar.close();
                if (c6.b.d()) {
                    c6.b.b();
                    return;
                }
                return;
            }
            this.f36175a.b(z10 ? c.a.ON_DATASOURCE_RESULT : c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable l10 = l(t10);
                T t11 = this.f36193s;
                Drawable drawable = this.f36195u;
                this.f36193s = t10;
                this.f36195u = l10;
                if (z10) {
                    F("set_final_result @ onNewResult", t10);
                    this.f36192r = null;
                    this.f36183i.f(l10, 1.0f, z11);
                    W(str, t10, cVar);
                } else if (z12) {
                    F("set_temporary_result @ onNewResult", t10);
                    this.f36183i.f(l10, 1.0f, z11);
                    W(str, t10, cVar);
                } else {
                    F("set_intermediate_result @ onNewResult", t10);
                    this.f36183i.f(l10, f10, z11);
                    T(str, t10);
                }
                if (drawable != null && drawable != l10) {
                    N(drawable);
                }
                if (t11 != null && t11 != t10) {
                    F("release_previous_result @ onNewResult", t11);
                    P(t11);
                }
                if (c6.b.d()) {
                    c6.b.b();
                }
            } catch (Exception e10) {
                F("drawable_failed @ onNewResult", t10);
                P(t10);
                J(str, cVar, e10, z10);
                if (c6.b.d()) {
                    c6.b.b();
                }
            }
        } catch (Throwable th) {
            if (c6.b.d()) {
                c6.b.b();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, com.facebook.datasource.c<T> cVar, float f10, boolean z10) {
        if (!D(str, cVar)) {
            E("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else if (z10) {
        } else {
            this.f36183i.d(f10, false);
        }
    }

    private void O() {
        Map<String, Object> map;
        boolean z10 = this.f36188n;
        this.f36188n = false;
        this.f36189o = false;
        com.facebook.datasource.c<T> cVar = this.f36192r;
        Map<String, Object> map2 = null;
        if (cVar != null) {
            map = cVar.getExtras();
            this.f36192r.close();
            this.f36192r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f36195u;
        if (drawable != null) {
            N(drawable);
        }
        if (this.f36191q != null) {
            this.f36191q = null;
        }
        this.f36195u = null;
        T t10 = this.f36193s;
        if (t10 != null) {
            Map<String, Object> I = I(y(t10));
            F("release", this.f36193s);
            P(this.f36193s);
            this.f36193s = null;
            map2 = I;
        }
        if (z10) {
            U(map, map2);
        }
    }

    private void R(Throwable th, com.facebook.datasource.c<T> cVar) {
        b.a G = G(cVar, null, null);
        p().f(this.f36185k, th);
        q().e(this.f36185k, th, G);
    }

    private void S(Throwable th) {
        p().q(this.f36185k, th);
        q().l(this.f36185k);
    }

    private void T(String str, T t10) {
        INFO y10 = y(t10);
        p().a(str, y10);
        q().a(str, y10);
    }

    private void U(Map<String, Object> map, Map<String, Object> map2) {
        p().g(this.f36185k);
        q().b(this.f36185k, H(map, map2, null));
    }

    private void W(String str, T t10, com.facebook.datasource.c<T> cVar) {
        INFO y10 = y(t10);
        p().l(str, y10, m());
        q().h(str, y10, G(cVar, y10, null));
    }

    private void c0() {
        x4.c cVar = this.f36183i;
        if (cVar instanceof v4.a) {
            ((v4.a) cVar).y(new C0486a());
        }
    }

    private boolean e0() {
        q4.d dVar;
        return this.f36189o && (dVar = this.f36178d) != null && dVar.e();
    }

    private Rect t() {
        x4.c cVar = this.f36183i;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q4.d A() {
        if (this.f36178d == null) {
            this.f36178d = new q4.d();
        }
        return this.f36178d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C(String str, Object obj) {
        B(str, obj);
        this.f36194t = false;
    }

    public abstract Map<String, Object> I(INFO info);

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(String str, T t10) {
    }

    protected abstract void N(Drawable drawable);

    protected abstract void P(T t10);

    public void Q(h5.b<INFO> bVar) {
        this.f36181g.y(bVar);
    }

    protected void V(com.facebook.datasource.c<T> cVar, INFO info) {
        p().p(this.f36185k, this.f36186l);
        q().d(this.f36185k, this.f36186l, G(cVar, info, z()));
    }

    public void X(String str) {
        this.f36191q = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Y(Drawable drawable) {
        this.f36184j = drawable;
        x4.c cVar = this.f36183i;
        if (cVar != null) {
            cVar.g(drawable);
        }
    }

    public void Z(e eVar) {
    }

    @Override // w4.a.InterfaceC0526a
    public boolean a() {
        if (z3.a.u(2)) {
            z3.a.x(f36174x, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f36185k);
        }
        if (e0()) {
            this.f36178d.b();
            this.f36183i.reset();
            f0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a0(w4.a aVar) {
        this.f36179e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // x4.a
    public void b() {
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeController#onAttach");
        }
        if (z3.a.u(2)) {
            z3.a.y(f36174x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f36185k, this.f36188n ? "request already submitted" : "request needs submit");
        }
        this.f36175a.b(c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f36183i);
        this.f36176b.a(this);
        this.f36187m = true;
        if (!this.f36188n) {
            f0();
        }
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0(boolean z10) {
        this.f36190p = z10;
    }

    @Override // x4.a
    public void c() {
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeController#onDetach");
        }
        if (z3.a.u(2)) {
            z3.a.x(f36174x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f36185k);
        }
        this.f36175a.b(c.a.ON_DETACH_CONTROLLER);
        this.f36187m = false;
        this.f36176b.d(this);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    @Override // x4.a
    public x4.b d() {
        return this.f36183i;
    }

    protected boolean d0() {
        return e0();
    }

    @Override // x4.a
    public void e(x4.b bVar) {
        if (z3.a.u(2)) {
            z3.a.y(f36174x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f36185k, bVar);
        }
        this.f36175a.b(bVar != null ? c.a.ON_SET_HIERARCHY : c.a.ON_CLEAR_HIERARCHY);
        if (this.f36188n) {
            this.f36176b.a(this);
            release();
        }
        x4.c cVar = this.f36183i;
        if (cVar != null) {
            cVar.g(null);
            this.f36183i = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof x4.c));
            x4.c cVar2 = (x4.c) bVar;
            this.f36183i = cVar2;
            cVar2.g(this.f36184j);
        }
        if (this.f36182h != null) {
            c0();
        }
    }

    protected void f0() {
        if (c6.b.d()) {
            c6.b.a("AbstractDraweeController#submitRequest");
        }
        T n10 = n();
        if (n10 != null) {
            if (c6.b.d()) {
                c6.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f36192r = null;
            this.f36188n = true;
            this.f36189o = false;
            this.f36175a.b(c.a.ON_SUBMIT_CACHE_HIT);
            V(this.f36192r, y(n10));
            K(this.f36185k, n10);
            L(this.f36185k, this.f36192r, n10, 1.0f, true, true, true);
            if (c6.b.d()) {
                c6.b.b();
            }
            if (c6.b.d()) {
                c6.b.b();
                return;
            }
            return;
        }
        this.f36175a.b(c.a.ON_DATASOURCE_SUBMIT);
        this.f36183i.d(0.0f, true);
        this.f36188n = true;
        this.f36189o = false;
        com.facebook.datasource.c<T> s10 = s();
        this.f36192r = s10;
        V(s10, null);
        if (z3.a.u(2)) {
            z3.a.y(f36174x, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f36185k, Integer.valueOf(System.identityHashCode(this.f36192r)));
        }
        this.f36192r.e(new b(this.f36185k, this.f36192r.b()), this.f36177c);
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(d<? super INFO> dVar) {
        k.g(dVar);
        d<INFO> dVar2 = this.f36180f;
        if (dVar2 instanceof c) {
            ((c) dVar2).b(dVar);
        } else if (dVar2 != null) {
            this.f36180f = c.e(dVar2, dVar);
        } else {
            this.f36180f = dVar;
        }
    }

    public void k(h5.b<INFO> bVar) {
        this.f36181g.q(bVar);
    }

    protected abstract Drawable l(T t10);

    public Animatable m() {
        Drawable drawable = this.f36195u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    protected T n() {
        return null;
    }

    public Object o() {
        return this.f36186l;
    }

    @Override // x4.a
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (z3.a.u(2)) {
            z3.a.y(f36174x, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f36185k, motionEvent);
        }
        w4.a aVar = this.f36179e;
        if (aVar == null) {
            return false;
        }
        if (aVar.b() || d0()) {
            this.f36179e.d(motionEvent);
            return true;
        }
        return false;
    }

    protected d<INFO> p() {
        d<INFO> dVar = this.f36180f;
        return dVar == null ? r4.c.b() : dVar;
    }

    protected h5.b<INFO> q() {
        return this.f36181g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable r() {
        return this.f36184j;
    }

    @Override // q4.a.InterfaceC0479a
    public void release() {
        this.f36175a.b(c.a.ON_RELEASE_CONTROLLER);
        q4.d dVar = this.f36178d;
        if (dVar != null) {
            dVar.c();
        }
        w4.a aVar = this.f36179e;
        if (aVar != null) {
            aVar.e();
        }
        x4.c cVar = this.f36183i;
        if (cVar != null) {
            cVar.reset();
        }
        O();
    }

    protected abstract com.facebook.datasource.c<T> s();

    public String toString() {
        return j.c(this).c("isAttached", this.f36187m).c("isRequestSubmitted", this.f36188n).c("hasFetchFailed", this.f36189o).a("fetchedImage", x(this.f36193s)).b("events", this.f36175a.toString()).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w4.a u() {
        return this.f36179e;
    }

    public String v() {
        return this.f36185k;
    }

    protected String w(T t10) {
        return t10 != null ? t10.getClass().getSimpleName() : "<null>";
    }

    protected int x(T t10) {
        return System.identityHashCode(t10);
    }

    protected abstract INFO y(T t10);

    protected Uri z() {
        return null;
    }
}
