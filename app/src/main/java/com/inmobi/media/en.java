package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.inmobi.media.fq;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

/* compiled from: OmidServiceJsFetcher.java */
/* loaded from: classes3.dex */
public class en {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25269a = "en";

    static /* synthetic */ boolean b(fq.h hVar) {
        Context c10 = ho.c();
        if (c10 != null) {
            return (System.currentTimeMillis() / 1000) - new hx(c10, "omid_js_store").a() > hVar.expiry;
        }
        return false;
    }

    public static void a(final fq.h hVar) {
        String str = hVar.url;
        final int i10 = hVar.maxRetries;
        final int i11 = hVar.retryInterval;
        if (str == null) {
            return;
        }
        final gx gxVar = new gx("GET", str);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip");
        gxVar.f25625t = false;
        gxVar.f25620o = false;
        gxVar.a(hashMap);
        new Thread(new Runnable() { // from class: com.inmobi.media.en.1
            @Override // java.lang.Runnable
            public final void run() {
                if (en.b(fq.h.this)) {
                    int i12 = 0;
                    while (i12 <= i10) {
                        String unused = en.f25269a;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        gy a10 = new ha(gxVar).a();
                        try {
                            iv.a().a(gxVar.g());
                            iv.a().b(a10.d());
                            iv.a().c(SystemClock.elapsedRealtime() - elapsedRealtime);
                        } catch (Exception unused2) {
                            String unused3 = en.f25269a;
                        }
                        Context c10 = ho.c();
                        if (a10.a()) {
                            String unused4 = en.f25269a;
                            i12++;
                            if (i12 > i10) {
                                return;
                            }
                            try {
                                Thread.sleep(i11 * 1000);
                            } catch (InterruptedException unused5) {
                                String unused6 = en.f25269a;
                            }
                        } else if (c10 != null) {
                            hx hxVar = new hx(c10, "omid_js_store");
                            List<String> list = a10.f25629c.get("Content-Encoding");
                            if (list != null && list.get(0).equals("gzip")) {
                                String unused7 = en.f25269a;
                                byte[] a11 = hv.a(a10.c());
                                if (a11 != null) {
                                    try {
                                        hxVar.b("omid_js_string", new String(a11, "UTF-8"));
                                        String unused8 = en.f25269a;
                                        return;
                                    } catch (UnsupportedEncodingException unused9) {
                                        String unused10 = en.f25269a;
                                        String unused11 = en.f25269a;
                                        return;
                                    }
                                }
                                return;
                            }
                            hxVar.b("omid_js_string", a10.b());
                            String unused12 = en.f25269a;
                            return;
                        }
                    }
                }
            }
        }).start();
    }
}
