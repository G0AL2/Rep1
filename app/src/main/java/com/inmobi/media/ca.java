package com.inmobi.media;

import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeImageAsset.java */
/* loaded from: classes3.dex */
public final class ca extends bt {
    public ca(String str, String str2, bu buVar, String str3, byte b10, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b10, jSONObject);
    }

    public ca(String str, String str2, bu buVar, String str3, List<cf> list, byte b10, JSONObject jSONObject) {
        super(str, str2, "IMAGE", buVar, list);
        this.f24813e = str3;
        if (jSONObject != null) {
            this.f24817i = b10;
            this.f24814f = jSONObject;
        }
    }
}
