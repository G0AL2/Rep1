package z5;

/* compiled from: NoOpPoolStatsTracker.java */
/* loaded from: classes.dex */
public class o implements t {

    /* renamed from: a  reason: collision with root package name */
    private static o f40019a;

    private o() {
    }

    public static synchronized o h() {
        o oVar;
        synchronized (o.class) {
            if (f40019a == null) {
                f40019a = new o();
            }
            oVar = f40019a;
        }
        return oVar;
    }

    @Override // z5.t
    public void a() {
    }

    @Override // z5.t
    public void b(int i10) {
    }

    @Override // z5.t
    public void c(int i10) {
    }

    @Override // z5.t
    public void d(int i10) {
    }

    @Override // z5.t
    public void e(int i10) {
    }

    @Override // z5.t
    public void f(com.facebook.imagepipeline.memory.b bVar) {
    }

    @Override // z5.t
    public void g() {
    }
}
