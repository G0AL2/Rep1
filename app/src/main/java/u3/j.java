package u3;

import java.io.IOException;
import t3.c;

/* compiled from: SettableCacheEvent.java */
/* loaded from: classes.dex */
public class j implements t3.b {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f37426c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static j f37427d;

    /* renamed from: e  reason: collision with root package name */
    private static int f37428e;

    /* renamed from: a  reason: collision with root package name */
    private t3.d f37429a;

    /* renamed from: b  reason: collision with root package name */
    private j f37430b;

    private j() {
    }

    public static j a() {
        synchronized (f37426c) {
            j jVar = f37427d;
            if (jVar != null) {
                f37427d = jVar.f37430b;
                jVar.f37430b = null;
                f37428e--;
                return jVar;
            }
            return new j();
        }
    }

    private void c() {
    }

    public void b() {
        synchronized (f37426c) {
            if (f37428e < 5) {
                c();
                f37428e++;
                j jVar = f37427d;
                if (jVar != null) {
                    this.f37430b = jVar;
                }
                f37427d = this;
            }
        }
    }

    public j d(t3.d dVar) {
        this.f37429a = dVar;
        return this;
    }

    public j e(long j10) {
        return this;
    }

    public j f(long j10) {
        return this;
    }

    public j g(c.a aVar) {
        return this;
    }

    public j h(IOException iOException) {
        return this;
    }

    public j i(long j10) {
        return this;
    }

    public j j(String str) {
        return this;
    }
}
