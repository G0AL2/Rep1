package com.inmobi.media;

import android.os.Build;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeGifAsset.java */
/* loaded from: classes3.dex */
public class by extends bt {
    private static final String A = "by";

    /* renamed from: z  reason: collision with root package name */
    public ev f24881z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public by(String str, String str2, bu buVar, String str3, byte b10, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b10, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public by(String str, String str2, bu buVar, String str3, List<cf> list, byte b10, JSONObject jSONObject) {
        super(str, str2, "GIF", buVar, list);
        be.a();
        av b11 = be.b(str3);
        this.f24813e = b11 == null ? null : b11.f24631e;
        if (b11 != null) {
            try {
                String str4 = b11.f24631e;
                this.f24881z = Build.VERSION.SDK_INT < 28 ? new ew(str4) : new et(str4);
            } catch (Exception e10) {
                this.f24881z = null;
                gg.a().a(new hg(e10));
            }
        }
        if (jSONObject != null) {
            this.f24817i = b10;
            this.f24814f = jSONObject;
        }
    }
}
