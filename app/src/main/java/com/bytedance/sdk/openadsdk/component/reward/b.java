package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FullScreenVideoCache.java */
/* loaded from: classes.dex */
public class b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f11531a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11532b;

    /* renamed from: c  reason: collision with root package name */
    private final j f11533c;

    /* renamed from: d  reason: collision with root package name */
    private Map<n, Long> f11534d = Collections.synchronizedMap(new HashMap());

    /* compiled from: FullScreenVideoCache.java */
    /* loaded from: classes.dex */
    interface a<T> {
        void a(boolean z10, T t10);
    }

    private b(Context context) {
        Context a10 = context == null ? m.a() : context.getApplicationContext();
        this.f11532b = a10;
        this.f11533c = new j(a10, "sp_full_screen_video");
    }

    public AdSlot b(String str) {
        return this.f11533c.e(str);
    }

    public n c(String str) {
        n a10;
        long b10 = this.f11533c.b(str);
        boolean c10 = this.f11533c.c(str);
        if (!(System.currentTimeMillis() - b10 < 10500000) || c10) {
            return null;
        }
        try {
            String a11 = this.f11533c.a(str);
            if (TextUtils.isEmpty(a11) || (a10 = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(a11))) == null) {
                return null;
            }
            if (p.i(a10)) {
                return a10;
            }
            l3.b J = a10.J();
            if (J != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    if (TextUtils.isEmpty(a(J.y(), J.C(), a10.aD()))) {
                        return null;
                    }
                }
                return a10;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str) {
        this.f11533c.d(str);
    }

    public void b(AdSlot adSlot) {
        this.f11533c.b(adSlot);
    }

    public void a() {
        File[] listFiles;
        File file;
        File[] listFiles2;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                file = new File(this.f11532b.getDataDir(), "shared_prefs");
            } else {
                file = new File(this.f11532b.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            if (file.exists() && file.isDirectory() && (listFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : listFiles2) {
                    try {
                        String replace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.f11532b.deleteSharedPreferences(replace);
                        } else {
                            this.f11532b.getSharedPreferences(replace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.f.c(file2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.f11532b.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (listFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null || listFiles.length <= 0) {
                return;
            }
            for (File file3 : listFiles) {
                try {
                    com.bytedance.sdk.component.utils.f.c(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public AdSlot b() {
        return this.f11533c.a();
    }

    public void a(AdSlot adSlot, n nVar) {
        a(adSlot);
        if (nVar != null) {
            try {
                this.f11533c.a(adSlot.getCodeId(), nVar.ar().toString());
            } catch (Throwable unused) {
            }
        }
    }

    public void a(AdSlot adSlot) {
        this.f11533c.a(adSlot);
    }

    public static b a(Context context) {
        if (f11531a == null) {
            synchronized (b.class) {
                if (f11531a == null) {
                    f11531a = new b(context);
                }
            }
        }
        return f11531a;
    }

    public String a(n nVar) {
        if (nVar == null || nVar.J() == null || TextUtils.isEmpty(nVar.J().y())) {
            return null;
        }
        return a(nVar.J().y(), nVar.J().C(), nVar.aD());
    }

    public String a(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.component.utils.e.a(str);
        }
        File a10 = a(str2, i10);
        if (a10 == null || !a10.exists() || !a10.isFile() || a10.length() <= 0) {
            return null;
        }
        return a10.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, n nVar, long j10, String str) {
        Long remove = this.f11534d.remove(nVar);
        long elapsedRealtime = remove == null ? 0L : SystemClock.elapsedRealtime() - remove.longValue();
        com.bytedance.sdk.openadsdk.b.e.a(this.f11532b, nVar, "fullscreen_interstitial_ad", z10 ? "load_video_success" : "load_video_error", u.a(z10, nVar, elapsedRealtime, j10, (z10 || str == null) ? null : str));
    }

    public void a(final n nVar, final a<Object> aVar) {
        this.f11534d.put(nVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (nVar != null && nVar.J() != null && !TextUtils.isEmpty(nVar.J().y())) {
            String y10 = nVar.J().y();
            File a10 = a(nVar.J().C(), nVar.aD());
            com.bytedance.sdk.component.e.b.a d10 = com.bytedance.sdk.openadsdk.i.d.a().b().d();
            d10.a(y10);
            d10.a(a10.getParent(), a10.getName());
            d10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.3
                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    if (bVar.f() && bVar.e() != null && bVar.e().exists()) {
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(true, null);
                        }
                        com.bytedance.sdk.component.utils.l.c("FullScreenVideoCache", "onResponse: FullScreenVideo preload success ");
                        b.this.a(true, nVar, bVar.a(), bVar.b());
                        return;
                    }
                    a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.a(false, null);
                    }
                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoCache", "onResponse: FullScreenVideo preload Fail ");
                    b.this.a(false, nVar, bVar.a(), bVar.b());
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(false, null);
                    }
                    com.bytedance.sdk.component.utils.l.c("FullScreenVideoCache", "onFailure: FullScreenVideo preload fail ");
                    b.this.a(false, nVar, -2L, iOException.getMessage());
                }
            });
            return;
        }
        if (aVar != null) {
            aVar.a(false, null);
        }
        a(false, nVar, -1L, null);
    }

    private File a(String str, int i10) {
        return new File(CacheDirFactory.getICacheDir(i10).b(), str);
    }
}
