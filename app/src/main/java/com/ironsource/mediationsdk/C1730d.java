package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1730d {

    /* renamed from: d  reason: collision with root package name */
    private static final C1730d f27020d = new C1730d();

    /* renamed from: e  reason: collision with root package name */
    private static final Object f27021e = new Object();

    /* renamed from: a  reason: collision with root package name */
    String f27022a;

    /* renamed from: b  reason: collision with root package name */
    String f27023b;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f27027h;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f27028i;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicBoolean f27030k = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f27025f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f27026g = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap<String, List<String>> f27024c = new ConcurrentHashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> f27029j = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.d$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27031a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f27031a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27031a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27031a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private C1730d() {
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + str2.toLowerCase(Locale.ENGLISH) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + str2;
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
            IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            Boolean bool = this.f27028i;
            if (bool != null) {
                try {
                    baseAdapter.setAdapterDebug(bool.booleanValue());
                } catch (Exception e10) {
                    String str4 = "error while setting adapterDebug of " + baseAdapter.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                    a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
                    b(str4);
                    e10.printStackTrace();
                }
            }
            this.f27026g.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str5 = "failed to load " + str3;
                IronLog.INTERNAL.error(str5);
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str5);
            }
            return null;
        }
    }

    public static C1730d a() {
        return f27020d;
    }

    private static void a(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
            }
            com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, jSONObject));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(AbstractAdapter abstractAdapter) {
        try {
            Boolean bool = this.f27027h;
            if (bool != null) {
                abstractAdapter.setConsent(bool.booleanValue());
            }
        } catch (Throwable th) {
            String str = "error while setting consent of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
            th.printStackTrace();
        }
    }

    private void a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
            a("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f27025f.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f27025f.values()) {
                    if (abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f27026g.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterAPSDataInterface)) {
                    ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                    return;
                }
            }
            synchronized (f27021e) {
                this.f27029j.put(ad_unit, jSONObject2);
            }
        } catch (Exception e10) {
            String str = "error while setting APSData: " + e10.getLocalizedMessage();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
            a(str);
            e10.printStackTrace();
        }
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 3);
    }

    private static String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f27028i;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
                th.printStackTrace();
            }
        }
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "AdapterRepository: " + str, 0);
    }

    private BaseAdAdapter<?, ?> c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : "com.ironsource.adapters") + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str2 = "failed to load " + str;
                IronLog.INTERNAL.error(str2);
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private void c(AbstractAdapter abstractAdapter) {
        for (String str : this.f27024c.keySet()) {
            try {
                List<String> list = this.f27024c.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
                th.printStackTrace();
            }
        }
    }

    private void d(AbstractAdapter abstractAdapter) {
        if (!abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH).equals("aps") || this.f27029j.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.f27029j.keySet()) {
            try {
                JSONObject jSONObject = this.f27029j.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e10) {
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                b(str);
                e10.printStackTrace();
            }
        }
        this.f27029j.clear();
    }

    public final AbstractAdapter a(NetworkSettings networkSettings) {
        String b10 = b(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f27025f.get(b10) : a(b10, networkSettings.getProviderTypeForReflection());
    }

    public final AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10, boolean z11) {
        String str;
        String b10 = b(networkSettings);
        String providerTypeForReflection = z10 ? IronSourceConstants.IRONSOURCE_CONFIG_NAME : networkSettings.getProviderTypeForReflection();
        synchronized (f27021e) {
            if (!z11) {
                if (this.f27025f.containsKey(b10)) {
                    return this.f27025f.get(b10);
                }
            }
            AbstractAdapter a10 = a(b10, providerTypeForReflection);
            if (a10 == null) {
                a(b10 + " adapter was not loaded");
                return null;
            }
            try {
                str = a10.getCoreSDKVersion();
            } catch (Exception e10) {
                String str2 = "error while retrieving coreSDKVersion " + a10.getProviderName() + ": " + e10.getLocalizedMessage();
                a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
                str = "Unknown";
            }
            b(b10 + " was allocated (adapter version: " + a10.getVersion() + ", sdk version: " + str + ")");
            a10.setLogListener(IronSourceLoggerManager.getLogger());
            c(a10);
            d(a10);
            a(a10);
            b(a10);
            if ((providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) && this.f27030k.compareAndSet(false, true)) {
                b("SDK5 earlyInit  <" + providerTypeForReflection + ">");
                try {
                    a10.earlyInit(this.f27022a, this.f27023b, jSONObject);
                } catch (Exception e11) {
                    String str3 = "error while calling early init for " + a10.getProviderName() + ": " + e11.getLocalizedMessage();
                    a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
                    IronLog.INTERNAL.error(str3);
                }
            }
            if (!z11) {
                this.f27025f.put(b10, a10);
            }
            return a10;
        }
    }

    public final AdapterBaseInterface a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        String b10 = b(networkSettings);
        if (this.f27026g.containsKey(b10)) {
            AdapterBaseInterface adapterBaseInterface = this.f27026g.get(b10).getAdapterBaseInterface();
            if (adapterBaseInterface instanceof P) {
                ((P) adapterBaseInterface).f26469a = ad_unit;
            }
            return adapterBaseInterface;
        }
        AdapterBaseInterface a10 = a(b10, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (a10 != null || networkSettings.isCustomNetwork()) {
            this.f27026g.put(b10, new AdapterBaseWrapper(a10, networkSettings));
            return a10;
        }
        int i10 = AnonymousClass1.f27031a[ad_unit.ordinal()];
        AbstractAdapter a11 = a(networkSettings, i10 != 1 ? i10 != 2 ? i10 != 3 ? null : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false, true);
        if (a11 != null) {
            P p10 = new P(a11, networkSettings, ad_unit);
            this.f27026g.put(b10, new AdapterBaseWrapper(p10, networkSettings));
            return p10;
        }
        String str = "error creating network adapter " + networkSettings.getProviderName();
        a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public final void a(String str, List<String> list) {
        synchronized (f27021e) {
            this.f27024c.put(str, list);
            if (!this.f27025f.isEmpty()) {
                IronSourceUtils.sendAutomationLog("setMetaData key = " + str + ", values = " + list);
                for (AbstractAdapter abstractAdapter : this.f27025f.values()) {
                    abstractAdapter.setMetaData(str, list);
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f27026g.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                    try {
                        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
                    } catch (Exception e10) {
                        String str2 = "error while setting metadata of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                        b(str2);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else if (jSONObject == null || jSONObject.length() == 0) {
            str2 = "Calling setNetworkData with empty networkData";
        } else if (str.toLowerCase(Locale.ENGLISH).equals("aps")) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Locale locale = Locale.ENGLISH;
                String lowerCase = next.toLowerCase(locale);
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
                if (lowerCase.equals(ad_unit.toString())) {
                    a(ad_unit, jSONObject.optJSONObject(next));
                } else {
                    String lowerCase2 = next.toLowerCase(locale);
                    IronSource.AD_UNIT ad_unit2 = IronSource.AD_UNIT.INTERSTITIAL;
                    if (lowerCase2.equals(ad_unit2.toString())) {
                        a(ad_unit2, jSONObject.optJSONObject(next));
                    }
                }
            }
            return;
        } else {
            str2 = "Calling setNetworkData on an unsupported network: " + str;
        }
        a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        a(str2);
    }

    public final void a(boolean z10) {
        synchronized (f27021e) {
            this.f27027h = Boolean.valueOf(z10);
            for (AbstractAdapter abstractAdapter : this.f27025f.values()) {
                a(abstractAdapter);
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.f27026g.values()) {
                AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterConsentInterface)) {
                    try {
                        ((AdapterConsentInterface) adapterBaseInterface).setConsent(z10);
                    } catch (Exception e10) {
                        String str = "error while setting consent of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
                        a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                        b(str);
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    public final BaseAdAdapter<?, ?> b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> c10 = c(networkSettings, ad_unit);
        if (c10 != null || networkSettings.isCustomNetwork()) {
            return c10;
        }
        AbstractAdapter a10 = a(networkSettings);
        if (a10 == null || (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO)) {
            String str = "error creating ad adapter " + networkSettings.getProviderName();
            a((int) IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            IronLog.INTERNAL.error(str);
            return null;
        }
        return new P(a10, networkSettings, ad_unit);
    }

    public final void b(boolean z10) {
        synchronized (f27021e) {
            this.f27028i = Boolean.valueOf(z10);
            for (AbstractAdapter abstractAdapter : this.f27025f.values()) {
                b(abstractAdapter);
            }
        }
    }
}
