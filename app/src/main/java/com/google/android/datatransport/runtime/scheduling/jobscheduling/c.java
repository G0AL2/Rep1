package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import u7.d;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private h8.a f21012a;

        /* renamed from: b  reason: collision with root package name */
        private Map<d, b> f21013b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f21013b.put(dVar, bVar);
            return this;
        }

        public c b() {
            Objects.requireNonNull(this.f21012a, "missing required property: clock");
            if (this.f21013b.keySet().size() >= d.values().length) {
                Map<d, b> map = this.f21013b;
                this.f21013b = new HashMap();
                return c.d(this.f21012a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(h8.a aVar) {
            this.f21012a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* loaded from: classes2.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<EnumC0284c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new b.C0283b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<EnumC0284c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0284c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        int i11;
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * i11)));
    }

    public static a b() {
        return new a();
    }

    static c d(h8.a aVar, Map<d, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, map);
    }

    public static c f(h8.a aVar) {
        return b().a(d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(EnumC0284c.NETWORK_UNMETERED, EnumC0284c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<EnumC0284c> set) {
        if (set.contains(EnumC0284c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC0284c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC0284c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract h8.a e();

    public long g(d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<d, b> h();
}
