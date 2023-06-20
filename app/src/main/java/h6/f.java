package h6;

/* compiled from: SingleThreadAsserter.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private Thread f31110a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f31110a == null) {
            this.f31110a = currentThread;
        }
        f6.a.a(this.f31110a == currentThread);
    }
}
