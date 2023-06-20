package com.inmobi.media;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OmidNativeTracker.java */
/* loaded from: classes3.dex */
public final class em extends cf {

    /* renamed from: i  reason: collision with root package name */
    private static final String f25266i = "em";

    /* renamed from: g  reason: collision with root package name */
    public final String f25267g;

    /* renamed from: h  reason: collision with root package name */
    public final String f25268h;

    public em(String str, String str2, String str3, String str4, Map<String, String> map) {
        super(str3, 0, str4, map);
        this.f25268h = str;
        this.f25267g = str2;
    }

    @Override // com.inmobi.media.cf
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f24919a);
            jSONObject.put(ImagesContract.URL, this.f24920b);
            jSONObject.put("eventType", this.f24922d);
            jSONObject.put("eventId", this.f24921c);
            if (!TextUtils.isEmpty(this.f25268h)) {
                jSONObject.put("vendorKey", this.f25268h);
            }
            if (!TextUtils.isEmpty(this.f25267g)) {
                jSONObject.put("verificationParams", this.f25267g);
            }
            Map map = this.f24923e;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", hv.a(map, ","));
            return jSONObject.toString();
        } catch (JSONException e10) {
            gg.a().a(new hg(e10));
            return "";
        }
    }
}
