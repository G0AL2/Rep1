package com.applovin.impl.sdk.a;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final m f8011a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8012b;

    /* renamed from: c  reason: collision with root package name */
    private String f8013c;

    public f(m mVar) {
        this.f8011a = mVar;
        this.f8012b = mVar.L();
    }

    public String a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f8013c, str);
        } catch (Throwable th) {
            if (v.a()) {
                this.f8011a.A().b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    public void a() {
        if (((Boolean) this.f8011a.a(com.applovin.impl.sdk.c.b.aq)).booleanValue()) {
            if (v.a()) {
                v A = this.f8011a.A();
                A.b("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(f.this.f8012b);
                    if (v.a()) {
                        v A2 = f.this.f8011a.A();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Init ");
                        sb2.append(f.this.b() ? "succeeded" : "failed");
                        sb2.append(" and took ");
                        sb2.append(System.currentTimeMillis() - currentTimeMillis);
                        sb2.append("ms");
                        A2.b("OpenMeasurementService", sb2.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.this.f8012b.getResources().openRawResource(R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    f.this.f8013c = sb3.toString();
                                    bufferedReader.close();
                                    return;
                                }
                                sb3.append(readLine);
                            }
                        } catch (IOException e10) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                        }
                    } catch (Throwable th) {
                        if (v.a()) {
                            f.this.f8011a.A().b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th);
                        }
                    }
                }
            });
        }
    }

    public boolean b() {
        return Omid.isActive();
    }

    public String c() {
        return Omid.getVersion();
    }

    public Partner d() {
        return Partner.createPartner((String) this.f8011a.a(com.applovin.impl.sdk.c.b.ar), AppLovinSdk.VERSION);
    }

    public String e() {
        return this.f8013c;
    }
}
