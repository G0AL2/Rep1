package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f6121d;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f6122a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f6123b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f6124c;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f6125e = false;

    private a() {
    }

    public static a a() {
        if (f6121d == null) {
            synchronized (a.class) {
                if (f6121d == null) {
                    f6121d = new a();
                }
            }
        }
        return f6121d;
    }

    public void a(CrashType crashType, long j10, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, b bVar, c cVar) {
        this.f6122a = str;
        this.f6123b = bVar;
        this.f6124c = cVar;
        if (this.f6125e) {
            return;
        }
        this.f6125e = true;
        p.b().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    public void b() {
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }
}
