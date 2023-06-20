package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UiRunnable.java */
/* loaded from: classes3.dex */
public abstract class as<T> extends af<ad> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public as(ad adVar, byte b10) {
        super(adVar, b10);
    }

    abstract void a(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final T t10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.as.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                as.this.a(t10);
            }
        });
    }
}
