package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a extends ReviewInfo {

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f23117a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f23117a = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent c() {
        return this.f23117a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f23117a.equals(((ReviewInfo) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23117a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23117a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
        sb2.append("ReviewInfo{pendingIntent=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
