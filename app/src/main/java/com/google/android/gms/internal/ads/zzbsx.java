package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbsx {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbsu zza = new zzbsw();
    public static final zzbss zzb = new zzbss() { // from class: com.google.android.gms.internal.ads.zzbsv
        @Override // com.google.android.gms.internal.ads.zzbss
        public final Object zza(JSONObject jSONObject) {
            return zzbsx.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
