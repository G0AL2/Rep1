package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3376a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f3377b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f3377b = true;
        Map<String, Object> map = this.f3376a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f3376a.values()) {
                    b(obj);
                }
            }
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f3376a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = (T) this.f3376a.get(str);
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T e(String str, T t10) {
        Object obj;
        synchronized (this.f3376a) {
            obj = this.f3376a.get(str);
            if (obj == null) {
                this.f3376a.put(str, t10);
            }
        }
        if (obj != null) {
            t10 = obj;
        }
        if (this.f3377b) {
            b(t10);
        }
        return t10;
    }
}
