package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzato extends zzatj {
    public final zzatm zza = new zzatm();
    public ByteBuffer zzb;
    public long zzc;

    public zzato(int i10) {
    }

    private final ByteBuffer zzj(int i10) {
        ByteBuffer byteBuffer = this.zzb;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    @Override // com.google.android.gms.internal.ads.zzatj
    public final void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i10) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzj(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzb.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            return;
        }
        ByteBuffer zzj = zzj(i11);
        if (position > 0) {
            this.zzb.position(0);
            this.zzb.limit(position);
            zzj.put(this.zzb);
        }
        this.zzb = zzj;
    }

    public final boolean zzi() {
        return zzd(1073741824);
    }
}
