package z5;

import android.os.Build;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PoolFactory.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final q f40046a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.i f40047b;

    /* renamed from: c  reason: collision with root package name */
    private c f40048c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.i f40049d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.f f40050e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.imagepipeline.memory.i f40051f;

    /* renamed from: g  reason: collision with root package name */
    private b4.h f40052g;

    /* renamed from: h  reason: collision with root package name */
    private b4.k f40053h;

    /* renamed from: i  reason: collision with root package name */
    private b4.a f40054i;

    public r(q qVar) {
        this.f40046a = (q) y3.k.g(qVar);
    }

    private com.facebook.imagepipeline.memory.i a() {
        if (this.f40047b == null) {
            try {
                this.f40047b = (com.facebook.imagepipeline.memory.i) AshmemMemoryChunkPool.class.getConstructor(b4.c.class, s.class, t.class).newInstance(this.f40046a.i(), this.f40046a.g(), this.f40046a.h());
            } catch (ClassNotFoundException unused) {
                this.f40047b = null;
            } catch (IllegalAccessException unused2) {
                this.f40047b = null;
            } catch (InstantiationException unused3) {
                this.f40047b = null;
            } catch (NoSuchMethodException unused4) {
                this.f40047b = null;
            } catch (InvocationTargetException unused5) {
                this.f40047b = null;
            }
        }
        return this.f40047b;
    }

    private com.facebook.imagepipeline.memory.i f(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return a();
                }
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            return c();
        }
        return g();
    }

    public c b() {
        if (this.f40048c == null) {
            String e10 = this.f40046a.e();
            char c10 = 65535;
            switch (e10.hashCode()) {
                case -1868884870:
                    if (e10.equals("legacy_default_params")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e10.equals("legacy")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e10.equals("experimental")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e10.equals("dummy_with_tracking")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e10.equals("dummy")) {
                        c10 = 0;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                this.f40048c = new j();
            } else if (c10 == 1) {
                this.f40048c = new k();
            } else if (c10 == 2) {
                this.f40048c = new l(this.f40046a.b(), this.f40046a.a(), o.h(), this.f40046a.m() ? this.f40046a.i() : null);
            } else if (c10 != 3) {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f40048c = new com.facebook.imagepipeline.memory.d(this.f40046a.i(), this.f40046a.c(), this.f40046a.d(), this.f40046a.l());
                } else {
                    this.f40048c = new j();
                }
            } else {
                this.f40048c = new com.facebook.imagepipeline.memory.d(this.f40046a.i(), f.a(), this.f40046a.d(), this.f40046a.l());
            }
        }
        return this.f40048c;
    }

    public com.facebook.imagepipeline.memory.i c() {
        if (this.f40049d == null) {
            try {
                this.f40049d = (com.facebook.imagepipeline.memory.i) BufferMemoryChunkPool.class.getConstructor(b4.c.class, s.class, t.class).newInstance(this.f40046a.i(), this.f40046a.g(), this.f40046a.h());
            } catch (ClassNotFoundException unused) {
                this.f40049d = null;
            } catch (IllegalAccessException unused2) {
                this.f40049d = null;
            } catch (InstantiationException unused3) {
                this.f40049d = null;
            } catch (NoSuchMethodException unused4) {
                this.f40049d = null;
            } catch (InvocationTargetException unused5) {
                this.f40049d = null;
            }
        }
        return this.f40049d;
    }

    public com.facebook.imagepipeline.memory.f d() {
        if (this.f40050e == null) {
            this.f40050e = new com.facebook.imagepipeline.memory.f(this.f40046a.i(), this.f40046a.f());
        }
        return this.f40050e;
    }

    public int e() {
        return this.f40046a.f().f40059e;
    }

    public com.facebook.imagepipeline.memory.i g() {
        if (this.f40051f == null) {
            try {
                this.f40051f = (com.facebook.imagepipeline.memory.i) NativeMemoryChunkPool.class.getConstructor(b4.c.class, s.class, t.class).newInstance(this.f40046a.i(), this.f40046a.g(), this.f40046a.h());
            } catch (ClassNotFoundException e10) {
                z3.a.k("PoolFactory", "", e10);
                this.f40051f = null;
            } catch (IllegalAccessException e11) {
                z3.a.k("PoolFactory", "", e11);
                this.f40051f = null;
            } catch (InstantiationException e12) {
                z3.a.k("PoolFactory", "", e12);
                this.f40051f = null;
            } catch (NoSuchMethodException e13) {
                z3.a.k("PoolFactory", "", e13);
                this.f40051f = null;
            } catch (InvocationTargetException e14) {
                z3.a.k("PoolFactory", "", e14);
                this.f40051f = null;
            }
        }
        return this.f40051f;
    }

    public b4.h h() {
        return i(!r5.m.a() ? 1 : 0);
    }

    public b4.h i(int i10) {
        if (this.f40052g == null) {
            com.facebook.imagepipeline.memory.i f10 = f(i10);
            y3.k.h(f10, "failed to get pool for chunk type: " + i10);
            this.f40052g = new com.facebook.imagepipeline.memory.k(f10, j());
        }
        return this.f40052g;
    }

    public b4.k j() {
        if (this.f40053h == null) {
            this.f40053h = new b4.k(k());
        }
        return this.f40053h;
    }

    public b4.a k() {
        if (this.f40054i == null) {
            this.f40054i = new com.facebook.imagepipeline.memory.g(this.f40046a.i(), this.f40046a.j(), this.f40046a.k());
        }
        return this.f40054i;
    }
}
