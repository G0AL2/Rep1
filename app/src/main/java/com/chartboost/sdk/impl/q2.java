package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a  reason: collision with root package name */
    private i2 f14274a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f14275b;

    public q2(i2 i2Var, SharedPreferences sharedPreferences) {
        this.f14274a = i2Var;
        this.f14275b = sharedPreferences;
    }

    private int d() {
        DataUseConsent a10 = this.f14274a.a();
        if (a10 != null) {
            return a(a10);
        }
        return e();
    }

    private int e() {
        Chartboost.CBPIDataUseConsent h10;
        if (j()) {
            h10 = i();
        } else {
            h10 = h();
        }
        return h10.getValue();
    }

    private boolean f() {
        SharedPreferences sharedPreferences = this.f14275b;
        if (sharedPreferences != null) {
            return !sharedPreferences.contains("cbGDPR");
        }
        return true;
    }

    private boolean g() {
        SharedPreferences sharedPreferences = this.f14275b;
        if (sharedPreferences != null) {
            return sharedPreferences.contains("cbLimitTrack");
        }
        return false;
    }

    @Deprecated
    private Chartboost.CBPIDataUseConsent h() {
        Chartboost.CBPIDataUseConsent cBPIDataUseConsent = e2.f13964a;
        SharedPreferences sharedPreferences = this.f14275b;
        return sharedPreferences != null ? Chartboost.CBPIDataUseConsent.valueOf(sharedPreferences.getInt("cbGDPR", cBPIDataUseConsent.getValue())) : cBPIDataUseConsent;
    }

    @Deprecated
    private Chartboost.CBPIDataUseConsent i() {
        Chartboost.CBPIDataUseConsent cBPIDataUseConsent = Chartboost.CBPIDataUseConsent.UNKNOWN;
        SharedPreferences sharedPreferences = this.f14275b;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("cbLimitTrack", false)) ? cBPIDataUseConsent : Chartboost.CBPIDataUseConsent.NO_BEHAVIORAL;
    }

    private boolean j() {
        return g() && f();
    }

    public void a() {
        e2.a(d());
    }

    public int b() {
        return e2.a();
    }

    public int c() {
        return e2.b();
    }

    private int a(DataUseConsent dataUseConsent) {
        try {
            return Integer.parseInt((String) dataUseConsent.getConsent());
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return -1;
        }
    }
}
