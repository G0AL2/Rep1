package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.d.b;
import com.iab.omid.library.ironsrc.d.e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z10;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        e.a(creativeType, "CreativeType is null");
        e.a(impressionType, "ImpressionType is null");
        e.a(owner, "Impression owner is null");
        e.a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z10);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", this.impressionOwner);
        b.a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        b.a(jSONObject, "creativeType", this.creativeType);
        b.a(jSONObject, "impressionType", this.impressionType);
        b.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
