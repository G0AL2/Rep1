package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.fs;
import com.inmobi.media.gc;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashComponent.java */
/* loaded from: classes3.dex */
public class gg implements fs.c, gq {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f25529a = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final String f25530e = "gg";

    /* renamed from: b  reason: collision with root package name */
    public ga f25531b;

    /* renamed from: c  reason: collision with root package name */
    public gh f25532c;

    /* renamed from: d  reason: collision with root package name */
    public String f25533d;

    /* renamed from: f  reason: collision with root package name */
    private gn f25534f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashComponent.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final gg f25537a = new gg((byte) 0);
    }

    /* synthetic */ gg(byte b10) {
        this();
    }

    public final void b() {
        if (f25529a.get()) {
            return;
        }
        ga gaVar = this.f25531b;
        int i10 = gaVar.maxRetryCount;
        long j10 = gaVar.eventTTL;
        long j11 = gaVar.processingInterval;
        long j12 = gaVar.txLatency;
        gc gcVar = gaVar.networkType;
        gc.a aVar = gcVar.wifi;
        int i11 = aVar.minBatchSize;
        int i12 = aVar.maxBatchSize;
        gc.a aVar2 = gcVar.others;
        gk gkVar = new gk(i10, j10, j11, j12, i11, i12, aVar2.minBatchSize, aVar2.maxBatchSize, aVar.retryInterval, aVar2.retryInterval);
        gkVar.f25552e = this.f25533d;
        gkVar.f25549b = "default";
        gn gnVar = this.f25534f;
        if (gnVar == null) {
            this.f25534f = new gn(this.f25532c, this, gkVar);
        } else {
            gnVar.a(gkVar);
        }
        this.f25534f.a("default", false);
    }

    @Override // com.inmobi.media.gq
    public final gm c() {
        int i10;
        if (ib.a() != 1) {
            i10 = this.f25531b.networkType.others.maxBatchSize;
        } else {
            i10 = this.f25531b.networkType.wifi.maxBatchSize;
        }
        List<gi> a10 = gh.a(i10);
        if (!a10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (gi giVar : a10) {
                arrayList.add(Integer.valueOf(giVar.f25540a));
            }
            String a11 = a(a10);
            if (a11 != null) {
                return new gm(arrayList, a11);
            }
        }
        return null;
    }

    private gg() {
        Thread.setDefaultUncaughtExceptionHandler(new gj(Thread.getDefaultUncaughtExceptionHandler()));
        this.f25532c = new gh();
        this.f25531b = (ga) fr.a("crashReporting", null);
    }

    public static gg a() {
        return a.f25537a;
    }

    @Override // com.inmobi.media.fs.c
    public void a(fr frVar) {
        ga gaVar = (ga) frVar;
        this.f25531b = gaVar;
        this.f25533d = gaVar.url;
    }

    public final void a(final hg hgVar) {
        if (this.f25531b.catchEnabled) {
            ho.a(new Runnable() { // from class: com.inmobi.media.gg.1
                @Override // java.lang.Runnable
                public final void run() {
                    gg.this.a((gi) hgVar);
                    gg.this.b();
                }
            });
        }
    }

    public final void a(gi giVar) {
        if (!(giVar instanceof hg)) {
            if (!this.f25531b.crashEnabled) {
                return;
            }
            hh.a().a("CrashEventOccurred", new HashMap());
        }
        this.f25532c.b(this.f25531b.eventTTL);
        if ((this.f25532c.a() + 1) - this.f25531b.maxEventsToPersist >= 0) {
            gh.b();
        }
        gh.a(giVar);
    }

    private static String a(List<gi> list) {
        try {
            HashMap hashMap = new HashMap(ib.a(false));
            hashMap.put("im-accid", ho.f());
            hashMap.put(MediationMetaData.KEY_VERSION, "2.0.0");
            hashMap.put("component", AppMeasurement.CRASH_ORIGIN);
            hashMap.put("mk-version", hp.a());
            hashMap.putAll(ia.a().f25734c);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (gi giVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", giVar.f25541b);
                jSONObject2.put("eventType", giVar.f25542c);
                if (!giVar.a().trim().isEmpty()) {
                    jSONObject2.put("crash_report", giVar.a());
                }
                jSONObject2.put("ts", giVar.f25544e);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
