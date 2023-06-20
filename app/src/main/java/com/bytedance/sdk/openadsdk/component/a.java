package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.t;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.e.r;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.utils.g;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import n3.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdCacheManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f11303a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.a.b f11304b;

    /* renamed from: c  reason: collision with root package name */
    private final n<com.bytedance.sdk.openadsdk.b.a> f11305c;

    /* renamed from: d  reason: collision with root package name */
    private Context f11306d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TTAppOpenAdCacheManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0164a extends g {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.sdk.openadsdk.component.d.a f11334b;

        public C0164a(com.bytedance.sdk.openadsdk.component.d.a aVar) {
            super("App Open Ad Write Cache");
            this.f11334b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String jSONObject = com.bytedance.sdk.component.utils.a.a(this.f11334b.b().ar()).toString();
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad_materialMeta", "material" + this.f11334b.a(), jSONObject);
                } else {
                    SharedPreferences.Editor edit = a.this.f11306d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
                    edit.putString("material" + this.f11334b.a(), jSONObject).apply();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void a(com.bytedance.sdk.openadsdk.i.a.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i10, String str);
    }

    /* compiled from: TTAppOpenAdCacheManager.java */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(Bitmap bitmap);
    }

    private a(Context context) {
        if (context != null) {
            this.f11306d = context.getApplicationContext();
        } else {
            this.f11306d = m.a();
        }
        this.f11304b = new com.bytedance.sdk.openadsdk.a.b(10, 8, true);
        this.f11305c = m.f();
    }

    public boolean b(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "video_has_cached" + i10, false);
        }
        SharedPreferences sharedPreferences = this.f11306d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("video_has_cached" + i10, false);
    }

    public void c(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "image_has_cached" + i10, Boolean.TRUE);
            return;
        }
        SharedPreferences.Editor edit = this.f11306d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("image_has_cached" + i10, true).apply();
    }

    public boolean d(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            return com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "image_has_cached" + i10, false);
        }
        SharedPreferences sharedPreferences = this.f11306d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("image_has_cached" + i10, false);
    }

    public boolean e(int i10) {
        long j10;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            j10 = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "material_expiration_time" + i10, -1L);
        } else {
            SharedPreferences sharedPreferences = this.f11306d.getSharedPreferences("tt_openad", 0);
            j10 = sharedPreferences.getLong("material_expiration_time" + i10, -1L);
        }
        if (System.currentTimeMillis() / 1000 >= j10) {
            if (j10 != -1) {
                com.bytedance.sdk.openadsdk.core.e.n f10 = f(i10);
                if (f10 != null) {
                    com.bytedance.sdk.openadsdk.component.c.a.a(f10);
                }
                g(i10);
            }
            return false;
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.e.n f(int i10) {
        String string;
        String str;
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            string = com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad_materialMeta", "material" + i10, (String) null);
        } else {
            string = this.f11306d.getSharedPreferences("tt_openad_materialMeta", 0).getString("material" + i10, null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                jSONObject.optInt("cypher", -1);
                str = com.bytedance.sdk.component.utils.a.b(jSONObject.optString("message"));
            } catch (JSONException e10) {
                e10.printStackTrace();
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    com.bytedance.sdk.openadsdk.core.e.n a10 = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(str));
                    if (a10 != null) {
                        return a10;
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return null;
    }

    public void g(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad_materialMeta", "material" + i10);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "material_expiration_time" + i10);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "video_has_cached" + i10);
            com.bytedance.sdk.openadsdk.multipro.d.a.b("tt_openad", "image_has_cached" + i10);
            return;
        }
        SharedPreferences.Editor edit = this.f11306d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
        edit.remove("material" + i10).apply();
        SharedPreferences.Editor edit2 = this.f11306d.getSharedPreferences("tt_openad", 0).edit();
        SharedPreferences.Editor remove = edit2.remove("material_expiration_time" + i10);
        SharedPreferences.Editor remove2 = remove.remove("video_has_cached" + i10);
        remove2.remove("image_has_cached" + i10).apply();
    }

    public String h(int i10) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? "openad_image_cache/" : "/openad_image_cache/";
    }

    public static a a(Context context) {
        if (f11303a == null) {
            synchronized (a.class) {
                if (f11303a == null) {
                    f11303a = new a(context);
                }
            }
        }
        return f11303a;
    }

    private void b(com.bytedance.sdk.openadsdk.component.d.a aVar) {
        e.a(new C0164a(aVar), 10, 5);
    }

    public boolean b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null || nVar.P() == null || nVar.P().size() == 0 || TextUtils.isEmpty(nVar.P().get(0).a())) {
            return false;
        }
        k kVar = nVar.P().get(0);
        return a(kVar.a(), kVar.g());
    }

    public void a(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        final r rVar = new r();
        rVar.a(currentTimeMillis);
        o oVar = new o();
        oVar.f12205g = currentTimeMillis;
        oVar.f12207i = rVar;
        oVar.f12202d = 2;
        this.f11305c.a(adSlot, oVar, 3, new n.a() { // from class: com.bytedance.sdk.openadsdk.component.a.1
            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(int i10, String str) {
                l.b("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
            }

            @Override // com.bytedance.sdk.openadsdk.core.n.a
            public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                l.b("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
                if (aVar != null && aVar.b() != null && aVar.b().size() != 0) {
                    com.bytedance.sdk.openadsdk.core.e.n nVar = aVar.b().get(0);
                    if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                        a.this.a(nVar, adSlot, rVar);
                        return;
                    } else {
                        a.this.a(nVar, rVar);
                        return;
                    }
                }
                l.b("TTAppOpenAdCacheManager", "material is null");
                bVar.a(-3);
                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, final r rVar) {
        final int f10 = u.f(nVar);
        a(nVar, adSlot, rVar, new c() { // from class: com.bytedance.sdk.openadsdk.component.a.2
            @Override // com.bytedance.sdk.openadsdk.component.a.c
            public void a() {
                com.bytedance.sdk.openadsdk.component.d.a aVar = new com.bytedance.sdk.openadsdk.component.d.a(f10, nVar);
                a.this.a(aVar);
                com.bytedance.sdk.openadsdk.component.c.a.a(aVar.b(), 1, rVar);
            }

            @Override // com.bytedance.sdk.openadsdk.component.a.c
            public void a(int i10, String str) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, final r rVar) {
        final int f10 = u.f(nVar);
        a(nVar, rVar, new b() { // from class: com.bytedance.sdk.openadsdk.component.a.3
            @Override // com.bytedance.sdk.openadsdk.component.a.b
            public void a() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.a.b
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar) {
                com.bytedance.sdk.openadsdk.component.d.a aVar = new com.bytedance.sdk.openadsdk.component.d.a(f10, nVar);
                a.this.a(aVar);
                com.bytedance.sdk.openadsdk.component.c.a.a(aVar.b(), 1, rVar);
            }
        });
    }

    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, AdSlot adSlot, final r rVar, final c cVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int f10 = u.f(nVar);
        l3.b J = nVar.J();
        String y10 = J.y();
        String C = J.C();
        if (TextUtils.isEmpty(C)) {
            C = com.bytedance.sdk.component.utils.e.a(y10);
        }
        final File a10 = com.bytedance.sdk.openadsdk.component.f.a.a(C, f10);
        if (a10.exists()) {
            l.b("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            com.bytedance.sdk.openadsdk.component.f.a.a(a10);
            a(f10);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar != null) {
                rVar.c(currentTimeMillis2);
                rVar.a(1);
            }
            cVar.a();
            a(nVar, (d) null);
        } else if (m.h().m(String.valueOf(f10)) && !com.bytedance.sdk.component.utils.o.d(m.a())) {
            cVar.a(100, "OnlyWifi");
        } else {
            l3.c a11 = com.bytedance.sdk.openadsdk.core.e.n.a(a10.getParent(), nVar);
            a11.e("material_meta", nVar);
            a11.e("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.video.d.a.a(a11, new a.InterfaceC0454a() { // from class: com.bytedance.sdk.openadsdk.component.a.4
                @Override // n3.a.InterfaceC0454a
                public void a(l3.c cVar2, int i10) {
                    l.b("TTAppOpenAdCacheManager", "Video file caching success");
                    a.this.a(a10);
                    a.this.a(f10);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    com.bytedance.sdk.openadsdk.component.c.a.b(nVar, currentTimeMillis3, true);
                    r rVar2 = rVar;
                    if (rVar2 != null) {
                        rVar2.c(currentTimeMillis3);
                        rVar.a(2);
                    }
                    cVar.a();
                    a.a(nVar, (d) null);
                }

                @Override // n3.a.InterfaceC0454a
                public void b(l3.c cVar2, int i10) {
                }

                @Override // n3.a.InterfaceC0454a
                public void a(l3.c cVar2, int i10, String str) {
                    l.b("TTAppOpenAdCacheManager", "Video file caching failed");
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    com.bytedance.sdk.openadsdk.component.c.a.b(nVar, currentTimeMillis3, false);
                    r rVar2 = rVar;
                    if (rVar2 != null) {
                        rVar2.c(currentTimeMillis3);
                    }
                    cVar.a(i10, str);
                    try {
                        if (a10.exists() && a10.isFile()) {
                            f.c(a10);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            if (Build.VERSION.SDK_INT < 23) {
                a(new File(i3.b.a().getCacheDir(), "proxy_cache"));
                a(f10);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                com.bytedance.sdk.openadsdk.component.c.a.b(nVar, currentTimeMillis3, true);
                if (rVar != null) {
                    rVar.c(currentTimeMillis3);
                    rVar.a(2);
                }
                cVar.a();
                a(nVar, (d) null);
            }
        }
    }

    public void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, final r rVar, final b bVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        final int f10 = u.f(nVar);
        k kVar = nVar.P().get(0);
        String g10 = kVar.g();
        String a10 = kVar.a();
        int b10 = kVar.b();
        int c10 = kVar.c();
        File b11 = com.bytedance.sdk.openadsdk.component.f.a.b(TextUtils.isEmpty(g10) ? com.bytedance.sdk.component.utils.e.a(a10) : g10, f10);
        if (a(a10, g10)) {
            l.b("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            c(f10);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar != null) {
                rVar.c(currentTimeMillis2);
                rVar.a(1);
            }
            bVar.a(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.g.a(new com.bytedance.sdk.openadsdk.i.a(a10, kVar.g()), b10, c10, new g.a() { // from class: com.bytedance.sdk.openadsdk.component.a.5
            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void a(com.bytedance.sdk.openadsdk.i.a.b bVar2) {
                if (bVar2.c()) {
                    l.b("TTAppOpenAdCacheManager", "Image loaded successfully");
                    a.this.c(f10);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    com.bytedance.sdk.openadsdk.component.c.a.a(nVar, currentTimeMillis3, true);
                    r rVar2 = rVar;
                    if (rVar2 != null) {
                        rVar2.c(currentTimeMillis3);
                        rVar.a(2);
                    }
                    bVar.a(bVar2);
                    return;
                }
                com.bytedance.sdk.openadsdk.component.c.a.a(nVar, System.currentTimeMillis() - currentTimeMillis, false);
                bVar.a();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void b() {
                l.b("TTAppOpenAdCacheManager", "Image caching success");
            }

            @Override // com.bytedance.sdk.openadsdk.utils.g.a
            public void a() {
                l.b("TTAppOpenAdCacheManager", "Image loading failed");
                com.bytedance.sdk.openadsdk.component.c.a.a(nVar, System.currentTimeMillis() - currentTimeMillis, false);
                bVar.a();
            }
        }, b11.getParent());
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, final d dVar) {
        com.bytedance.sdk.openadsdk.d.a.a(nVar.J().w()).a(t.BITMAP).a(new com.bytedance.sdk.component.d.n<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.a.6
            @Override // com.bytedance.sdk.component.d.n
            public void a(j<Bitmap> jVar) {
                if (jVar != null && jVar.b() != null) {
                    d dVar2 = d.this;
                    if (dVar2 != null) {
                        dVar2.a(jVar.b());
                        return;
                    }
                    return;
                }
                d dVar3 = d.this;
                if (dVar3 != null) {
                    dVar3.a();
                }
            }

            @Override // com.bytedance.sdk.component.d.n
            public void a(int i10, String str, Throwable th) {
                d dVar2 = d.this;
                if (dVar2 != null) {
                    dVar2.a();
                }
            }
        });
    }

    public void a(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "video_has_cached" + i10, Boolean.TRUE);
            return;
        }
        SharedPreferences.Editor edit = this.f11306d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("video_has_cached" + i10, true).apply();
    }

    public void a(com.bytedance.sdk.openadsdk.component.d.a aVar) {
        if (aVar.b() == null || aVar.a() == 0) {
            return;
        }
        long ag = aVar.b().ag();
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad", "material_expiration_time" + aVar.a(), Long.valueOf(ag));
        } else {
            SharedPreferences.Editor edit = this.f11306d.getSharedPreferences("tt_openad", 0).edit();
            edit.putLong("material_expiration_time" + aVar.a(), ag).apply();
        }
        b(aVar);
    }

    public String a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar != null && nVar.J() != null && !TextUtils.isEmpty(nVar.J().y())) {
            String y10 = nVar.J().y();
            String C = nVar.J().C();
            String valueOf = String.valueOf(u.f(nVar));
            if (TextUtils.isEmpty(C)) {
                C = com.bytedance.sdk.component.utils.e.a(y10);
            }
            File a10 = com.bytedance.sdk.openadsdk.component.f.a.a(this.f11306d, a(valueOf), C);
            if (a10.exists() && a10.isFile()) {
                return a10.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean a(String str, String str2) {
        boolean z10;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.e.a(str);
            }
            File b10 = com.bytedance.sdk.openadsdk.component.f.a.b(str2, 0);
            InputStream a10 = com.bytedance.sdk.openadsdk.d.a.a(str, str2);
            if (a10 != null) {
                try {
                    a10.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (com.bytedance.sdk.openadsdk.d.a.a(str, str2, b10.getParent())) {
                    return true;
                }
                if (new File(b10.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e11) {
            l.e("TTAppOpenAdCacheManager", e11.getMessage());
            return false;
        }
    }

    public void a(File file) {
        try {
            this.f11304b.a(file);
        } catch (IOException e10) {
            l.e("TTAppOpenAdCacheManager", "trimFileCache IOException:" + e10.toString());
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0034 -> B:27:0x0034). Please submit an issue!!! */
    public void a() {
        File[] listFiles;
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad_materialMeta");
                com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_openad");
            } else {
                this.f11306d.getSharedPreferences("tt_openad_materialMeta", 0).edit().clear().apply();
                this.f11306d.getSharedPreferences("tt_openad", 0).edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.f11306d.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.a.7
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file != null) {
                        String name = file.getName();
                        return name.contains("openad_image_cache") || name.contains("openad_video_cache");
                    }
                    return false;
                }
            })) == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                try {
                    f.c(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }

    public String a(String str) {
        return com.bytedance.sdk.openadsdk.multipro.b.c() ? "openad_video_cache/" : "/openad_video_cache/";
    }
}
