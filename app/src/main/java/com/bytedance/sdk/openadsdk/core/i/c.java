package com.bytedance.sdk.openadsdk.core.i;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsConfiglInfo.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f12337a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12338b;

    public c(String str) {
        this.f12337a = "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js";
        this.f12338b = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            this.f12337a = optJSONObject.optString(ImagesContract.URL, "https://sf16-scmcdn-sg.ibytedtos.com/goofy/bytecom/resource/tetris/oversea_pi.01f77b3a.js");
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.optString(i10));
            }
            this.f12338b = arrayList.contains("load_finish");
        } catch (Exception unused) {
        }
    }
}
