package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private final m f7787b;

    /* renamed from: c  reason: collision with root package name */
    private final v f7788c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f7786a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d  reason: collision with root package name */
    private final Object f7789d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f7790e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f7791f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f7792g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Set<a> f7793h = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f7794a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7795b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdFormat f7796c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f7797d;

        a(String str, String str2, com.applovin.impl.mediation.a.a aVar, m mVar) {
            this.f7794a = str;
            this.f7795b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f7797d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (aVar == null) {
                this.f7796c = null;
                return;
            }
            this.f7796c = aVar.getFormat();
            if (aVar.getFormat() != null) {
                JsonUtils.putString(jSONObject, "format", aVar.getFormat().getLabel());
            }
        }

        JSONObject a() {
            return this.f7797d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7794a.equals(aVar.f7794a) && this.f7795b.equals(aVar.f7795b)) {
                MaxAdFormat maxAdFormat = this.f7796c;
                MaxAdFormat maxAdFormat2 = aVar.f7796c;
                return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f7794a.hashCode() * 31) + this.f7795b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f7796c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f7794a + "', operationTag='" + this.f7795b + "', format=" + this.f7796c + '}';
        }
    }

    public f(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7787b = mVar;
        this.f7788c = mVar.A();
    }

    private g a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls, boolean z10) {
        try {
            return new g(fVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f7787b.Y()), z10, this.f7787b);
        } catch (Throwable th) {
            if (v.a()) {
                v.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
                return null;
            }
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            if (v.a()) {
                v.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(com.applovin.impl.mediation.a.f fVar) {
        return a(fVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(com.applovin.impl.mediation.a.f fVar, boolean z10) {
        Class<? extends MaxAdapter> a10;
        g gVar;
        if (fVar != null) {
            String L = fVar.L();
            String K = fVar.K();
            if (TextUtils.isEmpty(L)) {
                if (v.a()) {
                    v vVar = this.f7788c;
                    vVar.e("MediationAdapterManager", "No adapter name provided for " + K + ", not loading the adapter ");
                }
                return null;
            } else if (TextUtils.isEmpty(K)) {
                if (v.a()) {
                    v vVar2 = this.f7788c;
                    vVar2.e("MediationAdapterManager", "Unable to find default className for '" + L + "'");
                }
                return null;
            } else if (!z10 || (gVar = this.f7786a.get(K)) == null) {
                synchronized (this.f7789d) {
                    if (this.f7791f.contains(K)) {
                        if (v.a()) {
                            v vVar3 = this.f7788c;
                            vVar3.b("MediationAdapterManager", "Not attempting to load " + L + " due to prior errors");
                        }
                        return null;
                    }
                    if (this.f7790e.containsKey(K)) {
                        a10 = this.f7790e.get(K);
                    } else {
                        a10 = a(K);
                        if (a10 == null) {
                            this.f7791f.add(K);
                            return null;
                        }
                    }
                    g a11 = a(fVar, a10, z10);
                    if (a11 == null) {
                        if (v.a()) {
                            v vVar4 = this.f7788c;
                            vVar4.e("MediationAdapterManager", "Failed to load " + L);
                        }
                        this.f7791f.add(K);
                        return null;
                    }
                    if (v.a()) {
                        v vVar5 = this.f7788c;
                        vVar5.b("MediationAdapterManager", "Loaded " + L);
                    }
                    this.f7790e.put(K, a10);
                    if (z10) {
                        this.f7786a.put(fVar.K(), a11);
                    }
                    return a11;
                }
            } else {
                return gVar;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.f7789d) {
            HashSet hashSet = new HashSet(this.f7790e.size());
            for (Class<? extends MaxAdapter> cls : this.f7790e.values()) {
                hashSet.add(cls.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f7792g) {
            if (v.a()) {
                v A = this.f7787b.A();
                A.e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f7793h.add(new a(str, str2, aVar, this.f7787b));
        }
    }

    public Collection<String> b() {
        Set unmodifiableSet;
        synchronized (this.f7789d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f7791f);
        }
        return unmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f7792g) {
            arrayList = new ArrayList(this.f7793h.size());
            for (a aVar : this.f7793h) {
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }
}
