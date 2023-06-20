package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class aa implements n.a {

    /* renamed from: c  reason: collision with root package name */
    protected AbstractAdapter f26734c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ironsource.mediationsdk.model.a f26735d;

    /* renamed from: e  reason: collision with root package name */
    boolean f26736e;

    /* renamed from: f  reason: collision with root package name */
    protected JSONObject f26737f;

    /* renamed from: g  reason: collision with root package name */
    protected String f26738g;

    /* renamed from: h  reason: collision with root package name */
    protected int f26739h;

    /* renamed from: i  reason: collision with root package name */
    protected Long f26740i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.f26735d = aVar;
        this.f26734c = abstractAdapter;
        this.f26737f = aVar.f27215b;
    }

    private String a() {
        return this.f26735d.f27214a.isMultipleInstances() ? this.f26735d.f27214a.getProviderTypeForReflection() : this.f26735d.f27214a.getProviderName();
    }

    public final void b(String str) {
        C1732f.a();
        this.f26738g = C1732f.d(str);
    }

    public void d() {
        try {
            AbstractAdapter abstractAdapter = this.f26734c;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.f26735d.f27219f, this.f26737f);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e10.getMessage());
        }
        this.f26734c = null;
    }

    public int e() {
        return 1;
    }

    public final boolean h() {
        return this.f26735d.f27216c;
    }

    public final int i() {
        return this.f26735d.f27217d;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.f26735d.f27218e;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.f26735d.f27214a.getProviderName();
    }

    public final String l() {
        return this.f26735d.f27214a.getProviderTypeForReflection();
    }

    public final int m() {
        return this.f26739h;
    }

    public final Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f26734c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f26734c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f26735d.f27214a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f26735d.f27214a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(e()));
            if (!TextUtils.isEmpty(this.f26738g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f26738g);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + k() + ")", e10);
        }
        return hashMap;
    }

    public final Long o() {
        return this.f26740i;
    }

    public final String p() {
        return String.format("%s %s", a(), Integer.valueOf(hashCode()));
    }
}
