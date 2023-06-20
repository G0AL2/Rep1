package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty.java */
/* loaded from: classes.dex */
class ExpandProperty extends MraidProperty {
    int height;
    int width;

    ExpandProperty(JSONObject jSONObject) throws JSONException {
        super("expandProperty");
        this.width = jSONObject.getInt("width");
        this.height = jSONObject.getInt("height");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
    }
}
