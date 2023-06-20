package com.google.android.ads.mediationtestsuite.utils;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkAdapterDataStore;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q2.p;
import q2.u;
import r7.f;

/* compiled from: DataStore.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, ConfigurationItem> f20918a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Integer, NetworkConfig> f20919b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<p7.b> f20920c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<p7.c> f20921d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private static NetworkAdapterDataStore f20922e;

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f20923f;

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f20924g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f20925h;

    /* renamed from: i  reason: collision with root package name */
    private static String f20926i;

    /* renamed from: j  reason: collision with root package name */
    private static Context f20927j;

    /* compiled from: DataStore.java */
    /* loaded from: classes2.dex */
    class a implements p.b<ConfigResponse> {
        a() {
        }

        @Override // q2.p.b
        /* renamed from: b */
        public void a(ConfigResponse configResponse) {
            e.f(new ArrayList(configResponse.a()));
            e.s();
        }
    }

    /* compiled from: DataStore.java */
    /* loaded from: classes2.dex */
    class b implements p.a {
        b() {
        }

        @Override // q2.p.a
        public void a(u uVar) {
            Log.d("gma_test", uVar.toString());
            Boolean unused = e.f20925h = Boolean.FALSE;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f20923f = bool;
        f20924g = bool;
        f20925h = bool;
    }

    private static void c(NetworkConfig networkConfig) {
        f20919b.put(Integer.valueOf(networkConfig.m()), networkConfig);
    }

    public static void d(p7.b bVar) {
        f20920c.add(bVar);
    }

    public static void e(p7.c cVar) {
        f20921d.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(List<ConfigurationItem> list) {
        for (ConfigurationItem configurationItem : list) {
            f20918a.put(configurationItem.e(), configurationItem);
            for (NetworkConfig networkConfig : configurationItem.h()) {
                c(networkConfig);
            }
        }
    }

    public static void g(ConfigurationItem configurationItem) {
        s();
    }

    public static void h() throws IOException {
        if (!f20923f.booleanValue()) {
            Log.e("gma_test", "Must initialize data store before downloading ad units");
        } else if (f20925h.booleanValue()) {
        } else {
            f20925h = Boolean.TRUE;
            g.h(new a(), new b());
        }
    }

    public static String i() {
        return f20926i;
    }

    public static ConfigurationItem j(String str) {
        return f20918a.get(str);
    }

    public static Context k() {
        if (f20927j == null) {
            Log.e("gma_test", "Context is null, please ensure to initialize the DataStore first");
        }
        return f20927j;
    }

    public static boolean l() {
        return f20924g.booleanValue();
    }

    public static s7.g m() {
        return k.d().h(f20918a.values());
    }

    public static NetworkAdapterDataStore n() {
        return f20922e;
    }

    public static NetworkConfig o(int i10) {
        return f20919b.get(Integer.valueOf(i10));
    }

    public static s7.e p() {
        return new s7.e(new ArrayList(f20918a.values()), f.a.SEARCH, com.google.android.ads.mediationtestsuite.g.f20890w0);
    }

    public static boolean q(Context context, String str) {
        f20927j = context.getApplicationContext();
        c.i(context);
        if (str == null) {
            f20926i = c.g();
        } else {
            f20926i = str;
        }
        if (i() == null) {
            Log.e("gma_test", "The Application's app ID doesn't look valid. Are you sure it's correct?");
            return false;
        }
        try {
            f20922e = g.f(context);
        } catch (IOException e10) {
            Log.e("gma_test", "Could not retrieve adapter information", e10);
        }
        f20923f = Boolean.TRUE;
        return true;
    }

    public static void r(NetworkConfig networkConfig) {
        t(networkConfig);
    }

    public static void s() {
        for (p7.b bVar : f20920c) {
            bVar.a();
        }
    }

    public static void t(NetworkConfig networkConfig) {
        for (p7.c cVar : f20921d) {
            cVar.a(networkConfig);
        }
    }

    public static void u(p7.b bVar) {
        f20920c.remove(bVar);
    }

    public static void v(p7.c cVar) {
        f20921d.remove(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w() {
        x();
        Boolean bool = Boolean.FALSE;
        f20923f = bool;
        f20924g = bool;
        f20925h = bool;
        f20926i = null;
        f20927j = null;
    }

    private static void x() {
        f20918a.clear();
        f20919b.clear();
    }

    public static void y(boolean z10) {
        f20924g = Boolean.valueOf(z10);
    }
}
