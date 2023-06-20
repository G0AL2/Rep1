package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class MX implements Executor {
    public static int A03;
    public static byte[] A04;
    public static String[] A05 = {"dqRa11pwCIxD9G", "Prl4kldBaiKkX", "x63WXgOLaV3", "ISgeAY0wdrDCT1ale0N91K8aXfWfv0tW", "LCKhovWaUpSA3noBlHvNtEEMnkYTagBf", "4iBL7X4rSmnE5Q6mVAm5IE9McxSQzo1J", "Gaojjwe04e5jqq3nowZJFAyYK", "ekobvqODjhkADWqsAO3q6OJDBrcRvo3h"};
    public static final Executor A06;
    public static final Executor A07;
    public static final Executor A08;
    public static final Executor A09;
    public static final ExecutorService A0A;
    public static final ExecutorService A0B;
    public static final ExecutorService A0C;
    public static final AtomicBoolean A0D;
    public static final AtomicBoolean A0E;
    @Nullable
    public Executor A00;
    public ThreadPoolExecutor A01;
    public final int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{32, 50, 56, 47, 34, 125, 123, 124, 119, 102, 101, 125, 96, 121, 112, 74, 89, 70, 3, 30, 3, 64, 117, 103, Byte.MAX_VALUE, 103, 52, 101, 97, 113, 97, 113, 52, 96, 123, 123, 52, 120, 123, 122, 115, 58, 70, 68, 79, 68, 83, 72, 66};
    }

    static {
        A04();
        A08 = new MX(A00(7, 7, 8), 0);
        A06 = new MX(A00(0, 5, 91), 0);
        A07 = new MX(A00(5, 2, 3), 0);
        A03 = 32;
        A0C = Executors.newSingleThreadExecutor();
        A0B = Executors.newFixedThreadPool(5);
        A0D = new AtomicBoolean();
        A0E = new AtomicBoolean();
        A0A = Executors.newCachedThreadPool(new MV());
        A09 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    @VisibleForTesting
    public MX(String str, int i10) {
        this.A02 = i10;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int KEEP_ALIVE_SECONDS = (availableProcessors * 2) + 1;
        this.A01 = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), KEEP_ALIVE_SECONDS, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new MW(this, str));
        this.A01.allowCoreThreadTimeOut(true);
    }

    public static Executor A01() {
        AtomicBoolean atomicBoolean = A0E;
        if (A05[6].length() != 10) {
            A05[7] = "uTbwdcOZXJtEr7HfAL7lQlSS6oe88jWw";
            if (atomicBoolean.get()) {
                return A0A;
            }
            return A09;
        }
        throw new RuntimeException();
    }

    public static ExecutorService A02() {
        if (A0D.get()) {
            return A0A;
        }
        ExecutorService executorService = A0B;
        if (A05[7].charAt(6) != 'O') {
            throw new RuntimeException();
        }
        A05[1] = "2M7uNo";
        return executorService;
    }

    public static ExecutorService A03() {
        if (A0D.get()) {
            return A0A;
        }
        return A0C;
    }

    public static void A05(Context context) {
        A0D.set(JR.A20(context));
        A0E.set(JR.A1z(context));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.A00 == null && Looper.myLooper() == Looper.getMainLooper()) {
            this.A00 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        Executor executor = this.A00;
        if ((executor instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) executor).getQueue().size() < this.A02) {
            this.A00.execute(runnable);
            return;
        }
        int size = this.A01.getQueue().size();
        synchronized (MX.class) {
            int i10 = A03;
            int oldThreshold = A03;
            if (size == oldThreshold) {
                int oldThreshold2 = A03;
                A03 = oldThreshold2 * 2;
                C1399Xx A00 = C8T.A00();
                if (A00 != null) {
                    InterfaceC07818y A062 = A00.A06();
                    String A002 = A00(42, 7, 27);
                    int i11 = C07828z.A1c;
                    String A003 = A00(21, 21, 46);
                    A062.A8y(A002, i11, new AnonymousClass90(A003, A00(14, 7, 25) + i10));
                }
            }
        }
        this.A01.execute(runnable);
    }
}
