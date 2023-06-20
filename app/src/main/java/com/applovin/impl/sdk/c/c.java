package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected final m f8226a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f8227b;

    /* renamed from: c  reason: collision with root package name */
    protected final SharedPreferences f8228c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f8229d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Object f8230e = new Object();

    public c(m mVar) {
        this.f8226a = mVar;
        Context L = mVar.L();
        this.f8227b = L;
        this.f8228c = L.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        b();
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    private String e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f8226a.z()) + ".";
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f8230e) {
            Iterator<b<?>> it = b.c().iterator();
            while (it.hasNext()) {
                b<T> bVar2 = (b<T>) it.next();
                if (bVar2.a().equals(str)) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    public <T> T a(b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f8230e) {
                Object obj = this.f8229d.get(bVar.a());
                if (obj == null) {
                    return bVar.b();
                }
                return bVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public void a() {
        String e10 = e();
        synchronized (this.f8230e) {
            SharedPreferences.Editor edit = this.f8228c.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.f8229d.get(bVar.a());
                if (obj != null) {
                    this.f8226a.a(e10 + bVar.a(), (String) obj, edit);
                }
            }
            edit.apply();
        }
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.f8230e) {
            this.f8229d.put(bVar.a(), obj);
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f8230e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> a10 = a(next, (b) null);
                        if (a10 != null) {
                            this.f8229d.put(a10.a(), a(next, jSONObject, a10.b()));
                            if (a10 == b.er) {
                                this.f8229d.put(b.es.a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e10) {
                        if (v.a()) {
                            this.f8226a.A().b("SettingsManager", "Unable to parse JSON settingsValues array", e10);
                        }
                    }
                }
            }
        }
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public void b() {
        String e10 = e();
        synchronized (this.f8230e) {
            for (b<?> bVar : b.c()) {
                try {
                    Object a10 = this.f8226a.a(e10 + bVar.a(), null, bVar.b().getClass(), this.f8228c);
                    if (a10 != null) {
                        this.f8229d.put(bVar.a(), a10);
                    }
                } catch (Exception e11) {
                    if (v.a()) {
                        v A = this.f8226a.A();
                        A.b("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e11);
                    }
                }
            }
        }
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String str : b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(str));
        }
        return arrayList;
    }

    public void c() {
        synchronized (this.f8230e) {
            this.f8229d.clear();
        }
        this.f8226a.a(this.f8228c);
    }

    public boolean d() {
        return this.f8226a.p().isVerboseLoggingEnabled() || ((Boolean) a(b.f8193ab)).booleanValue();
    }
}
