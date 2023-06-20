package com.bytedance.sdk.openadsdk.core.video.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.f;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.y;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.i.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: PlayableCache.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f12808a;

    /* renamed from: b  reason: collision with root package name */
    private String f12809b;

    /* renamed from: c  reason: collision with root package name */
    private Map<n, b> f12810c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d  reason: collision with root package name */
    private Map<String, JSONObject> f12811d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f12812e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private Set<String> f12813f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g  reason: collision with root package name */
    private Handler f12814g = new Handler(Looper.getMainLooper());

    /* compiled from: PlayableCache.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0175a {
        void a(boolean z10);
    }

    /* compiled from: PlayableCache.java */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        long f12827a;

        /* renamed from: b  reason: collision with root package name */
        long f12828b;

        /* renamed from: c  reason: collision with root package name */
        long f12829c;

        /* renamed from: d  reason: collision with root package name */
        long f12830d;

        private b() {
        }

        public long a() {
            return this.f12828b - this.f12827a;
        }

        public long b() {
            return this.f12830d - this.f12829c;
        }

        public b c(long j10) {
            this.f12829c = j10;
            return this;
        }

        public b d(long j10) {
            this.f12830d = j10;
            return this;
        }

        public b a(long j10) {
            this.f12827a = j10;
            return this;
        }

        public b b(long j10) {
            this.f12828b = j10;
            return this;
        }
    }

    private a() {
    }

    private boolean e(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(File file) {
        d(file);
        try {
            h.d().p().a(file);
        } catch (Throwable unused) {
        }
    }

    private void d(File file) {
        try {
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (file.setLastModified(currentTimeMillis)) {
                    return;
                }
                file.renameTo(file);
                if (file.lastModified() < currentTimeMillis) {
                    l.d("PlayableCache", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        if (this.f12812e.get()) {
            return;
        }
        e.a(new g("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.video.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                File[] listFiles;
                try {
                    String c10 = a.this.c();
                    if (!TextUtils.isEmpty(c10)) {
                        File file = new File(c10);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (File file2 : listFiles) {
                                try {
                                    a.this.a(a.this.a(file2), true);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                a.this.f12812e.set(true);
            }
        }, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        File file = new File(d(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static a a() {
        if (f12808a == null) {
            synchronized (a.class) {
                if (f12808a == null) {
                    f12808a = new a();
                }
            }
        }
        return f12808a;
    }

    private boolean b(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    private String d() {
        if (TextUtils.isEmpty(this.f12809b)) {
            try {
                File file = new File(m.a().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f12809b = file.getAbsolutePath();
            } catch (Throwable th) {
                l.e("PlayableCache", "init root path error: " + th);
            }
        }
        return this.f12809b;
    }

    public boolean a(n nVar) {
        if (this.f12812e.get() && nVar != null && nVar.J() != null && nVar.J().B() != null) {
            try {
                String a10 = com.bytedance.sdk.component.utils.e.a(nVar.J().B());
                if (this.f12811d.get(a10) == null) {
                    return false;
                }
                return e(new File(c(), a10));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(File file, boolean z10) {
        byte[] d10;
        String a10;
        try {
            if (!b(file) || (d10 = f.d(file)) == null || d10.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                a10 = com.bytedance.sdk.component.utils.a.b(new String(d10));
            } else {
                a10 = com.bytedance.sdk.component.c.a.a(new String(d10), com.bytedance.sdk.openadsdk.core.a.a());
            }
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a10);
            if (z10 && jSONObject.length() > 0) {
                this.f12811d.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File a(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return b(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public WebResourceResponse a(String str, String str2, String str3) {
        try {
        } catch (Throwable th) {
            l.c("PlayableCache", "playable intercept error: ", th);
        }
        if (!this.f12812e.get() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            if (str3.startsWith("http") && str3.contains("?")) {
                str3 = str3.split("\\?")[0];
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
            }
        } catch (Throwable unused) {
        }
        String a10 = com.bytedance.sdk.component.utils.n.a(m.a(), str3);
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        String a11 = com.bytedance.sdk.component.utils.e.a(str);
        if (TextUtils.isEmpty(a11)) {
            return null;
        }
        File file = new File(c(), a11);
        if (e(file)) {
            String a12 = a(str2);
            if (TextUtils.isEmpty(a12)) {
                return null;
            }
            String replace = str3.replace(a12, "");
            if (TextUtils.isEmpty(replace)) {
                return null;
            }
            File file2 = new File(file, replace);
            if (a(a11, replace, file2) && file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                return new WebResourceResponse(a10, "utf-8", new FileInputStream(file2));
            }
        }
        return null;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            if (split[0] != null && split[0].endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            if (split[0] != null && split[0].endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean a(String str, String str2, File file) {
        JSONObject jSONObject;
        String optString;
        return (file == null || !file.exists() || (jSONObject = this.f12811d.get(str)) == null || (optString = jSONObject.optString(str2)) == null || !optString.equalsIgnoreCase(com.bytedance.sdk.component.utils.e.a(file))) ? false : true;
    }

    public void a(final n nVar, final InterfaceC0175a interfaceC0175a) {
        if (nVar != null && nVar.J() != null && !TextUtils.isEmpty(nVar.J().B())) {
            final String B = nVar.J().B();
            if (this.f12813f.contains(B)) {
                return;
            }
            this.f12810c.put(nVar, new b().a(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar);
            String a10 = com.bytedance.sdk.component.utils.e.a(B);
            final File file = new File(c(), a10);
            if (e(file)) {
                com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, -702, (String) null);
                d(file);
                this.f12810c.remove(nVar);
                a(interfaceC0175a, true);
                return;
            }
            try {
                f.c(file);
            } catch (Throwable unused) {
            }
            this.f12813f.add(B);
            String d10 = d();
            File file2 = new File(d10, a10 + ".zip");
            com.bytedance.sdk.component.e.b.a d11 = d.a().b().d();
            d11.a(B);
            d11.a(file2.getParent(), file2.getName());
            d11.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.video.b.a.2
                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, final com.bytedance.sdk.component.e.b bVar) {
                    a.this.f12813f.remove(B);
                    final b bVar2 = (b) a.this.f12810c.remove(nVar);
                    if (bVar2 != null) {
                        bVar2.b(System.currentTimeMillis());
                    }
                    if (bVar.f() && bVar.e() != null && bVar.e().exists()) {
                        l.c("PlayableCache", "onResponse: Playable zip download success");
                        e.a(new g("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.video.b.a.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                long j10;
                                long j11;
                                boolean z10 = true;
                                try {
                                    b bVar3 = bVar2;
                                    if (bVar3 != null) {
                                        bVar3.c(System.currentTimeMillis());
                                    }
                                    y.a(bVar.e().getAbsolutePath(), a.this.c());
                                    b bVar4 = bVar2;
                                    if (bVar4 != null) {
                                        bVar4.d(System.currentTimeMillis());
                                    }
                                    b bVar5 = bVar2;
                                    if (bVar5 != null) {
                                        long a11 = bVar5.a();
                                        j10 = bVar2.b();
                                        j11 = a11;
                                    } else {
                                        j10 = 0;
                                        j11 = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, j11, j10);
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    a.this.c(file);
                                    try {
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        a.this.a(a.this.a(file), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    l.c("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, -704, th.getMessage());
                                    z10 = false;
                                }
                                try {
                                    bVar.e().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                a.this.a(interfaceC0175a, z10);
                            }
                        }, 5);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, bVar.a() != 0 ? bVar.a() : -700, (String) null);
                    l.c("PlayableCache", "onResponse: Playable zip download fail");
                    a.this.a(interfaceC0175a, false);
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    a.this.f12813f.remove(B);
                    a.this.f12810c.remove(nVar);
                    com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, -700, iOException.getMessage());
                    a.this.a(interfaceC0175a, false);
                    l.c("PlayableCache", "onFailure: Playable zip download fail");
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.b.b.a(m.a(), nVar, -701, (String) null);
        a(interfaceC0175a, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final InterfaceC0175a interfaceC0175a, final boolean z10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (interfaceC0175a != null) {
                interfaceC0175a.a(z10);
            }
        } else if (interfaceC0175a != null) {
            this.f12814g.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.b.a.3
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC0175a interfaceC0175a2 = interfaceC0175a;
                    if (interfaceC0175a2 != null) {
                        interfaceC0175a2.a(z10);
                    }
                }
            });
        }
    }
}
