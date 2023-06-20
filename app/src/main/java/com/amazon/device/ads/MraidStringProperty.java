package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty.java */
/* loaded from: classes.dex */
class MraidStringProperty extends MraidProperty {
    String value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MraidStringProperty(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.name, getValue());
    }

    String getValue() {
        return this.value;
    }
}
