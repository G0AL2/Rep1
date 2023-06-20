package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: FcmExecutors.java */
/* loaded from: classes3.dex */
class o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService a() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return bd.b.a().a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), bd.c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService c() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }
}
