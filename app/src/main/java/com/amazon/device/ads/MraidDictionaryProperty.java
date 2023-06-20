package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MraidProperty.java */
/* loaded from: classes.dex */
public class MraidDictionaryProperty extends MraidProperty {
    JSONObject data;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MraidDictionaryProperty(String str) {
        super(str);
        this.data = new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.name, this.data);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject getData() {
        return this.data;
    }
}
