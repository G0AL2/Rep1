package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.l.q;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.s;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f6454a;

    private i(Context context) {
        this.f6454a = context;
    }

    public static void a(Context context) {
        a(context, 0);
    }

    public static void a(Context context, int i10) {
        p.b().a(new i(context), i10);
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.h.g());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.apm.insight.b.g.a(this.f6454a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.f6454a)) {
                b.a().a(com.apm.insight.l.p.b(this.f6454a));
            } else {
                NativeImpl.i();
            }
            s.a().a(com.apm.insight.h.a().b(), com.apm.insight.entity.b.b());
            if (p.b().a() == null) {
            }
        } catch (Throwable th) {
            try {
                q.b(th);
            } finally {
                s.a().a(com.apm.insight.h.a().b(), com.apm.insight.entity.b.b());
                if (p.b().a() != null) {
                    com.apm.insight.j.d.a(p.b().a(), this.f6454a).a();
                }
            }
        }
    }
}
