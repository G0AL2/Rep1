package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TelemetryComponent.java */
/* loaded from: classes3.dex */
public class hh implements gq {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25660d = "hh";

    /* renamed from: c  reason: collision with root package name */
    public gn f25662c;

    /* renamed from: e  reason: collision with root package name */
    private gf f25663e;

    /* renamed from: f  reason: collision with root package name */
    private hi f25664f;

    /* renamed from: g  reason: collision with root package name */
    private String f25665g;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f25658a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static double f25659b = Math.random();

    /* renamed from: h  reason: collision with root package name */
    private static final ArrayList<String> f25661h = new ArrayList<>(Arrays.asList("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure "));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TelemetryComponent.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final hh f25669a = new hh((byte) 0);
    }

    /* synthetic */ hh(byte b10) {
        this();
    }

    private void e() {
        if (f25658a.get()) {
            return;
        }
        gk e10 = this.f25663e.e();
        e10.f25552e = this.f25665g;
        e10.f25549b = "default";
        gn gnVar = this.f25662c;
        if (gnVar == null) {
            this.f25662c = new gn(this.f25664f, this, e10);
        } else {
            gnVar.a(e10);
        }
        this.f25662c.a("default", true);
    }

    public final void b() {
        f25658a.set(false);
        gf gfVar = (gf) fs.a("telemetry", ho.f(), null);
        this.f25663e = gfVar;
        this.f25665g = gfVar.telemetryUrl;
        if (this.f25664f.a() > 0) {
            e();
        }
    }

    @Override // com.inmobi.media.gq
    public final gm c() {
        List<hj> a10;
        if (ib.a() != 1) {
            a10 = hi.a(this.f25663e.networkType.others.maxBatchSize);
        } else {
            a10 = hi.a(this.f25663e.networkType.wifi.maxBatchSize);
        }
        if (!a10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (hj hjVar : a10) {
                arrayList.add(Integer.valueOf(hjVar.f25671a));
            }
            String a11 = a(a10);
            if (a11 != null) {
                return new gm(arrayList, a11);
            }
        }
        return null;
    }

    private hh() {
        this.f25664f = new hi();
        gf gfVar = (gf) fr.a("telemetry", null);
        this.f25663e = gfVar;
        this.f25665g = gfVar.telemetryUrl;
    }

    public static hh a() {
        return a.f25669a;
    }

    public final void a(final String str, final Map<String, Object> map) {
        ho.a(new Runnable() { // from class: com.inmobi.media.hh.1
            @Override // java.lang.Runnable
            public final void run() {
                String unused = hh.f25660d;
                try {
                    hj hjVar = new hj(str);
                    if (!map.isEmpty() && str.equals("AssetDownloaded")) {
                        for (Map.Entry entry : map.entrySet()) {
                            if ("assetType".equals(entry.getKey())) {
                                if ("image".equals(entry.getKey()) && !hh.this.f25663e.assetReporting.image) {
                                    String unused2 = hh.f25660d;
                                    return;
                                } else if ("gif".equals(entry.getKey()) && !hh.this.f25663e.assetReporting.gif) {
                                    String unused3 = hh.f25660d;
                                    return;
                                } else if (DownloadResource.TYPE_VIDEO.equals(entry.getKey()) && !hh.this.f25663e.assetReporting.video) {
                                    String unused4 = hh.f25660d;
                                    return;
                                }
                            }
                        }
                    }
                    map.put("eventType", hjVar.f25672b);
                    map.put("eventId", UUID.randomUUID().toString());
                    hjVar.f25674d = map.toString();
                    hh.a(hh.this, hjVar);
                } catch (Exception unused5) {
                    String unused6 = hh.f25660d;
                }
            }
        });
    }

    private void a(hj hjVar) {
        gf gfVar = this.f25663e;
        if (gfVar.base.enabled) {
            int a10 = (this.f25664f.a() + 1) - gfVar.maxEventsToPersist;
            if (a10 > 0) {
                hi hiVar = this.f25664f;
                he a11 = he.a();
                List<ContentValues> a12 = a11.a("telemetry", null, null, null, null, null, "ts ASC", String.valueOf(a10));
                ArrayList arrayList = new ArrayList();
                for (ContentValues contentValues : a12) {
                    contentValues.getAsString("id");
                    arrayList.add(Integer.valueOf(Integer.parseInt(contentValues.getAsString("id"))));
                }
                hiVar.a(arrayList);
                a11.b();
            }
            hi.a(hjVar);
        }
    }

    private static String a(List<hj> list) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("im-accid", ho.g() != null ? ho.g() : "");
            hashMap.put("as-accid", ho.h() != null ? ho.h() : "");
            hashMap.put(MediationMetaData.KEY_VERSION, "4.0.0");
            hashMap.put("mk-version", hp.a());
            hashMap.put("u-appbid", ia.a().f25732a);
            hashMap.put("tp", hp.g());
            if (hp.f() != null) {
                hashMap.put("tp-ver", hp.f());
            }
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (hj hjVar : list) {
                if (!hjVar.a().trim().isEmpty()) {
                    jSONArray.put(new JSONObject(hjVar.a()));
                }
            }
            jSONObject.put("payload", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    static /* synthetic */ void a(hh hhVar, hj hjVar) {
        gf gfVar = hhVar.f25663e;
        if (gfVar.base.enabled) {
            if (!gfVar.disableAllGeneralEvents || gfVar.priorityEvents.contains(hjVar.f25672b)) {
                if (!f25661h.contains(hjVar.f25672b) || f25659b >= hhVar.f25663e.samplingFactor) {
                    if ("CrashEventOccurred".equals(hjVar.f25672b)) {
                        hhVar.a(hjVar);
                        return;
                    }
                    hhVar.a(hjVar);
                    hhVar.e();
                }
            }
        }
    }
}
