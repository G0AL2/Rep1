package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.fyber.inneractive.sdk.response.b {
    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, y yVar) {
        try {
            ((f) this.f20150a).B = new JSONObject(str).getString("adm");
        } catch (JSONException e10) {
            com.fyber.inneractive.sdk.dv.handler.c.a(yVar != null ? yVar.f17073b : null, com.fyber.inneractive.sdk.dv.enums.a.Parse, null, null, e10.getLocalizedMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public com.fyber.inneractive.sdk.response.e a() {
        return new f();
    }
}
