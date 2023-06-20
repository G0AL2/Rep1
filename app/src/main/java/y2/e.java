package y2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.bytedance.sdk.component.utils.l;
import java.util.Set;
import z2.c;

/* compiled from: Proxy.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static volatile z2.b f39187a;

    /* renamed from: b  reason: collision with root package name */
    static volatile z2.c f39188b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a3.c f39189c;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    private static volatile Context f39191e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f39192f;

    /* renamed from: h  reason: collision with root package name */
    static volatile boolean f39194h;

    /* renamed from: k  reason: collision with root package name */
    public static volatile Integer f39197k;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f39190d = l.c();

    /* renamed from: g  reason: collision with root package name */
    static volatile boolean f39193g = true;

    /* renamed from: i  reason: collision with root package name */
    static volatile int f39195i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static volatile int f39196j = 3;

    public static Context a() {
        return f39191e;
    }

    public static void b(int i10) {
        f39195i = i10;
    }

    public static void c(z2.c cVar, Context context) {
        if (cVar != null && context != null) {
            f39191e = context.getApplicationContext();
            if (f39188b != null) {
                return;
            }
            f39188b = cVar;
            f39189c = a3.c.b(context);
            f39188b.i(new a());
            f e10 = f.e();
            e10.h(cVar);
            e10.f(f39189c);
            d o10 = d.o();
            o10.h(cVar);
            o10.f(f39189c);
            return;
        }
        throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
    }

    public static void d(boolean z10) {
        f39193g = z10;
    }

    public static z2.c e() {
        return f39188b;
    }

    public static void f(boolean z10) {
        f39194h = z10;
    }

    public static z2.b g() {
        return f39187a;
    }

    /* compiled from: Proxy.java */
    /* loaded from: classes.dex */
    static class a implements c.f {
        a() {
        }

        @Override // z2.c.f
        public void a(String str) {
            if (e.f39190d) {
                Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + str);
            }
        }

        @Override // z2.c.f
        public void a(Set<String> set) {
            e.f39189c.g(set, 0);
            if (e.f39190d) {
                Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set);
            }
        }
    }
}
