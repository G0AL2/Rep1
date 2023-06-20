package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public Integer f17063a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f17064b;

    /* renamed from: c  reason: collision with root package name */
    public Set<Vendor> f17065c = null;

    public static k a(JSONObject jSONObject) {
        Vendor fromValue;
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(jSONObject.optInt("pausePct", RecyclerView.UNDEFINED_DURATION));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("playPct", RecyclerView.UNDEFINED_DURATION));
        k kVar = new k();
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        kVar.f17063a = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        kVar.f17064b = valueOf2;
        JSONArray optJSONArray = jSONObject.optJSONArray("vendor");
        if (optJSONArray != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                String optString = optJSONArray.optString(i10, null);
                if (!TextUtils.isEmpty(optString) && (fromValue = Vendor.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            kVar.f17065c = linkedHashSet;
        }
        return kVar;
    }
}
