package com.fyber.inneractive.sdk.player.cache;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n implements c.e {

    /* renamed from: f  reason: collision with root package name */
    public static final n f17852f = new n();

    /* renamed from: a  reason: collision with root package name */
    public Context f17853a;

    /* renamed from: b  reason: collision with root package name */
    public c f17854b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17855c = false;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f17856d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f17857e = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j10;
            File a10 = n.a(n.this.f17853a, "fyb.vamp.vid.cache");
            if (a10 != null) {
                try {
                    IAlog.a("VideoCache opening the cache in directory - %s", a10);
                    n.this.f17854b = c.a(a10, 0, 1, 52428800L);
                    c cVar = n.this.f17854b;
                    cVar.getClass();
                    IAlog.d("DiskLruCache delete cache", new Object[0]);
                    cVar.close();
                    m.a(cVar.f17761a);
                    n.this.f17854b = c.a(a10, 0, 1, 52428800L);
                    Object[] objArr = new Object[2];
                    objArr[0] = a10;
                    c cVar2 = n.this.f17854b;
                    synchronized (cVar2) {
                        j10 = cVar2.f17768h;
                    }
                    objArr[1] = Long.valueOf(j10);
                    IAlog.a("VideoCache opened the cache in directory - %s current size is %d", objArr);
                    n nVar = n.this;
                    nVar.f17854b.f17772l = nVar;
                    nVar.f17855c = true;
                    n.this.getClass();
                } catch (Throwable th) {
                    r.a("Failed to open cache directory", th.getMessage(), null, null);
                    IAlog.a("Failed to open cache directory", th, new Object[0]);
                }
            }
        }
    }

    public static File a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean z10 = true;
        if (com.fyber.inneractive.sdk.util.l.f20301a != null && com.fyber.inneractive.sdk.util.l.b("android.permission.WRITE_EXTERNAL_STORAGE") && "mounted".equals(com.fyber.inneractive.sdk.util.l.b())) {
            String b10 = com.fyber.inneractive.sdk.util.l.b();
            if ("mounted".equals(b10) || "mounted_ro".equals(b10)) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null && externalCacheDir.getFreeSpace() > 52428800) {
                    return new File(context.getExternalCacheDir(), str);
                }
            }
        }
        File cacheDir = context.getCacheDir();
        if ((cacheDir == null || cacheDir.getFreeSpace() <= 52428800) ? false : false) {
            return new File(context.getCacheDir(), str);
        }
        return null;
    }

    public boolean a() {
        return this.f17855c && com.fyber.inneractive.sdk.util.r.a();
    }

    public boolean a(c cVar, String str) {
        for (String str2 : this.f17856d) {
            if (str2.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }
}
