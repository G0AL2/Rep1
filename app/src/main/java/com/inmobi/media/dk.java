package com.inmobi.media;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: TimeOutManager.java */
/* loaded from: classes3.dex */
public class dk {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25112a = "dk";

    /* renamed from: d  reason: collision with root package name */
    private static byte f25113d = -1;

    /* renamed from: b  reason: collision with root package name */
    private dj f25114b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Byte, Timer> f25115c = new HashMap<>();

    @SuppressLint({"UseSparseArrays"})
    public dk(dj djVar) {
        this.f25114b = djVar;
    }

    public final boolean a(final byte b10, long j10) {
        if (this.f25115c.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer(f25112a);
            this.f25115c.put(Byte.valueOf(b10), timer);
            timer.schedule(new TimerTask() { // from class: com.inmobi.media.dk.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    dk.a(dk.this, b10);
                }
            }, j10);
            return true;
        } catch (OutOfMemoryError unused) {
            hu.a((byte) 1, f25112a, "Could not execute timer due to OutOfMemory.");
            this.f25114b.d(b10);
            return false;
        }
    }

    public final void a(byte b10) {
        Timer timer = this.f25115c.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f25115c.remove(Byte.valueOf(b10));
        }
    }

    static /* synthetic */ void a(dk dkVar, final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.dk.2
            @Override // java.lang.Runnable
            public final void run() {
                dk.this.f25114b.c(b10);
            }
        });
    }
}
