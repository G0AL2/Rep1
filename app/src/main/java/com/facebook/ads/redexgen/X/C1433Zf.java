package com.facebook.ads.redexgen.X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1433Zf implements AnonymousClass72<String> {
    public final String A00;
    public final boolean A01;

    public C1433Zf(String str) {
        this.A00 = str;
        this.A01 = C1432Ze.A01().hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    /* renamed from: A00 */
    public final JSONObject AFB(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final boolean A8S(Object obj) {
        C1433Zf c1433Zf = (C1433Zf) obj;
        return this.A00.equals(c1433Zf.A00) && this.A01 == c1433Zf.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass72
    public final int AEp() {
        return this.A00.getBytes().length + 8;
    }
}
