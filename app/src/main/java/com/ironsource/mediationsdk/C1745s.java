package com.ironsource.mediationsdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.s  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1745s implements com.ironsource.mediationsdk.sdk.c {

    /* renamed from: a  reason: collision with root package name */
    C1746t f27328a;

    /* renamed from: b  reason: collision with root package name */
    ISDemandOnlyBannerLayout f27329b;

    /* renamed from: c  reason: collision with root package name */
    ConcurrentHashMap<String, C1746t> f27330c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private C1746t f27331d;

    public C1745s(List<NetworkSettings> list, com.ironsource.mediationsdk.model.e eVar, String str, String str2) {
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getBannerSettings(), true, false);
                if (a10 != null) {
                    this.f27330c.put(networkSettings.getSubProviderId(), new C1746t(str, str2, networkSettings, this, (int) eVar.f27226b, a10));
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, C1746t c1746t, Object[][] objArr) {
        Map<String, Object> c10 = c1746t.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(c10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(hashMap)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10, C1746t c1746t) {
        a(i10, c1746t, (Object[][]) null);
    }

    public final synchronized void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("demand only banner manager : destroyBanner");
        if (iSDemandOnlyBannerLayout == null) {
            ironLog.error("destroyBanner banner cannot be null");
        } else if (iSDemandOnlyBannerLayout.isDestroyed()) {
            ironLog.error("Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API");
        } else {
            iSDemandOnlyBannerLayout.f26290e = true;
            iSDemandOnlyBannerLayout.f26289d = null;
            iSDemandOnlyBannerLayout.f26287b = null;
            iSDemandOnlyBannerLayout.f26288c = null;
            iSDemandOnlyBannerLayout.f26286a = null;
            iSDemandOnlyBannerLayout.removeBannerListener();
            this.f27329b = null;
            if (this.f27331d != null) {
                ironLog.verbose("demand only banner manager : destroyBanner | mActiveSmash != null ");
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f27331d, (Object[][]) null);
                this.f27331d.a();
                this.f27331d = null;
                return;
            }
            if (this.f27328a != null) {
                ironLog.verbose("demand only banner manager : destroyBanner | mLoadingSmash != null ");
                a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f27328a, (Object[][]) null);
                this.f27328a.a();
                this.f27328a = null;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C1746t c1746t, boolean z10, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + c1746t.b());
        if (z10) {
            a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c1746t, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c1746t, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f27329b;
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            return;
        }
        this.f27329b.a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1746t c1746t) {
        IronLog.INTERNAL.verbose(c1746t.b());
        a((int) IronSourceConstants.BN_INSTANCE_CLICK, c1746t, (Object[][]) null);
        if (this.f27329b != null) {
            final C1736j a10 = C1736j.a();
            if (a10.f27110a != null) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronLog.CALLBACK.info("onBannerAdClicked()");
                        if (a10.f27110a != null) {
                            a10.f27110a.onBannerAdClicked();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1746t c1746t, final View view, final FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + c1746t.b());
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f27329b;
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c1746t);
            return;
        }
        final ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout2 = this.f27329b;
        if (iSDemandOnlyBannerLayout2 != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ISDemandOnlyBannerLayout.2
                @Override // java.lang.Runnable
                public final void run() {
                    iSDemandOnlyBannerLayout2.removeAllViews();
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    iSDemandOnlyBannerLayout2.f26286a = view;
                    iSDemandOnlyBannerLayout2.addView(view, 0, layoutParams);
                }
            });
        }
        this.f27331d = c1746t;
        int b10 = com.ironsource.mediationsdk.utils.o.a().b(3);
        a(3005, c1746t, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b10)}});
        a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, c1746t, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b10)}});
        com.ironsource.mediationsdk.utils.o.a().a(3);
        if (c1746t.i()) {
            for (String str : c1746t.f27553g) {
                C1732f.a();
                String a10 = C1732f.a(str, c1746t.d(), c1746t.e(), c1746t.f27554h, "", "", "", "");
                C1732f.a();
                C1732f.a("onBannerAdLoaded", c1746t.d(), a10);
            }
        }
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout3 = this.f27329b;
        if (iSDemandOnlyBannerLayout3 != null) {
            final C1736j a11 = C1736j.a();
            if (a11.f27110a != null) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronLog.CALLBACK.info("onBannerAdLoaded()");
                        if (a11.f27110a != null) {
                            a11.f27110a.onBannerAdLoaded();
                        }
                    }
                });
            }
            iSDemandOnlyBannerLayout3.f26291f = true;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void b(C1746t c1746t) {
        IronLog.INTERNAL.verbose(c1746t.b());
        a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c1746t, (Object[][]) null);
        if (this.f27329b != null) {
            final C1736j a10 = C1736j.a();
            if (a10.f27110a != null) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
                        if (a10.f27110a != null) {
                            a10.f27110a.onBannerAdScreenDismissed();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void c(C1746t c1746t) {
        IronLog.INTERNAL.verbose(c1746t.b());
        a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c1746t, (Object[][]) null);
        if (this.f27329b != null) {
            final C1736j a10 = C1736j.a();
            if (a10.f27110a != null) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronLog.CALLBACK.info("onBannerAdScreenPresented()");
                        if (a10.f27110a != null) {
                            a10.f27110a.onBannerAdScreenPresented();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void d(C1746t c1746t) {
        IronLog.INTERNAL.verbose(c1746t.b());
        a((int) IronSourceConstants.BN_INSTANCE_LEFT_APPLICATION, c1746t, (Object[][]) null);
        if (this.f27329b != null) {
            final C1736j a10 = C1736j.a();
            if (a10.f27110a != null) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronLog.CALLBACK.info("onBannerAdLeftApplication()");
                        if (a10.f27110a != null) {
                            a10.f27110a.onBannerAdLeftApplication();
                        }
                    }
                });
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void e(C1746t c1746t) {
        IronLog.INTERNAL.verbose(c1746t.b());
        a((int) IronSourceConstants.BN_INSTANCE_SHOW, c1746t, (Object[][]) null);
        a((int) IronSourceConstants.BN_CALLBACK_SHOW, "");
    }
}
