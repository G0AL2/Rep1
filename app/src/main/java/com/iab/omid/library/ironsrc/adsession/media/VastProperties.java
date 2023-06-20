package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.d.c;
import com.iab.omid.library.ironsrc.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f24263a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f24264b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24265c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f24266d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f24263a = z10;
        this.f24264b = f10;
        this.f24265c = z11;
        this.f24266d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f24263a);
            if (this.f24263a) {
                jSONObject.put("skipOffset", this.f24264b);
            }
            jSONObject.put("autoPlay", this.f24265c);
            jSONObject.put("position", this.f24266d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f24266d;
    }

    public final Float getSkipOffset() {
        return this.f24264b;
    }

    public final boolean isAutoPlay() {
        return this.f24265c;
    }

    public final boolean isSkippable() {
        return this.f24263a;
    }
}
