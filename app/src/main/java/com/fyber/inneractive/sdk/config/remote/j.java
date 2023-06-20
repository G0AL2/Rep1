package com.fyber.inneractive.sdk.config.remote;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f17052a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f17053b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f17054c;

    /* renamed from: d  reason: collision with root package name */
    public Skip f17055d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f17056e;

    /* renamed from: f  reason: collision with root package name */
    public TapAction f17057f;

    /* renamed from: g  reason: collision with root package name */
    public Orientation f17058g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f17059h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f17060i;

    /* renamed from: j  reason: collision with root package name */
    public UnitDisplayType f17061j;

    /* renamed from: k  reason: collision with root package name */
    public List<Integer> f17062k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("maxBitrate", RecyclerView.UNDEFINED_DURATION));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("minBitrate", RecyclerView.UNDEFINED_DURATION));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", RecyclerView.UNDEFINED_DURATION));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", RecyclerView.UNDEFINED_DURATION));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.f17053b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.f17054c = valueOf2;
        jVar.f17055d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", RecyclerView.UNDEFINED_DURATION)));
        jVar.f17056e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f17052a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f17058g = Orientation.fromValue(jSONObject.optString(AdUnitActivity.EXTRA_ORIENTATION));
        jVar.f17057f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.f17059h = valueOf3;
        jVar.f17060i = valueOf4.intValue() != Integer.MIN_VALUE ? valueOf4 : null;
        jVar.f17061j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                int optInt = optJSONArray.optInt(i10, RecyclerView.UNDEFINED_DURATION);
                if (optInt != Integer.MIN_VALUE) {
                    jVar.f17062k.add(Integer.valueOf(optInt));
                }
            }
        }
        return jVar;
    }
}
