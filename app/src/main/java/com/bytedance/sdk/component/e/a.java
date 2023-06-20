package com.bytedance.sdk.component.e;

import android.content.Context;
import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.e.b.d;
import com.bytedance.sdk.component.e.c.f;
import com.bytedance.sdk.component.e.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private i f10290a;

    /* renamed from: b  reason: collision with root package name */
    private f f10291b;

    /* renamed from: c  reason: collision with root package name */
    private int f10292c;

    /* compiled from: NetClient.java */
    /* renamed from: com.bytedance.sdk.component.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0158a {

        /* renamed from: d  reason: collision with root package name */
        boolean f10296d = true;

        /* renamed from: e  reason: collision with root package name */
        final List<g> f10297e = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        int f10293a = 10000;

        /* renamed from: b  reason: collision with root package name */
        int f10294b = 10000;

        /* renamed from: c  reason: collision with root package name */
        int f10295c = 10000;

        public C0158a a(long j10, TimeUnit timeUnit) {
            this.f10293a = a("timeout", j10, timeUnit);
            return this;
        }

        public C0158a b(long j10, TimeUnit timeUnit) {
            this.f10294b = a("timeout", j10, timeUnit);
            return this;
        }

        public C0158a c(long j10, TimeUnit timeUnit) {
            this.f10295c = a("timeout", j10, timeUnit);
            return this;
        }

        public C0158a a(boolean z10) {
            this.f10296d = z10;
            return this;
        }

        private static int a(String str, long j10, TimeUnit timeUnit) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 >= 0) {
                Objects.requireNonNull(timeUnit, "unit == null");
                long millis = timeUnit.toMillis(j10);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i10 <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            }
            throw new IllegalArgumentException(str + " < 0");
        }

        public a a() {
            return new a(this);
        }
    }

    public void a(Context context, boolean z10, boolean z11, com.bytedance.sdk.component.e.c.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (bVar != null) {
            int a10 = bVar.a();
            this.f10292c = a10;
            f fVar = this.f10291b;
            if (fVar != null) {
                fVar.a(a10);
            }
            com.bytedance.sdk.component.e.c.g.a().a(this.f10292c).a(z11);
            com.bytedance.sdk.component.e.c.g.a().a(this.f10292c).a(bVar);
            com.bytedance.sdk.component.e.c.g.a().a(this.f10292c).a(context, com.bytedance.sdk.component.e.d.f.b(context));
            if (com.bytedance.sdk.component.e.d.f.a(context) || (!com.bytedance.sdk.component.e.d.f.b(context) && z10)) {
                com.bytedance.sdk.component.e.c.g.a().a(this.f10292c, context).d();
                com.bytedance.sdk.component.e.c.g.a().a(this.f10292c, context).a();
            }
            if (com.bytedance.sdk.component.e.d.f.b(context)) {
                com.bytedance.sdk.component.e.c.g.a().a(this.f10292c, context).d();
                com.bytedance.sdk.component.e.c.g.a().a(this.f10292c, context).a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
    }

    public d b() {
        return new d(this.f10290a);
    }

    public com.bytedance.sdk.component.e.b.b c() {
        return new com.bytedance.sdk.component.e.b.b(this.f10290a);
    }

    public com.bytedance.sdk.component.e.b.a d() {
        return new com.bytedance.sdk.component.e.b.a(this.f10290a);
    }

    public i e() {
        return this.f10290a;
    }

    private a(C0158a c0158a) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i.a b10 = new i.a().a(c0158a.f10293a, timeUnit).c(c0158a.f10295c, timeUnit).b(c0158a.f10294b, timeUnit);
        if (c0158a.f10296d) {
            f fVar = new f();
            this.f10291b = fVar;
            b10.a(fVar);
        }
        List<g> list = c0158a.f10297e;
        if (list != null && list.size() > 0) {
            for (g gVar : c0158a.f10297e) {
                b10.a(gVar);
            }
        }
        this.f10290a = b10.a();
    }

    public static void a() {
        com.bytedance.sdk.component.e.d.b.a(b.a.DEBUG);
    }
}
