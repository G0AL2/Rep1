package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzym {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private Constructor zzb;

    public final zzyr zza(int i10) {
        Constructor constructor;
        synchronized (this.zza) {
            if (this.zza.get()) {
                constructor = this.zzb;
            } else {
                try {
                    if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        this.zzb = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzyr.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
                this.zza.set(true);
                constructor = this.zzb;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzyr) constructor.newInstance(0);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating FLAC extractor", e11);
        }
    }
}
