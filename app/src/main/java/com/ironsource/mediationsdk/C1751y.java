package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1751y {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractAdapter f27547a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ironsource.mediationsdk.model.a f27548b;

    /* renamed from: c  reason: collision with root package name */
    protected JSONObject f27549c;

    /* renamed from: d  reason: collision with root package name */
    int f27550d;

    /* renamed from: h  reason: collision with root package name */
    protected String f27554h;

    /* renamed from: k  reason: collision with root package name */
    private final Object f27557k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private final Object f27558l = new Object();

    /* renamed from: i  reason: collision with root package name */
    private a f27555i = a.NOT_LOADED;

    /* renamed from: j  reason: collision with root package name */
    private Timer f27556j = null;

    /* renamed from: e  reason: collision with root package name */
    protected String f27551e = "";

    /* renamed from: f  reason: collision with root package name */
    protected JSONObject f27552f = null;

    /* renamed from: g  reason: collision with root package name */
    protected List<String> f27553g = new ArrayList();

    /* renamed from: com.ironsource.mediationsdk.y$a */
    /* loaded from: classes3.dex */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C1751y(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.f27548b = aVar;
        this.f27547a = abstractAdapter;
        this.f27549c = aVar.f27215b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f27557k) {
            aVar2 = this.f27555i;
            if (Arrays.asList(aVarArr).contains(this.f27555i)) {
                a(aVar);
            }
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f27548b.f27214a.getProviderName() + ": current state=" + this.f27555i + ", new state=" + aVar, 0);
        synchronized (this.f27557k) {
            this.f27555i = aVar;
        }
    }

    public final void a(String str) {
        C1732f.a();
        this.f27554h = C1732f.d(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(TimerTask timerTask) {
        synchronized (this.f27558l) {
            h();
            Timer timer = new Timer();
            this.f27556j = timer;
            timer.schedule(timerTask, this.f27550d * 1000);
        }
    }

    public final void a(JSONObject jSONObject) {
        this.f27552f = jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(a aVar, a aVar2) {
        synchronized (this.f27557k) {
            if (this.f27555i == aVar) {
                a(aVar2);
                return true;
            }
            return false;
        }
    }

    public final void b(String str) {
        this.f27551e = str;
    }

    public Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f27547a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f27547a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f27548b.f27214a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f27548b.f27214a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f27548b.f27216c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f27551e)) {
                    hashMap.put("auctionId", this.f27551e);
                }
                JSONObject jSONObject = this.f27552f;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f27552f);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f27554h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f27554h);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + d() + ")", e10);
        }
        return hashMap;
    }

    public final String d() {
        return this.f27548b.f27214a.getProviderName();
    }

    public final int e() {
        return this.f27548b.f27217d;
    }

    public final String f() {
        return this.f27548b.f27214a.getSubProviderId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g() {
        a aVar = this.f27555i;
        return aVar == null ? "null" : aVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        synchronized (this.f27558l) {
            Timer timer = this.f27556j;
            if (timer != null) {
                timer.cancel();
                this.f27556j = null;
            }
        }
    }

    public final boolean i() {
        return this.f27548b.f27216c;
    }
}
