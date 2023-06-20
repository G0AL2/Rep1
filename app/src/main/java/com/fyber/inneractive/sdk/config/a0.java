package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.m0;
import com.inmobi.media.jh;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a0 implements b0, m0.a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f16899a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f16900b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f16901c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f16902d;

    /* renamed from: e  reason: collision with root package name */
    public Orientation f16903e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f16904f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f16905g;

    /* renamed from: h  reason: collision with root package name */
    public Skip f16906h;

    /* renamed from: i  reason: collision with root package name */
    public TapAction f16907i;

    /* renamed from: j  reason: collision with root package name */
    public UnitDisplayType f16908j;

    /* renamed from: k  reason: collision with root package name */
    public List<Integer> f16909k;

    public a0() {
        Boolean bool = Boolean.TRUE;
        this.f16899a = bool;
        this.f16900b = Integer.valueOf((int) jh.DEFAULT_BITMAP_TIMEOUT);
        this.f16901c = 0;
        this.f16902d = bool;
        this.f16904f = 0;
        this.f16905g = 2048;
        this.f16906h = Skip.fromValue(0);
        this.f16909k = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.m0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "autoPlay", this.f16899a);
        m0.a(jSONObject, "maxBitrate", this.f16900b);
        m0.a(jSONObject, "minBitrate", this.f16901c);
        m0.a(jSONObject, "muted", this.f16902d);
        m0.a(jSONObject, AdUnitActivity.EXTRA_ORIENTATION, this.f16903e);
        m0.a(jSONObject, "padding", this.f16904f);
        m0.a(jSONObject, "pivotBitrate", this.f16905g);
        m0.a(jSONObject, "skip", this.f16906h);
        m0.a(jSONObject, "tapAction", this.f16907i);
        m0.a(jSONObject, "unitDisplayType", this.f16908j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f16909k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        m0.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    public Boolean b() {
        return this.f16899a;
    }
}
