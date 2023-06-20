package com.google.android.gms.internal.gcm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public interface zzf {
    ExecutorService zzd(int i10, ThreadFactory threadFactory, int i11);

    ExecutorService zzd(ThreadFactory threadFactory, int i10);

    ScheduledExecutorService zze(int i10, ThreadFactory threadFactory, int i11);
}
