package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.util.Map;
import java.util.Objects;
import u7.d;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes2.dex */
final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a f21004a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, c.b> f21005b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(h8.a aVar, Map<d, c.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f21004a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f21005b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c
    h8.a e() {
        return this.f21004a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f21004a.equals(cVar.e()) && this.f21005b.equals(cVar.h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c
    Map<d, c.b> h() {
        return this.f21005b;
    }

    public int hashCode() {
        return ((this.f21004a.hashCode() ^ 1000003) * 1000003) ^ this.f21005b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f21004a + ", values=" + this.f21005b + "}";
    }
}
