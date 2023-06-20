package com.google.android.ads.mediationtestsuite.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.android.ads.mediationtestsuite.dataobjects.AdManagerCLDResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnitResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.CLDResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigResponse;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import com.google.android.ads.mediationtestsuite.dataobjects.MediationConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.Network;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkAdapter;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkAdapterDataStore;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.YieldGroup;
import com.google.android.ads.mediationtestsuite.dataobjects.YieldPartner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.jspecify.nullness.Nullable;
import q2.p;
import r2.q;

/* compiled from: MediationConfigClient.java */
/* loaded from: classes2.dex */
public class g {

    /* compiled from: MediationConfigClient.java */
    /* loaded from: classes2.dex */
    class a implements p.b<JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p.b f20931b;

        a(String str, p.b bVar) {
            this.f20930a = str;
            this.f20931b = bVar;
        }

        @Override // q2.p.b
        /* renamed from: b */
        public void a(JSONObject jSONObject) {
            List<ConfigurationItem> e10 = g.e(jSONObject);
            NetworkAdapterDataStore n10 = com.google.android.ads.mediationtestsuite.utils.e.n();
            if (n10 == null || e10 == null) {
                return;
            }
            g.a(com.google.android.ads.mediationtestsuite.utils.e.k(), n10.b(), e10);
            ConfigResponse configResponse = new ConfigResponse(e10, n10.b());
            k.p(com.google.android.ads.mediationtestsuite.utils.e.k(), this.f20930a, configResponse.b());
            this.f20931b.a(configResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediationConfigClient.java */
    /* loaded from: classes2.dex */
    public class b extends com.google.gson.reflect.a<CLDResponse> {
        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediationConfigClient.java */
    /* loaded from: classes2.dex */
    public class c extends com.google.gson.reflect.a<AdManagerCLDResponse> {
        c() {
        }
    }

    /* compiled from: MediationConfigClient.java */
    /* loaded from: classes2.dex */
    class d extends com.google.gson.reflect.a<List<Network>> {
        d() {
        }
    }

    /* compiled from: MediationConfigClient.java */
    /* loaded from: classes2.dex */
    class e extends com.google.gson.reflect.a<List<NetworkAdapter>> {
        e() {
        }
    }

    public static void a(Context context, List<Network> list, List<ConfigurationItem> list2) {
        com.google.android.ads.mediationtestsuite.utils.c.i(context);
        for (ConfigurationItem configurationItem : list2) {
            for (NetworkConfig networkConfig : configurationItem.h()) {
                int indexOf = list.indexOf(networkConfig.i().i());
                if (indexOf >= 0) {
                    list.get(indexOf).c(networkConfig);
                }
                networkConfig.G(configurationItem);
            }
        }
    }

    public static Gson b() {
        return new GsonBuilder().registerTypeAdapter(AdFormat.class, new AdFormatSerializer()).create();
    }

    @Nullable
    private static List<ConfigurationItem> c(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Gson b10 = b();
        Type e10 = new b().e();
        Log.d("gma_test", jSONObject.toString());
        CLDResponse cLDResponse = (CLDResponse) b10.fromJson(jSONObject.toString(), e10);
        if (cLDResponse == null || cLDResponse.a() == null) {
            return null;
        }
        for (AdUnitResponse adUnitResponse : cLDResponse.a()) {
            MediationConfig f10 = adUnitResponse.f();
            if (f10 != null && f10.a() != null && adUnitResponse.c() != null && adUnitResponse.c().matches("^ca-app-pub-\\d{16}/\\d{10}$")) {
                AdUnit adUnit = new AdUnit(adUnitResponse.c(), adUnitResponse.d(), adUnitResponse.e(), f10);
                if (!adUnit.h().isEmpty()) {
                    arrayList.add(adUnit);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    private static List<ConfigurationItem> d(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        AdManagerCLDResponse adManagerCLDResponse = (AdManagerCLDResponse) b().fromJson(jSONObject.toString(), new c().e());
        if (adManagerCLDResponse == null) {
            return null;
        }
        for (YieldGroup yieldGroup : adManagerCLDResponse.c()) {
            if (!yieldGroup.h().isEmpty()) {
                arrayList.add(yieldGroup);
            }
        }
        for (YieldPartner yieldPartner : YieldPartner.o(adManagerCLDResponse)) {
            if (!yieldPartner.h().isEmpty()) {
                arrayList.add(yieldPartner);
            }
        }
        return arrayList;
    }

    public static List<ConfigurationItem> e(JSONObject jSONObject) {
        if (k.i()) {
            return d(jSONObject);
        }
        return c(jSONObject);
    }

    public static NetworkAdapterDataStore f(Context context) throws IOException {
        String g10 = g(context, "networks.json");
        Gson b10 = b();
        return new NetworkAdapterDataStore(context, (List) b10.fromJson(g10, new d().e()), (List) b10.fromJson(g(context, "adapters.json"), new e().e()));
    }

    public static String g(Context context, String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        InputStream open = context.getAssets().open(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append("\n");
            } else {
                open.close();
                bufferedReader.close();
                return sb2.toString();
            }
        }
    }

    public static void h(p.b<ConfigResponse> bVar, p.a aVar) throws IOException {
        String format;
        String i10 = com.google.android.ads.mediationtestsuite.utils.e.i();
        if (TextUtils.isEmpty(i10)) {
            Log.e("gma_test", "No App ID found in manifest.");
            return;
        }
        if (i10.matches("^/\\d+~.*$")) {
            ArrayList arrayList = new ArrayList();
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter('~');
            simpleStringSplitter.setString(i10);
            while (simpleStringSplitter.hasNext()) {
                arrayList.add(simpleStringSplitter.next());
            }
            if (arrayList.size() != 2) {
                Log.e("gma_test", "Invalid AdManager App ID: " + i10);
                return;
            }
            format = String.format(Locale.getDefault(), "https://googleads.g.doubleclick.net/getconfig/pubsetting?iu=%1$s&msid=%2$s&cld_mode=%3$d", URLEncoder.encode((String) arrayList.get(0), "UTF-8"), URLEncoder.encode((String) arrayList.get(1), "UTF-8"), 2);
        } else if (i10.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
            format = String.format(Locale.getDefault(), "https://googleads.g.doubleclick.net/getconfig/pubsetting?client=%1$s&admob_appcc=%2$s&cld_mode=%3$d", i10.substring(0, 27), i10.substring(28), Integer.valueOf(k.i() ? 2 : 1));
            String f10 = com.google.android.ads.mediationtestsuite.utils.c.f();
            if (f10 != null) {
                format = format.concat(String.format("&rdid=%1$s&idtype=adid", f10));
            }
        } else {
            Log.e("gma_test", "Invalid App ID: " + i10);
            return;
        }
        q.a(com.google.android.ads.mediationtestsuite.utils.e.k()).a(new r2.k(0, format, null, new a(i10, bVar), aVar));
    }
}
