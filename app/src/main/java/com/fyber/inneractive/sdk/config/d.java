package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f16923a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f16924b = null;

    /* renamed from: c  reason: collision with root package name */
    public InneractiveAdManager.GdprConsentSource f16925c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f16926d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f16927e = null;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f16928f = null;

    /* renamed from: g  reason: collision with root package name */
    public SharedPreferences f16929g;

    public Boolean a() {
        if (com.fyber.inneractive.sdk.util.l.f20301a == null) {
            return null;
        }
        return this.f16923a;
    }

    public void b() {
        Application application = com.fyber.inneractive.sdk.util.l.f20301a;
        if (this.f16929g != null || application == null) {
            return;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
        this.f16929g = sharedPreferences;
        if (sharedPreferences != null) {
            if (sharedPreferences.contains("IAGDPRBool")) {
                this.f16923a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
            }
            if (sharedPreferences.contains("IAGdprConsentData")) {
                this.f16924b = sharedPreferences.getString("IAGdprConsentData", null);
            }
            if (sharedPreferences.contains("IACCPAConsentData")) {
                this.f16927e = sharedPreferences.getString("IACCPAConsentData", null);
            }
            if (sharedPreferences.contains("IAGdprSource")) {
                try {
                    this.f16925c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                } catch (Exception unused) {
                    this.f16925c = InneractiveAdManager.GdprConsentSource.Internal;
                }
            }
            if (sharedPreferences.contains("IALgpdConsentStatus")) {
                this.f16928f = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
            }
            if (sharedPreferences.contains("keyUserID")) {
                this.f16926d = sharedPreferences.getString("keyUserID", null);
            }
        }
    }

    public final boolean a(String str, boolean z10) {
        if (com.fyber.inneractive.sdk.util.l.f20301a != null) {
            b();
            SharedPreferences sharedPreferences = this.f16929g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean(str, z10).apply();
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.l.f20301a != null) {
            b();
            if (this.f16929g != null) {
                IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
                this.f16929g.edit().putString(str, str2).apply();
                return true;
            }
            return false;
        }
        return false;
    }
}
