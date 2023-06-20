package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzop extends zznv {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.zzb.zzd;
        if (i11 == 536870912) {
            zzj = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 2) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24), zzj);
                position += 3;
            }
        } else if (i11 == 805306368) {
            zzj = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 1) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 2) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 3) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24), zzj);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        int i10 = zzmwVar.zzd;
        if (zzeg.zzT(i10)) {
            return i10 != 4 ? new zzmw(zzmwVar.zzb, zzmwVar.zzc, 4) : zzmw.zza;
        }
        throw new zzmx(zzmwVar);
    }
}
