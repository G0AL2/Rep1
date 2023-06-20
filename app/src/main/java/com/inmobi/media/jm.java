package com.inmobi.media;

import com.inmobi.media.ge;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: UnifiedIDNetworkInterface.java */
/* loaded from: classes3.dex */
public final class jm {

    /* renamed from: b  reason: collision with root package name */
    static jo f25878b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25879c = new Object();

    /* renamed from: a  reason: collision with root package name */
    static Set<InMobiUnifiedIdInterface> f25877a = new LinkedHashSet();

    private jm() {
    }

    public static void a() {
        synchronized (f25879c) {
            if (c()) {
                f25878b.b();
            }
        }
        e();
    }

    public static void b() {
        synchronized (f25879c) {
            jo joVar = f25878b;
            if (joVar != null) {
                joVar.b();
                f25878b = null;
            }
            f25877a.clear();
        }
    }

    public static boolean c() {
        boolean z10;
        synchronized (f25879c) {
            jo joVar = f25878b;
            z10 = (joVar == null || joVar.f25633a.get()) ? false : true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d() {
        synchronized (f25879c) {
            f25878b = null;
        }
    }

    private static void e() {
        iw.a();
        ge.c f10 = iw.f();
        synchronized (f25879c) {
            String str = f10.url;
            iw.a();
            f25878b = new jo("POST", str, iw.d(), ho.f(), f10.maxRetries, f10.retryInterval, f10.timeout);
            gt gtVar = new gt(new jn(f25878b, f25877a), f25878b, JSONObject.class);
            hh.a().a("UnifiedIdNetworkCallRequested", new HashMap());
            gtVar.a();
        }
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (inMobiUnifiedIdInterface != null) {
            f25877a.add(inMobiUnifiedIdInterface);
        }
        if (c()) {
            return;
        }
        e();
    }
}
