package s1;

/* compiled from: TaskCompletionSource.java */
/* loaded from: classes.dex */
public class g<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final f<TResult> f36711a = new f<>();

    public f<TResult> a() {
        return this.f36711a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f36711a.p();
    }

    public boolean f(Exception exc) {
        return this.f36711a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.f36711a.r(tresult);
    }
}
