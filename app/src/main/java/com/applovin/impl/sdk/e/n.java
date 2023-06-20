package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8392a;

    public n(com.applovin.impl.sdk.m mVar) {
        super("TaskInitializeSdk", mVar);
        this.f8392a = mVar;
    }

    private void a() {
        if (this.f8392a.D().a()) {
            return;
        }
        Activity an = this.f8392a.an();
        if (an != null) {
            this.f8392a.D().a(an);
        } else {
            this.f8392a.S().a(new z(this.f8392a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f8392a.D().a(n.this.f8392a.af().a());
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }

    private void b() {
        String str;
        if (this.f8392a.e()) {
            return;
        }
        boolean d10 = this.f8392a.K().d();
        if (d10) {
            str = this.f8392a.V().k().f8767b + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        Map<String, Object> d11 = this.f8392a.V().d();
        Map<String, Object> c10 = this.f8392a.V().c();
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.a().a("=====AppLovin SDK=====");
        kVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8392a.a(com.applovin.impl.sdk.c.b.dz)).a("Ad Review Version", com.applovin.impl.sdk.e.a()).a("OM SDK Version", this.f8392a.al().c());
        kVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a(IronSourceConstants.TYPE_GAID, str).a("Model", d11.get("model")).a("Locale", d11.get("locale")).a("Emulator", d11.get("sim")).a("Tablet", d11.get("is_tablet"));
        kVar.a("===App Info===").a("Application ID", c10.get("package_name")).a("Target SDK", c10.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.tryToGetExoPlayerVersionCode()));
        kVar.a("===SDK Settings===").a("SDK Key", this.f8392a.z()).a("Mediation Provider", this.f8392a.t()).a("TG", com.applovin.impl.sdk.utils.p.a(this.f8392a)).a("Test Mode On", Boolean.valueOf(this.f8392a.J().a())).a("Verbose Logging On", Boolean.valueOf(d10));
        kVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.sdk.j.a(f()));
        kVar.a();
        com.applovin.impl.sdk.v.f("AppLovinSdk", kVar.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x014e, code lost:
        if (r12.f8392a.d() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
        if (r12.f8392a.d() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b0, code lost:
        r2 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b1, code lost:
        r8.append(r2);
        r8.append(" in ");
        r8.append(java.lang.System.currentTimeMillis() - r6);
        r8.append("ms");
        a(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c9, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.n.run():void");
    }
}
