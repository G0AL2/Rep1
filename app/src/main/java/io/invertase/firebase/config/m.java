package io.invertase.firebase.config;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.b;
import dd.n;
import dd.p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: UniversalFirebaseConfigModule.java */
/* loaded from: classes3.dex */
public class m extends io.invertase.firebase.common.c {
    public m(Context context, String str) {
        super(context, str);
    }

    public static /* synthetic */ Void f(m mVar, String str, ob.e eVar) {
        return mVar.s(str, eVar);
    }

    public static /* synthetic */ Void g(ob.e eVar, long j10) {
        return q(eVar, j10);
    }

    public static /* synthetic */ Void h(Bundle bundle, ob.e eVar) {
        return r(bundle, eVar);
    }

    private Bundle j(p pVar) {
        Bundle bundle = new Bundle(2);
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, pVar.asString());
        int source = pVar.getSource();
        if (source == 1) {
            bundle.putString("source", "default");
        } else if (source != 2) {
            bundle.putString("source", "static");
        } else {
            bundle.putString("source", "remote");
        }
        return bundle;
    }

    private int p(String str) {
        return a().getResources().getIdentifier(str, "xml", a().getPackageName());
    }

    public static /* synthetic */ Void q(ob.e eVar, long j10) throws Exception {
        com.google.firebase.remoteconfig.a r10 = com.google.firebase.remoteconfig.a.r(eVar);
        Tasks.await(j10 == -1 ? r10.l() : r10.m(j10));
        return null;
    }

    public static /* synthetic */ Void r(Bundle bundle, ob.e eVar) throws Exception {
        b.C0309b c0309b = new b.C0309b();
        if (bundle.containsKey("minimumFetchInterval")) {
            c0309b.e((long) bundle.getDouble("minimumFetchInterval"));
        }
        if (bundle.containsKey("fetchTimeout")) {
            c0309b.d((long) bundle.getDouble("fetchTimeout"));
        }
        com.google.firebase.remoteconfig.a.r(eVar).E(c0309b.c());
        return null;
    }

    public /* synthetic */ Void s(String str, ob.e eVar) throws Exception {
        XmlResourceParser xmlResourceParser;
        int p10 = p(str);
        try {
            xmlResourceParser = a().getResources().getXml(p10);
        } catch (Resources.NotFoundException unused) {
            xmlResourceParser = null;
        }
        if (xmlResourceParser != null) {
            Tasks.await(com.google.firebase.remoteconfig.a.r(eVar).F(p10));
            return null;
        }
        throw new Exception("resource_not_found");
    }

    private String t(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? i10 != 2 ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : "throttled" : "failure" : "no_fetch_yet" : "success";
    }

    public Task<Boolean> i(String str) {
        return com.google.firebase.remoteconfig.a.r(ob.e.o(str)).j();
    }

    public Task<n> k(String str) {
        Task<n> k10 = com.google.firebase.remoteconfig.a.r(ob.e.o(str)).k();
        try {
            Tasks.await(m(str));
        } catch (Exception unused) {
        }
        return k10;
    }

    public Task<Void> l(String str, final long j10) {
        final ob.e o10 = ob.e.o(str);
        return Tasks.call(d(), new Callable() { // from class: io.invertase.firebase.config.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.g(ob.e.this, j10);
            }
        });
    }

    public Task<Boolean> m(String str) {
        return com.google.firebase.remoteconfig.a.r(ob.e.o(str)).n();
    }

    Map<String, Object> n(String str) {
        Map<String, p> o10 = com.google.firebase.remoteconfig.a.r(ob.e.o(str)).o();
        HashMap hashMap = new HashMap(o10.size());
        for (Map.Entry<String, p> entry : o10.entrySet()) {
            hashMap.put(entry.getKey(), j(entry.getValue()));
        }
        return hashMap;
    }

    public Map<String, Object> o(String str) {
        HashMap hashMap = new HashMap();
        n p10 = com.google.firebase.remoteconfig.a.r(ob.e.o(str)).p();
        com.google.firebase.remoteconfig.b b10 = p10.b();
        hashMap.put("values", n(str));
        hashMap.put("lastFetchTime", Long.valueOf(p10.a()));
        hashMap.put("lastFetchStatus", t(p10.c()));
        hashMap.put("minimumFetchInterval", Long.valueOf(b10.b()));
        hashMap.put("fetchTimeout", Long.valueOf(b10.a()));
        return hashMap;
    }

    public Task<Void> u(String str) {
        return com.google.firebase.remoteconfig.a.r(ob.e.o(str)).D();
    }

    public Task<Void> v(String str, final Bundle bundle) {
        final ob.e o10 = ob.e.o(str);
        return Tasks.call(d(), new Callable() { // from class: io.invertase.firebase.config.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.h(bundle, o10);
            }
        });
    }

    public Task<Void> w(String str, HashMap<String, Object> hashMap) {
        return com.google.firebase.remoteconfig.a.r(ob.e.o(str)).G(hashMap);
    }

    public Task<Void> x(String str, final String str2) {
        final ob.e o10 = ob.e.o(str);
        return Tasks.call(d(), new Callable() { // from class: io.invertase.firebase.config.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.f(m.this, str2, o10);
            }
        });
    }
}
