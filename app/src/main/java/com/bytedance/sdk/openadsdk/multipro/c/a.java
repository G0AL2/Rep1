package com.bytedance.sdk.openadsdk.multipro.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.b.f;
import com.bytedance.sdk.openadsdk.b.g;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.b.q;
import com.bytedance.sdk.openadsdk.b.s;
import com.bytedance.sdk.openadsdk.b.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.k.h;
import com.bytedance.sdk.openadsdk.multipro.e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AdEventProviderImpl.java */
/* loaded from: classes.dex */
public class a implements com.bytedance.sdk.openadsdk.multipro.a {

    /* compiled from: AdEventProviderImpl.java */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0185a implements com.bytedance.sdk.openadsdk.h.a.a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f13522a;

        private C0185a(String str) {
            try {
                this.f13522a = new JSONObject(str);
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0185a b(String str) {
            return new C0185a(str);
        }

        @Override // com.bytedance.sdk.openadsdk.h.a.a
        public JSONObject a() {
            return this.f13522a;
        }
    }

    /* compiled from: AdEventProviderImpl.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.h.c.c f13526a;

        public static com.bytedance.sdk.openadsdk.h.c.c a() {
            if (f13526a == null) {
                synchronized (com.bytedance.sdk.openadsdk.h.c.c.class) {
                    if (f13526a == null) {
                        f13526a = new com.bytedance.sdk.openadsdk.h.c.c();
                    }
                }
            }
            return f13526a;
        }
    }

    /* compiled from: AdEventProviderImpl.java */
    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.k.a f13527a;

        public static com.bytedance.sdk.openadsdk.k.a a() {
            if (f13527a == null) {
                synchronized (com.bytedance.sdk.openadsdk.k.a.class) {
                    if (f13527a == null) {
                        f13527a = new com.bytedance.sdk.openadsdk.k.b(m.a(), new h(m.a()));
                    }
                }
            }
            return f13527a;
        }
    }

    public static void a(boolean z10) {
        if (m.a() == null) {
            return;
        }
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                f10.getType(Uri.parse(g() + "logStatusStart" + ("?isRealTime=" + String.valueOf(z10))));
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                String a10 = com.bytedance.sdk.openadsdk.multipro.c.a(str);
                f10.getType(Uri.parse(g() + "logStatusUpload?event=" + a10));
            }
        } catch (Throwable unused) {
        }
    }

    public static void c() {
        if (m.a() == null) {
            return;
        }
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                f10.getType(Uri.parse(g() + "adEventStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void d() {
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                f10.getType(Uri.parse(g() + "trackFailed"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void e() {
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                f10.getType(Uri.parse(g() + "logStatusInit"));
            }
        } catch (Throwable unused) {
        }
    }

    private static IListenerManager f() {
        try {
            if (m.a() != null) {
                return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String g() {
        return e.f13532b + "/t_event_ad_event/";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public int a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public Uri a(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a() {
        return "t_event_ad_event";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public void b() {
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l.b("AdEventProviderImpl", "dispatch event");
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                String a10 = com.bytedance.sdk.openadsdk.multipro.c.a(str);
                f10.getType(Uri.parse(g() + "adEventDispatch?event=" + a10));
            }
        } catch (Throwable th) {
            l.e("AdEventProviderImpl", "dispatch event Throwable:" + th.toString());
        }
    }

    /* compiled from: AdEventProviderImpl.java */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> f13523a;

        /* renamed from: b  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f13524b;

        /* renamed from: c  reason: collision with root package name */
        private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f13525c;

        static com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> a() {
            if (f13523a == null) {
                synchronized (m.class) {
                    if (f13523a == null) {
                        f13523a = new com.bytedance.sdk.openadsdk.b.c<>(new g(m.a()), m.f(), h.c.a(), d());
                    }
                }
            }
            return f13523a;
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> b() {
            if (f13525c == null) {
                synchronized (m.class) {
                    if (f13525c == null) {
                        f13525c = a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
            return f13525c;
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> c() {
            if (f13524b == null) {
                synchronized (m.class) {
                    if (f13524b == null) {
                        f13524b = a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
            return f13524b;
        }

        private static h.b d() {
            return new h.b() { // from class: com.bytedance.sdk.openadsdk.multipro.c.a.b.1
                @Override // com.bytedance.sdk.openadsdk.b.h.b
                public boolean a() {
                    return o.a(m.a());
                }
            };
        }

        public static com.bytedance.sdk.openadsdk.b.c<c.a> a(String str, String str2, boolean z10) {
            h.c b10;
            f qVar;
            if (z10) {
                qVar = new s(m.a());
                b10 = h.c.a();
            } else {
                b10 = h.c.b();
                qVar = new q(m.a());
            }
            h.b d10 = d();
            return new com.bytedance.sdk.openadsdk.b.c<>(qVar, null, b10, d10, new t(str, str2, qVar, null, b10, d10));
        }
    }

    public static void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (String str : list) {
                    sb2.append(com.bytedance.sdk.openadsdk.multipro.c.a(str));
                    sb2.append(",");
                }
                String a10 = com.bytedance.sdk.openadsdk.multipro.c.a(sb2.toString());
                String str2 = "?track=" + String.valueOf(a10);
                IListenerManager f10 = f();
                if (f10 == null) {
                    return;
                }
                f10.getType(Uri.parse(g() + "trackUrl" + str2));
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IListenerManager f10 = f();
            if (f10 != null) {
                f10.getType(Uri.parse(g() + "logStatusDispatch" + ("?event=" + com.bytedance.sdk.openadsdk.multipro.c.a(str) + "&isRealTime=" + String.valueOf(z10))));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.a
    public String a(Uri uri) {
        String str = uri.getPath().split("/")[2];
        if ("adEventStart".equals(str)) {
            l.b("AdEventProviderImpl", "====ad event function will be start====");
            b.a().a();
        } else if ("logStatusStart".equals(str)) {
            l.b("AdEventProviderImpl", "====log stats function will be start====");
            if (Boolean.valueOf(uri.getQueryParameter("isRealTime")).booleanValue()) {
                b.c().a();
            } else {
                b.b().a();
            }
        } else if ("adEventDispatch".equals(str)) {
            l.b("AdEventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            com.bytedance.sdk.openadsdk.b.a a10 = com.bytedance.sdk.openadsdk.b.a.a(com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event")));
            if (a10 != null) {
                b.a().a(a10);
            }
        } else if ("logStatusDispatch".equals(str)) {
            Boolean valueOf = Boolean.valueOf(uri.getQueryParameter("isRealTime"));
            c.a a11 = c.a.a(com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event")));
            if (a11 == null) {
                return null;
            }
            if (valueOf.booleanValue()) {
                b.c().a(a11);
            } else {
                b.b().a(a11);
            }
        } else if ("trackUrl".equals(str)) {
            try {
                String[] split = com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : split) {
                        String b10 = com.bytedance.sdk.openadsdk.multipro.c.b(str2);
                        if (!TextUtils.isEmpty(b10)) {
                            arrayList.add(b10);
                        }
                    }
                    d.a().a(arrayList);
                }
            } catch (Throwable unused) {
            }
        } else if ("trackFailed".equals(str)) {
            d.a().a();
            l.b("AdEventProviderImpl", "track failed: ");
        } else if ("logStatusInit".equals(str)) {
            c.a().a();
        } else if ("logStatusUpload".equals(str)) {
            final String b11 = com.bytedance.sdk.openadsdk.multipro.c.b(uri.getQueryParameter("event"));
            if (!TextUtils.isEmpty(b11)) {
                c.a().a(new com.bytedance.sdk.openadsdk.h.a() { // from class: com.bytedance.sdk.openadsdk.multipro.c.a.1
                    @Override // com.bytedance.sdk.openadsdk.h.a
                    public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                        return C0185a.b(b11);
                    }
                });
            }
        }
        return null;
    }
}
