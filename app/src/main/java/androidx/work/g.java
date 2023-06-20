package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f4458a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4459b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f4460c;

    public g(int i10, Notification notification) {
        this(i10, notification, 0);
    }

    public int a() {
        return this.f4459b;
    }

    public Notification b() {
        return this.f4460c;
    }

    public int c() {
        return this.f4458a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f4458a == gVar.f4458a && this.f4459b == gVar.f4459b) {
            return this.f4460c.equals(gVar.f4460c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4458a * 31) + this.f4459b) * 31) + this.f4460c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4458a + ", mForegroundServiceType=" + this.f4459b + ", mNotification=" + this.f4460c + '}';
    }

    public g(int i10, Notification notification, int i11) {
        this.f4458a = i10;
        this.f4460c = notification;
        this.f4459b = i11;
    }
}
