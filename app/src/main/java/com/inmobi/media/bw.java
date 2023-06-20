package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.cb;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeCtaAsset.java */
/* loaded from: classes3.dex */
public final class bw extends cb {

    /* compiled from: NativeCtaAsset.java */
    /* loaded from: classes3.dex */
    public static class a extends cb.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, int i18, String str5, String[] strArr, cc ccVar) {
            super(i10, i11, i12, i13, i14, i15, i16, i17, str, str2, str3, str4, ccVar);
            this.f24890l = i18;
            this.f24892n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f24891m = str5.length() == 0 ? "#ff000000" : str5;
            int min = Math.min(strArr.length, 1);
            String[] strArr2 = new String[min];
            this.f24893o = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(String str, String str2, bu buVar, String str3, byte b10, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b10, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(String str, String str2, bu buVar, String str3, List<cf> list, byte b10, JSONObject jSONObject) {
        super(str, str2, "CTA", buVar, str3);
        a(list);
        if (jSONObject != null) {
            this.f24817i = b10;
            this.f24814f = jSONObject;
        }
    }
}
