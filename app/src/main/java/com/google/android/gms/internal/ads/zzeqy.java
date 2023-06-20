package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Debug;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqy implements zzetg {
    private final zzfvm zza;

    public zzeqy(zzfvm zzfvmVar) {
        this.zza = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzH)).booleanValue()) {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzo().zza());
                return new zzeqz(bundle);
            }
        });
    }
}
