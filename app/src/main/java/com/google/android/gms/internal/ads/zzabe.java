package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabe {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzabe() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzabd zzabdVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzabdVar.zza);
            String str = zzabdVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzabdVar.zzc);
            this.zzb.writeLong(zzabdVar.zzd);
            this.zzb.write(zzabdVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
