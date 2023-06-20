package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbo {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfbn zzi;
    public final Bundle zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbo(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i10 = 0;
        String str = "";
        long j10 = 0;
        zzfbn zzfbnVar = null;
        boolean z10 = false;
        String str2 = str;
        String str3 = str2;
        int i11 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgW)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfbnVar = new zzfbn(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("response_info_extras".equals(nextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfN)).booleanValue()) {
                        try {
                            Bundle zza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                            if (zza != null) {
                                bundle = zza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        this.zzb = str2;
        this.zzd = str3;
        this.zze = i11;
        this.zzf = j10;
        this.zzi = zzfbnVar;
        this.zzg = z10;
        this.zzh = str;
        this.zzj = bundle;
    }
}
