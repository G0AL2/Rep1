package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f1807a;

    /* renamed from: b  reason: collision with root package name */
    private final a.a f1808b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f1809c;

    /* renamed from: d  reason: collision with root package name */
    private final PendingIntent f1810d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a.b bVar, a.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1807a = bVar;
        this.f1808b = aVar;
        this.f1809c = componentName;
        this.f1810d = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder a() {
        return this.f1808b.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName b() {
        return this.f1809c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent c() {
        return this.f1810d;
    }
}
