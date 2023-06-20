package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.d.c;
import com.iab.omid.library.inmobi.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24150a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f24151b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24152c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f24153d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24150a = z10;
        this.f24151b = f10;
        this.f24152c = z11;
        this.f24153d = position;
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
            jSONObject.put("skippable", this.f24150a);
            if (this.f24150a) {
                jSONObject.put("skipOffset", this.f24151b);
            }
            jSONObject.put("autoPlay", this.f24152c);
            jSONObject.put("position", this.f24153d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f24153d;
    }

    public Float getSkipOffset() {
        return this.f24151b;
    }

    public boolean isAutoPlay() {
        return this.f24152c;
    }

    public boolean isSkippable() {
        return this.f24150a;
    }
}
