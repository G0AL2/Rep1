package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaan extends zzaas {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaan(zzzy zzzyVar) {
        super(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    protected final boolean zza(zzdy zzdyVar) throws zzaar {
        if (!this.zzc) {
            int zzk = zzdyVar.zzk();
            int i10 = zzk >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(zzk >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzS("audio/mpeg");
                zzabVar.zzw(1);
                zzabVar.zzT(i11);
                this.zza.zzk(zzabVar.zzY());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzab zzabVar2 = new zzab();
                zzabVar2.zzS(str);
                zzabVar2.zzw(1);
                zzabVar2.zzT(8000);
                this.zza.zzk(zzabVar2.zzY());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzaar("Audio format not supported: " + i10);
            }
            this.zzc = true;
        } else {
            zzdyVar.zzG(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    protected final boolean zzb(zzdy zzdyVar, long j10) throws zzbp {
        if (this.zze == 2) {
            int zza = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza);
            this.zza.zzs(j10, 1, zza, 0, null);
            return true;
        }
        int zzk = zzdyVar.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzdyVar.zza();
            byte[] bArr = new byte[zza2];
            zzdyVar.zzB(bArr, 0, zza2);
            zzxs zza3 = zzxt.zza(bArr);
            zzab zzabVar = new zzab();
            zzabVar.zzS(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC);
            zzabVar.zzx(zza3.zzc);
            zzabVar.zzw(zza3.zzb);
            zzabVar.zzT(zza3.zza);
            zzabVar.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzabVar.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze != 10 || zzk == 1) {
            int zza4 = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza4);
            this.zza.zzs(j10, 1, zza4, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
