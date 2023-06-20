package com.ironsource.environment.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.e.c;
import com.ironsource.environment.h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, Object> f26133a;

    /* renamed from: b  reason: collision with root package name */
    AtomicBoolean f26134b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f26135c;

    /* renamed from: com.ironsource.environment.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0337a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile a f26136a = new a((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f26137a;

        b(Context context) {
            this.f26137a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] C;
            try {
                a aVar = a.this;
                Context context = this.f26137a;
                if (context != null && (C = h.C(context)) != null && C.length == 2) {
                    String str = C[0];
                    Boolean valueOf = Boolean.valueOf(C[1]);
                    if (!TextUtils.isEmpty(str)) {
                        aVar.a("gaid", str);
                        aVar.a("lat", valueOf);
                    }
                }
            } catch (Exception unused) {
            }
            a.this.f26134b.set(false);
        }
    }

    private a() {
        this.f26134b = new AtomicBoolean(false);
        this.f26135c = new AtomicBoolean(false);
        this.f26133a = new ConcurrentHashMap<>();
    }

    /* synthetic */ a(byte b10) {
        this();
    }

    private void b(String str) {
        try {
            this.f26133a.remove(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean c(String str) {
        try {
            return this.f26133a.containsKey(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void d(Context context) {
        if (this.f26134b.get()) {
            return;
        }
        try {
            this.f26134b.set(true);
            c cVar = c.f26160a;
            c.b(new b(context), 0L);
        } catch (Exception unused) {
            this.f26134b.set(false);
        }
    }

    public final JSONObject a(Context context) {
        b(context);
        return new JSONObject(com.ironsource.environment.c.b.a(this.f26133a));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f26133a.put(str, obj);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        d(context);
        String B = h.B(context);
        if (!TextUtils.isEmpty(B)) {
            a("asid", B);
        } else if (c("asid")) {
            b("asid");
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            a("lang", language.toUpperCase());
        }
        String c10 = h.c();
        if (!TextUtils.isEmpty(c10)) {
            a("tz", c10);
        }
        String a10 = com.ironsource.d.a.a(context);
        if (!TextUtils.isEmpty(a10) && !a10.equals("none")) {
            a("connt", a10);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a("vpn", Boolean.valueOf(com.ironsource.d.a.c(context)));
        }
        String j10 = h.j(context);
        if (!TextUtils.isEmpty(j10)) {
            a("icc", j10);
        }
        a("vol", Float.valueOf(h.l(context)));
        a("dfs", String.valueOf(h.p()));
        a("scrnw", Integer.valueOf(h.k()));
        a("scrnh", Integer.valueOf(h.l()));
        a("ltime", String.valueOf(h.a()));
        a("tzoff", String.valueOf(h.b()));
        a("mcc", Integer.valueOf(a.AnonymousClass1.c(context)));
        a("mnc", Integer.valueOf(a.AnonymousClass1.d(context)));
        a("sdcrd", Boolean.valueOf(h.d()));
        a("chrg", Boolean.valueOf(h.e(context)));
        a("chrgt", Integer.valueOf(h.f(context)));
        a("apm", Boolean.valueOf(h.g(context)));
        a("owp", Boolean.valueOf(h.h(context)));
        a("rt", Boolean.valueOf(h.j()));
        a("sscl", String.valueOf(h.o()));
        a("bat", Integer.valueOf(h.v(context)));
        a("lpm", Boolean.valueOf(h.w(context)));
        a("apor", h.n(context));
        a("ua", h.r());
        int D = h.D(context);
        if (D >= 0) {
            a("tca", Integer.valueOf(D));
        }
        Object E = h.E(context);
        if (E != null) {
            a("tcs", E);
        }
    }
}
