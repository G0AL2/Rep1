package com.fyber.inneractive.sdk.config.remote;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public UnitDisplayType f17028a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f17029b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f17030c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f17031d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("hide", RecyclerView.UNDEFINED_DURATION));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", RecyclerView.UNDEFINED_DURATION));
        bVar.f17028a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f17029b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.f17031d = valueOf;
        bVar.f17030c = valueOf2.intValue() != Integer.MIN_VALUE ? valueOf2 : null;
        return bVar;
    }
}
