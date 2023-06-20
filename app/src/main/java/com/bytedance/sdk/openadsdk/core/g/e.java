package com.bytedance.sdk.openadsdk.core.g;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PermissionsResultAction.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12264a = "e";

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f12265b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private Looper f12266c = Looper.getMainLooper();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionsResultAction.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.g.e$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12273a;

        static {
            int[] iArr = new int[c.values().length];
            f12273a = iArr;
            try {
                iArr[c.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12273a[c.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12273a[c.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public abstract void a();

    public abstract void a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized boolean a(String str, int i10) {
        if (i10 == 0) {
            return a(str, c.GRANTED);
        }
        return a(str, c.DENIED);
    }

    public synchronized boolean b(String str) {
        String str2 = f12264a;
        Log.d(str2, "Permission not found: " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized boolean a(final String str, c cVar) {
        this.f12265b.remove(str);
        int i10 = AnonymousClass5.f12273a[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                new Handler(this.f12266c).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.g.e.2
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.a(str);
                    }
                });
                return true;
            } else if (i10 == 3) {
                if (b(str)) {
                    if (this.f12265b.isEmpty()) {
                        new Handler(this.f12266c).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.g.e.3
                            @Override // java.lang.Runnable
                            public void run() {
                                e.this.a();
                            }
                        });
                        return true;
                    }
                } else {
                    new Handler(this.f12266c).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.g.e.4
                        @Override // java.lang.Runnable
                        public void run() {
                            e.this.a(str);
                        }
                    });
                    return true;
                }
            }
        } else if (this.f12265b.isEmpty()) {
            new Handler(this.f12266c).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.g.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a();
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void a(String[] strArr) {
        Collections.addAll(this.f12265b, strArr);
    }
}
