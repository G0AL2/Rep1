package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: InitHelper.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f12488a = false;

    /* renamed from: f  reason: collision with root package name */
    private static volatile HandlerThread f12493f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile Handler f12494g;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicBoolean f12492e = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f12489b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f12490c = false;

    /* renamed from: h  reason: collision with root package name */
    private static volatile int f12495h = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final List<TTAdSdk.InitCallback> f12491d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InitHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Handler f12496a = new Handler(Looper.getMainLooper());
    }

    static {
        f12493f = null;
        f12494g = null;
        f12493f = new HandlerThread("tt_pangle_thread_init", 10);
        f12493f.start();
        f12494g = new Handler(f12493f.getLooper());
    }

    public static void a() {
        Context a10;
        if (m.h().d() && (a10 = m.a()) != null) {
            try {
                com.bytedance.sdk.openadsdk.i.d.a().b().a(a10, com.bytedance.sdk.openadsdk.multipro.b.c(), true, new com.bytedance.sdk.openadsdk.i.c(a10));
            } catch (Exception unused) {
            }
        }
    }

    public static void b() {
        com.bytedance.sdk.component.adexpress.a.a.a.a().a(new com.bytedance.sdk.component.adexpress.a.a.b() { // from class: com.bytedance.sdk.openadsdk.core.k.1
            @Override // com.bytedance.sdk.component.adexpress.a.a.b
            public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.b
            public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.c(com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.b
            public int a(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.b
            public void a(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.a.a.a.a().a(new com.bytedance.sdk.component.adexpress.a.a.c() { // from class: com.bytedance.sdk.openadsdk.core.k.2
            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public int a() {
                if (m.h() == null) {
                    return 0;
                }
                return m.h().b();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public Context b() {
                return m.a();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public Handler c() {
                return k.d();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public void d() {
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public com.bytedance.sdk.component.adexpress.a.c.a e() {
                return m.f().a();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public com.bytedance.sdk.component.e.b.a f() {
                return com.bytedance.sdk.openadsdk.i.d.a().b().d();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public com.bytedance.sdk.component.e.b.b g() {
                return com.bytedance.sdk.openadsdk.i.d.a().b().c();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public String h() {
                return h.d().f();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public int i() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public int j() {
                return m.h().H();
            }

            @Override // com.bytedance.sdk.component.adexpress.a.a.c
            public int k() {
                return 0;
            }
        });
        com.bytedance.sdk.component.adexpress.a.a.a.a().a(new com.bytedance.sdk.component.adexpress.a.a.d() { // from class: com.bytedance.sdk.openadsdk.core.k.3
            @Override // com.bytedance.sdk.component.adexpress.a.a.d
            public void a(int i10) {
                com.bytedance.sdk.openadsdk.h.b.a().b(com.bytedance.sdk.openadsdk.h.a.b.b().b(i10).f(g.a(i10)));
            }
        });
        com.bytedance.sdk.component.widget.a.a.a().a(new com.bytedance.sdk.component.widget.a.b() { // from class: com.bytedance.sdk.openadsdk.core.k.4
            @Override // com.bytedance.sdk.component.widget.a.b
            public void a(com.bytedance.sdk.component.widget.b.a aVar, String str, String str2, JSONObject jSONObject, long j10) {
                com.bytedance.sdk.openadsdk.core.e.n nVar = new com.bytedance.sdk.openadsdk.core.e.n();
                nVar.q(aVar.a());
                nVar.m(aVar.b());
                nVar.k(aVar.c());
                com.bytedance.sdk.openadsdk.b.e.a(m.a(), nVar, str, str2, jSONObject, j10);
            }

            @Override // com.bytedance.sdk.component.widget.a.b
            public boolean a() {
                return true;
            }
        });
    }

    public static Handler c() {
        if (f12493f == null || !f12493f.isAlive()) {
            synchronized (k.class) {
                if (f12493f == null || !f12493f.isAlive()) {
                    f12493f = new HandlerThread("tt_pangle_thread_init", -1);
                    f12493f.start();
                    f12494g = new Handler(f12493f.getLooper());
                }
            }
        }
        return f12494g;
    }

    public static Handler d() {
        return a.f12496a;
    }

    public static int e() {
        return f12495h;
    }

    public static void a(Context context) {
        com.bytedance.sdk.openadsdk.utils.r.a();
        com.bytedance.sdk.openadsdk.utils.v.a(context);
        b(context);
        m.i().a();
        s.a(j.a(context));
        m.g().a();
        com.bytedance.sdk.component.adexpress.a.b.a.a();
        com.bytedance.sdk.openadsdk.core.video.b.a.a().b();
    }

    private static void b(Context context) {
        c.a(context).a("uuid", com.bytedance.sdk.openadsdk.utils.l.a());
    }

    public static void a(int i10) {
        f12495h = i10;
    }
}
