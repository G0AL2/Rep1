package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: ConfigGetParameterHandler.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a */
    private final Set<BiConsumer<String, e>> f23679a = new HashSet();

    /* renamed from: b */
    private final Executor f23680b;

    /* renamed from: c */
    private final d f23681c;

    /* renamed from: d */
    private final d f23682d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public l(Executor executor, d dVar, d dVar2) {
        this.f23680b = executor;
        this.f23681c = dVar;
        this.f23682d = dVar2;
    }

    public static /* synthetic */ void a(BiConsumer biConsumer, String str, e eVar) {
        biConsumer.accept(str, eVar);
    }

    private void c(final String str, final e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f23679a) {
            for (final BiConsumer<String, e> biConsumer : this.f23679a) {
                this.f23680b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.a(BiConsumer.this, str, eVar);
                    }
                });
            }
        }
    }

    private static e e(d dVar) {
        return dVar.f();
    }

    private static Set<String> f(d dVar) {
        HashSet hashSet = new HashSet();
        e e10 = e(dVar);
        if (e10 == null) {
            return hashSet;
        }
        Iterator<String> keys = e10.d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static String h(d dVar, String str) {
        e e10 = e(dVar);
        if (e10 == null) {
            return null;
        }
        try {
            return e10.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void k(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer<String, e> biConsumer) {
        synchronized (this.f23679a) {
            this.f23679a.add(biConsumer);
        }
    }

    public Map<String, dd.p> d() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(f(this.f23681c));
        hashSet.addAll(f(this.f23682d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, i(str));
        }
        return hashMap;
    }

    public String g(String str) {
        String h10 = h(this.f23681c, str);
        if (h10 != null) {
            c(str, e(this.f23681c));
            return h10;
        }
        String h11 = h(this.f23682d, str);
        if (h11 != null) {
            return h11;
        }
        k(str, "String");
        return "";
    }

    public dd.p i(String str) {
        String h10 = h(this.f23681c, str);
        if (h10 != null) {
            c(str, e(this.f23681c));
            return new q(h10, 2);
        }
        String h11 = h(this.f23682d, str);
        if (h11 != null) {
            return new q(h11, 1);
        }
        k(str, "FirebaseRemoteConfigValue");
        return new q("", 0);
    }
}
