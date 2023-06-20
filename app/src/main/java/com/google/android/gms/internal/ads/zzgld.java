package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgld extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgld(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.zzc++;
        }
        this.zzd = -1;
        if (zzb()) {
            return;
        }
        this.zzb = zzgla.zze;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final void zza(int i10) {
        int i11 = this.zze + i10;
        this.zze = i11;
        if (i11 == this.zzb.limit()) {
            zzb();
        }
    }

    private final boolean zzb() {
        this.zzd++;
        if (this.zza.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
            this.zze = byteBuffer.position();
            if (this.zzb.hasArray()) {
                this.zzf = true;
                this.zzg = this.zzb.array();
                this.zzh = this.zzb.arrayOffset();
            } else {
                this.zzf = false;
                this.zzi = zzgnu.zze(this.zzb);
                this.zzg = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte zza;
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            zza = this.zzg[this.zze + this.zzh];
            zza(1);
        } else {
            zza = zzgnu.zza(this.zze + this.zzi);
            zza(1);
        }
        return zza & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i12 = this.zze;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i12 + this.zzh, bArr, i10, i11);
            zza(i11);
        } else {
            int position = this.zzb.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.zzb.position(this.zze);
            this.zzb.get(bArr, i10, i11);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.zzb.position(position);
            zza(i11);
        }
        return i11;
    }
}
