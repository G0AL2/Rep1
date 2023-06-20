package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final m f8496a;

    /* renamed from: b  reason: collision with root package name */
    private final AppLovinCommunicator f8497b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(m mVar) {
        this.f8496a = mVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(mVar.L());
        this.f8497b = appLovinCommunicator;
        if (mVar.e() || !((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            return;
        }
        appLovinCommunicator.a(mVar);
        appLovinCommunicator.subscribe(this, com.applovin.impl.communicator.c.f7144a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle b(com.applovin.impl.mediation.a.a r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.f()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.L()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.l()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r4.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getCreativeId()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L49
            java.lang.String r1 = r4.getCreativeId()
            java.lang.String r2 = "creative_id"
            r0.putString(r2, r1)
        L49:
            java.lang.String r1 = r4.getDspName()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L5c
            java.lang.String r1 = r4.getDspName()
            java.lang.String r2 = "dsp_name"
            r0.putString(r2, r1)
        L5c:
            boolean r1 = r4.k()
            if (r1 == 0) goto L6c
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_js_network_name"
        L68:
            r0.putString(r2, r1)
            goto L7f
        L6c:
            java.lang.String r1 = r4.L()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L7f
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            goto L68
        L7f:
            org.json.JSONObject r1 = r4.b()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle(r1)
            r0.putAll(r1)
            boolean r1 = r4 instanceof com.applovin.impl.mediation.a.b
            if (r1 == 0) goto Lc2
            com.applovin.impl.mediation.a.b r4 = (com.applovin.impl.mediation.a.b) r4
            android.view.View r4 = r4.w()
            if (r4 == 0) goto Lbb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto Lbd
        Lbb:
            java.lang.String r4 = "N/A"
        Lbd:
            java.lang.String r1 = "ad_view"
            r0.putString(r1, r4)
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.i.b(com.applovin.impl.mediation.a.a):android.os.Bundle");
    }

    public void a() {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue() && !this.f8496a.e()) {
            this.f8497b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f8496a.b(com.applovin.impl.sdk.c.b.eW).contains(str)));
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue() && this.f8497b.hasSubscriber("max_revenue_events")) {
            Bundle b10 = b(aVar);
            b10.putAll(JsonUtils.toBundle(aVar.c()));
            b10.putString("country_code", this.f8496a.s().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f8496a.q().getName(), b10);
            a(b10, "max_revenue_events");
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue() && this.f8497b.hasSubscriber("max_ad_events")) {
            Bundle b10 = b(aVar);
            b10.putString("type", str);
            if (v.a()) {
                v A = this.f8496a.A();
                A.b("CommunicatorService", "Sending \"max_ad_events\" message: " + b10);
            }
            a(b10, "max_ad_events");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString(ImagesContract.URL, str2);
            bundle.putInt(Analytics.Param.CODE, i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8496a.z());
            bundle.putString("applovin_random_token", this.f8496a.o());
            bundle.putString("compass_random_token", this.f8496a.n());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(this.f8496a.L()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(com.applovin.impl.mediation.d.c.a(this.f8496a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", new JSONObject());
            Bundle bundle2 = (Bundle) bundle.clone();
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "user_engagement_sdk_settings", new JSONObject());
            JsonUtils.putString(jSONObject3, "lsc", "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=");
            JsonUtils.putString(jSONObject3, "psp", "Y29tLmFuZHJvaWQudmVuZGluZw==");
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            a(bundle2, "user_engagement_sdk_init");
            Bundle bundle3 = (Bundle) bundle.clone();
            bundle3.putString("user_id", this.f8496a.m());
            bundle3.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject())));
            if (v.a()) {
                v A = this.f8496a.A();
                A.b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle3, "safedk_init");
            Bundle bundle4 = (Bundle) bundle.clone();
            bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
            a(bundle4, "adjust_init");
            Bundle bundle5 = (Bundle) bundle.clone();
            bundle5.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "discovery_settings", new JSONObject())));
            a(bundle5, "discovery_init");
        }
    }

    public boolean a(String str) {
        return com.applovin.impl.communicator.c.f7144a.contains(str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        int i10;
        if (((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.eX)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8496a.z());
                }
                this.f8496a.U().a(new h.a().c(messageData.getString(ImagesContract.URL)).d(messageData.getString("backup_url")).a(stringMap).c(map2).b(stringMap2).a(((Boolean) this.f8496a.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()).a(string).a());
            } else if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8496a.u().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8496a.u().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f8496a.E().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                }
            } else {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", "POST");
                long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f8496a.a(com.applovin.impl.sdk.c.b.dh)).longValue();
                int i11 = messageData2.getInt("retry_count", ((Integer) this.f8496a.a(com.applovin.impl.sdk.c.b.di)).intValue());
                long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f8496a.a(com.applovin.impl.sdk.c.b.dj)).longValue();
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j10 = millis2;
                if ("GET".equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f8496a.V().a(null, false, false))));
                    }
                    i10 = i11;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map<String, Object> h10 = this.f8496a.V().h();
                        Map<String, Object> d10 = this.f8496a.V().d();
                        if (d10.containsKey("idfv") && d10.containsKey("idfv_scope")) {
                            i10 = i11;
                            String str = (String) d10.get("idfv");
                            int intValue = ((Integer) d10.get("idfv_scope")).intValue();
                            d10.remove("idfv");
                            d10.remove("idfv_scope");
                            h10.put("idfv", str);
                            h10.put("idfv_scope", Integer.valueOf(intValue));
                        } else {
                            i10 = i11;
                        }
                        h10.put("server_installed_at", this.f8496a.a(com.applovin.impl.sdk.c.b.f8197af));
                        h10.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8496a.z());
                        map.put("app", h10);
                        map.put("device", d10);
                    } else {
                        i10 = i11;
                    }
                }
                this.f8496a.S().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.c.a(this.f8496a).a(messageData2.getString(ImagesContract.URL)).c(messageData2.getString("backup_url")).a(stringMap3).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).b((int) millis).a(i10).c((int) j10).a((c.a) new JSONObject()).c(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f8496a), o.a.MAIN);
            }
        }
    }
}
