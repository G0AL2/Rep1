package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9079a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9080b;

    /* renamed from: g  reason: collision with root package name */
    private String f9085g;

    /* renamed from: l  reason: collision with root package name */
    private m f9090l;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9084f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private List<String> f9086h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    private List<String> f9087i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, String> f9088j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Object f9089k = new Object();

    /* renamed from: c  reason: collision with root package name */
    private boolean f9081c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9082d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9083e = true;

    public AppLovinSdkSettings(Context context) {
        this.f9079a = Utils.isVerboseLoggingEnabled(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void attachAppLovinSdk(m mVar) {
        this.f9090l = mVar;
        if (StringUtils.isValidString(this.f9085g)) {
            mVar.J().a(true);
            mVar.J().a(this.f9085g);
            this.f9085g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        HashMap hashMap;
        synchronized (this.f9089k) {
            hashMap = new HashMap(this.f9088j);
        }
        return hashMap;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f9087i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f9086h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f9081c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f9082d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f9083e;
    }

    public boolean isMuted() {
        return this.f9080b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f9079a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        this.f9081c = z10;
    }

    public void setExceptionHandlerEnabled(boolean z10) {
        this.f9082d = z10;
    }

    public void setExtraParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (v.a()) {
                v.i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
                return;
            }
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        synchronized (this.f9089k) {
            this.f9088j.put(str, trim);
        }
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f9090l == null) {
                this.f9085g = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f9090l.J().a(true);
                this.f9090l.J().a(trim);
            } else {
                this.f9090l.J().a(false);
                this.f9090l.J().a((String) null);
            }
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list == null) {
            this.f9087i = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else if (v.a()) {
                    v.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f9087i = arrayList;
    }

    public void setLocationCollectionEnabled(boolean z10) {
        this.f9083e = z10;
    }

    public void setMuted(boolean z10) {
        this.f9080b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        this.f9084f = z10;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list == null) {
            this.f9086h = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str != null && str.length() == 36) {
                arrayList.add(str);
            } else if (v.a()) {
                v.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            }
        }
        this.f9086h = arrayList;
    }

    public void setVerboseLogging(boolean z10) {
        if (!Utils.isVerboseLoggingConfigured()) {
            this.f9079a = z10;
            return;
        }
        if (v.a()) {
            v.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        }
        if (Utils.isVerboseLoggingEnabled(null) != z10) {
            v.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f9084f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f9079a + ", muted=" + this.f9080b + ", testDeviceAdvertisingIds=" + this.f9086h.toString() + ", initializationAdUnitIds=" + this.f9087i.toString() + ", creativeDebuggerEnabled=" + this.f9081c + ", exceptionHandlerEnabled=" + this.f9082d + ", locationCollectionEnabled=" + this.f9083e + '}';
    }
}
