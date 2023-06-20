package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.d.c;
import com.iab.omid.library.fyber.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24034a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f24035b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24036c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f24037d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24034a = z10;
        this.f24035b = f10;
        this.f24036c = z11;
        this.f24037d = position;
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
            jSONObject.put("skippable", this.f24034a);
            if (this.f24034a) {
                jSONObject.put("skipOffset", this.f24035b);
            }
            jSONObject.put("autoPlay", this.f24036c);
            jSONObject.put("position", this.f24037d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24037d;
    }

    public Float getSkipOffset() {
        return this.f24035b;
    }

    public boolean isAutoPlay() {
        return this.f24036c;
    }

    public boolean isSkippable() {
        return this.f24034a;
    }
}
