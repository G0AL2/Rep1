package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1727a {

    /* renamed from: b  reason: collision with root package name */
    int f26649b;

    /* renamed from: d  reason: collision with root package name */
    AbstractC1728b f26651d;

    /* renamed from: e  reason: collision with root package name */
    AbstractC1728b f26652e;

    /* renamed from: f  reason: collision with root package name */
    String f26653f;

    /* renamed from: g  reason: collision with root package name */
    String f26654g;

    /* renamed from: j  reason: collision with root package name */
    Boolean f26657j;

    /* renamed from: k  reason: collision with root package name */
    boolean f26658k;

    /* renamed from: m  reason: collision with root package name */
    private String f26660m = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: n  reason: collision with root package name */
    private String f26661n = "status";

    /* renamed from: o  reason: collision with root package name */
    private String f26662o = "placement";

    /* renamed from: p  reason: collision with root package name */
    private String f26663p = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: q  reason: collision with root package name */
    private String f26664q = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: r  reason: collision with root package name */
    private String f26665r = "providerPriority";

    /* renamed from: i  reason: collision with root package name */
    boolean f26656i = false;

    /* renamed from: l  reason: collision with root package name */
    boolean f26659l = true;

    /* renamed from: c  reason: collision with root package name */
    final CopyOnWriteArrayList<AbstractC1728b> f26650c = new CopyOnWriteArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    IronSourceLoggerManager f26655h = IronSourceLoggerManager.getLogger();

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.e f26648a = null;

    abstract void a(Context context, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(AbstractC1728b abstractC1728b) {
        this.f26650c.add(abstractC1728b);
        com.ironsource.mediationsdk.utils.e eVar = this.f26648a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (abstractC1728b.f26990m != 99) {
                        eVar.f27427a.put(eVar.d(abstractC1728b), Integer.valueOf(abstractC1728b.f26990m));
                    }
                } catch (Exception e10) {
                    eVar.f27429c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a() {
        return this.f26659l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        this.f26659l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(AbstractC1728b abstractC1728b) {
        try {
            String str = J.a().f26340l;
            if (!TextUtils.isEmpty(str) && abstractC1728b.f26979b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = abstractC1728b.f26994q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, abstractC1728b.j() + ":setMediationSegment(segment:" + str + ")", 1);
                abstractC1728b.f26979b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
            AbstractAdapter abstractAdapter = abstractC1728b.f26979b;
            if (abstractAdapter != null) {
                abstractAdapter.setPluginData(pluginType, pluginFrameworkVersion);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e10.toString(), 3);
        }
    }
}
