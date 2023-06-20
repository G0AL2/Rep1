package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.d.c;
import com.iab.omid.library.applovin.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23916a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f23917b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f23918c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f23919d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f23916a = z10;
        this.f23917b = f10;
        this.f23918c = z11;
        this.f23919d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f23916a);
            if (this.f23916a) {
                jSONObject.put("skipOffset", this.f23917b);
            }
            jSONObject.put("autoPlay", this.f23918c);
            jSONObject.put("position", this.f23919d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f23919d;
    }

    public Float getSkipOffset() {
        return this.f23917b;
    }

    public boolean isAutoPlay() {
        return this.f23918c;
    }

    public boolean isSkippable() {
        return this.f23916a;
    }
}
