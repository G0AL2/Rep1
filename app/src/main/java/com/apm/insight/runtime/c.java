package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<ICrashCallback> f6601a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<ICrashCallback> f6602b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<ICrashCallback> f6603c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<ICrashCallback> f6604d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<IOOMCallback> f6605e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6606a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6606a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6606a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6606a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6606a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6606a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public List<IOOMCallback> a() {
        return this.f6605e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.f6606a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6601a.add(iCrashCallback);
            this.f6602b.add(iCrashCallback);
            this.f6603c.add(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f6602b;
            } else if (i10 == 4) {
                list = this.f6601a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.f6603c;
            }
            list.add(iCrashCallback);
        }
        list = this.f6604d;
        list.add(iCrashCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(IOOMCallback iOOMCallback) {
        this.f6605e.add(iOOMCallback);
    }

    public List<ICrashCallback> b() {
        return this.f6601a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.f6606a[crashType.ordinal()];
        if (i10 == 1) {
            this.f6601a.remove(iCrashCallback);
            this.f6602b.remove(iCrashCallback);
            this.f6603c.remove(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f6602b;
            } else if (i10 == 4) {
                list = this.f6601a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.f6603c;
            }
            list.remove(iCrashCallback);
        }
        list = this.f6604d;
        list.remove(iCrashCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(IOOMCallback iOOMCallback) {
        this.f6605e.remove(iOOMCallback);
    }

    public List<ICrashCallback> c() {
        return this.f6602b;
    }

    public List<ICrashCallback> d() {
        return this.f6603c;
    }

    public List<ICrashCallback> e() {
        return this.f6604d;
    }
}
