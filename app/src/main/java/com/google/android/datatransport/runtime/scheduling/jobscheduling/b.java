package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.util.Objects;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes2.dex */
final class b extends c.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f21006a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21007b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<c.EnumC0284c> f21008c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0283b extends c.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f21009a;

        /* renamed from: b  reason: collision with root package name */
        private Long f21010b;

        /* renamed from: c  reason: collision with root package name */
        private Set<c.EnumC0284c> f21011c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b a() {
            String str = "";
            if (this.f21009a == null) {
                str = " delta";
            }
            if (this.f21010b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f21011c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new b(this.f21009a.longValue(), this.f21010b.longValue(), this.f21011c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a b(long j10) {
            this.f21009a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a c(Set<c.EnumC0284c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f21011c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b.a
        public c.b.a d(long j10) {
            this.f21010b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    long b() {
        return this.f21006a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    Set<c.EnumC0284c> c() {
        return this.f21008c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.c.b
    long d() {
        return this.f21007b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.b) {
            c.b bVar = (c.b) obj;
            return this.f21006a == bVar.b() && this.f21007b == bVar.d() && this.f21008c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f21006a;
        long j11 = this.f21007b;
        return this.f21008c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f21006a + ", maxAllowedDelay=" + this.f21007b + ", flags=" + this.f21008c + "}";
    }

    private b(long j10, long j11, Set<c.EnumC0284c> set) {
        this.f21006a = j10;
        this.f21007b = j11;
        this.f21008c = set;
    }
}
