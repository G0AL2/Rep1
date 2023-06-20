package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1742p {

    /* renamed from: a  reason: collision with root package name */
    protected com.ironsource.mediationsdk.utils.a f27312a = new com.ironsource.mediationsdk.utils.a();

    /* renamed from: b  reason: collision with root package name */
    protected IronSourceSegment f27313b;

    /* renamed from: c  reason: collision with root package name */
    protected AdInfo f27314c;

    /* renamed from: d  reason: collision with root package name */
    private HashSet<ImpressionDataListener> f27315d;

    public AbstractC1742p(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f27315d = new HashSet<>();
        this.f27315d = hashSet;
        this.f27313b = ironSourceSegment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(IronSource.AD_UNIT ad_unit) {
        this.f27312a.a(ad_unit, false);
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f27313b = ironSourceSegment;
    }

    public final void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.f27314c = new AdInfo(impressionData);
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27315d.add(impressionDataListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.server.b bVar, String str) {
        if (bVar == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData a10 = bVar.a(str);
        if (a10 != null) {
            Iterator<ImpressionDataListener> it = this.f27315d.iterator();
            while (it.hasNext()) {
                ImpressionDataListener next = it.next();
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a10);
                next.onImpressionSuccess(a10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f27312a.a(ad_unit, jSONObject != null ? jSONObject.optBoolean("isAdUnitCapped", false) : false);
    }

    public final void a_() {
        this.f27314c = null;
    }

    public final void b() {
        synchronized (this) {
            this.f27315d.clear();
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f27315d.remove(impressionDataListener);
        }
    }
}
