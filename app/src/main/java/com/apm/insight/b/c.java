package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static long f6157b;

    /* renamed from: a  reason: collision with root package name */
    private final b f6158a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6159c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f6160d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f6159c) {
                    return;
                }
                c.this.f6158a.d();
                long unused = c.f6157b = SystemClock.uptimeMillis();
                f.a();
                p.b().a(c.this.f6160d, 500L);
                com.apm.insight.runtime.b.a(c.f6157b);
            }
        };
        this.f6160d = runnable;
        this.f6158a = bVar;
        p.b().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f6157b <= 15000;
    }

    public void a() {
        if (this.f6159c) {
            return;
        }
        p.b().a(this.f6160d, 5000L);
    }

    public void b() {
        this.f6159c = true;
    }
}
