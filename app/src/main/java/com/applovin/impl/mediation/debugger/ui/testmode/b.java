package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final m f7775a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7776b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7777c;

    /* renamed from: d  reason: collision with root package name */
    private String f7778d;

    public b(m mVar) {
        this.f7775a = mVar;
        d<String> dVar = d.B;
        this.f7778d = (String) mVar.b((d<d<String>>) dVar, (d<String>) null);
        mVar.b(dVar);
        if (StringUtils.isValidString(this.f7778d)) {
            this.f7777c = true;
        }
        d<Boolean> dVar2 = d.C;
        this.f7776b = ((Boolean) mVar.b((d<d<Boolean>>) dVar2, (d<Boolean>) Boolean.FALSE)).booleanValue();
        mVar.b(dVar2);
        AppLovinCommunicator.getInstance(mVar.L()).subscribe(this, "test_mode_settings");
    }

    public void a(String str) {
        this.f7778d = str;
    }

    public void a(JSONObject jSONObject) {
        if (this.f7776b) {
            return;
        }
        this.f7776b = JsonUtils.containsCaseInsensitiveString(this.f7775a.V().k().f8767b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f7775a.V().g() || AppLovinSdkUtils.isEmulator();
    }

    public void a(boolean z10) {
        this.f7777c = z10;
    }

    public boolean a() {
        return this.f7776b;
    }

    public void b(String str) {
        this.f7775a.a((d<d<String>>) d.B, (d<String>) str);
    }

    public boolean b() {
        return this.f7777c;
    }

    public String c() {
        return this.f7778d;
    }

    public void d() {
        this.f7775a.a((d<d<Boolean>>) d.C, (d<Boolean>) Boolean.TRUE);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return b.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("test_mode_settings".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = BundleUtils.getString("force_ad_network", messageData);
            if (StringUtils.isValidString(string)) {
                this.f7777c = true;
                this.f7778d = string;
            }
            String string2 = BundleUtils.getString("test_mode_network_next_session", messageData);
            if (StringUtils.isValidString(string2)) {
                d();
                b(string2);
            }
        }
    }
}
