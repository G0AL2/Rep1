package c4;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;
import y3.k;

/* compiled from: SharedReference.java */
/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Object, Integer> f5319d = new IdentityHashMap();

    /* renamed from: a  reason: collision with root package name */
    private T f5320a;

    /* renamed from: b  reason: collision with root package name */
    private int f5321b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final h<T> f5322c;

    /* compiled from: SharedReference.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(T t10, h<T> hVar) {
        this.f5320a = (T) k.g(t10);
        this.f5322c = (h) k.g(hVar);
        a(t10);
    }

    private static void a(Object obj) {
        if (c4.a.g0() && ((obj instanceof Bitmap) || (obj instanceof d))) {
            return;
        }
        Map<Object, Integer> map = f5319d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private synchronized int c() {
        int i10;
        e();
        k.b(Boolean.valueOf(this.f5321b > 0));
        i10 = this.f5321b - 1;
        this.f5321b = i10;
        return i10;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i<?> iVar) {
        return iVar != null && iVar.g();
    }

    private static void i(Object obj) {
        Map<Object, Integer> map = f5319d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                z3.a.M("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized void b() {
        e();
        this.f5321b++;
    }

    public void d() {
        T t10;
        if (c() == 0) {
            synchronized (this) {
                t10 = this.f5320a;
                this.f5320a = null;
            }
            if (t10 != null) {
                this.f5322c.a(t10);
                i(t10);
            }
        }
    }

    public synchronized T f() {
        return this.f5320a;
    }

    public synchronized boolean g() {
        return this.f5321b > 0;
    }
}
