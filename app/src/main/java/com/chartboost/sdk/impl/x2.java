package com.chartboost.sdk.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x2 {
    public String a(com.chartboost.sdk.Tracking.d dVar, k1 k1Var) {
        String str;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        if (dVar != null && k1Var != null) {
            try {
                w2 i10 = dVar.i();
                String str2 = "";
                if (i10 != null) {
                    str2 = i10.b();
                    str = i10.a();
                } else {
                    str = "";
                }
                String a10 = dVar.a();
                if (a10 != null) {
                    a10 = a10.toLowerCase();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("chartboost_sdk_autocache_enabled", k1Var.c());
                jSONObject2.put("chartboost_sdk_gdpr", k1Var.f());
                String d10 = k1Var.d();
                if (d10 != null && d10.length() > 0) {
                    jSONObject2.put("chartboost_sdk_ccpa", d10);
                }
                String e10 = k1Var.e();
                if (e10 != null && e10.length() > 0) {
                    jSONObject2.put("chartboost_sdk_coppa", e10);
                }
                jSONObject2.put("device_battery_level", k1Var.i());
                jSONObject2.put("device_charging_status", k1Var.j());
                jSONObject2.put("device_language", k1Var.n());
                jSONObject2.put("device_timezone", k1Var.v());
                jSONObject2.put("device_volume", k1Var.x());
                jSONObject2.put("device_mute", k1Var.q());
                jSONObject2.put("device_audio_output", k1Var.h());
                jSONObject2.put("device_storage", k1Var.u());
                jSONObject2.put("device_low_memory_warning", k1Var.o());
                jSONObject2.put("device_up_time", k1Var.w());
                String a11 = dVar.a();
                if (a11 != null && a11.length() > 0) {
                    char c10 = 65535;
                    int hashCode = a11.hashCode();
                    if (hashCode != -174936018) {
                        if (hashCode != 769047372) {
                            if (hashCode == 1982491468 && a11.equals(IronSourceConstants.BANNER_AD_UNIT)) {
                                c10 = 2;
                            }
                        } else if (a11.equals(IronSourceConstants.INTERSTITIAL_AD_UNIT)) {
                            c10 = 0;
                        }
                    } else if (a11.equals("Rewarded")) {
                        c10 = 1;
                    }
                    if (c10 == 0) {
                        jSONObject2.put("session_impression_count", k1Var.J());
                    } else if (c10 == 1) {
                        jSONObject2.put("session_impression_count", k1Var.K());
                    } else if (c10 == 2) {
                        jSONObject2.put("session_impression_count", k1Var.I());
                    }
                }
                jSONObject2.put("session_duration", k1Var.G());
                jSONObject.put("session_id", k1Var.H());
                jSONObject.put("session_count", k1Var.F());
                jSONObject.put("event_name", dVar.f());
                jSONObject.put("event_message", dVar.e());
                jSONObject.put("event_type", dVar.j().name());
                jSONObject.put("event_timestamp", dVar.h());
                jSONObject.put("event_latency", dVar.c());
                jSONObject.put("ad_type", a10);
                jSONObject.put("ad_impression_id", str2);
                jSONObject.put("ad_creative_id", str);
                jSONObject.put("app_id", k1Var.a());
                jSONObject.put("chartboost_sdk_version", k1Var.g());
                jSONObject.put("mediation_sdk", k1Var.B());
                jSONObject.put("mediation_sdk_version", k1Var.D());
                jSONObject.put("mediation_sdk_adapter_version", k1Var.C());
                jSONObject.put("framework", k1Var.y());
                jSONObject.put("framework_version", k1Var.A());
                jSONObject.put("framework_adapter_version", k1Var.z());
                jSONObject.put("device_id", k1Var.m());
                jSONObject.put("device_model", k1Var.p());
                jSONObject.put("device_os_version", k1Var.s());
                jSONObject.put("device_platform", k1Var.t());
                jSONObject.put("device_country", k1Var.l());
                jSONObject.put("device_connection_type", k1Var.k());
                jSONObject.put("device_orientation", k1Var.r());
                jSONObject.put("payload", jSONObject2);
                jSONArray.put(jSONObject);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        return jSONArray.toString();
    }
}
