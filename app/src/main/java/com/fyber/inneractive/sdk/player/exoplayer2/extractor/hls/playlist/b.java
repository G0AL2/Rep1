package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f18319b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18320c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18321d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18322e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18323f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18324g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18325h;

    /* renamed from: i  reason: collision with root package name */
    public final long f18326i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f18327j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18328k;

    /* renamed from: l  reason: collision with root package name */
    public final a f18329l;

    /* renamed from: m  reason: collision with root package name */
    public final List<a> f18330m;

    /* renamed from: n  reason: collision with root package name */
    public final List<String> f18331n;

    /* renamed from: o  reason: collision with root package name */
    public final long f18332o;

    /* loaded from: classes.dex */
    public static final class a implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f18333a;

        /* renamed from: b  reason: collision with root package name */
        public final long f18334b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18335c;

        /* renamed from: d  reason: collision with root package name */
        public final long f18336d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f18337e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18338f;

        /* renamed from: g  reason: collision with root package name */
        public final String f18339g;

        /* renamed from: h  reason: collision with root package name */
        public final long f18340h;

        /* renamed from: i  reason: collision with root package name */
        public final long f18341i;

        public a(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
            this.f18333a = str;
            this.f18334b = j10;
            this.f18335c = i10;
            this.f18336d = j11;
            this.f18337e = z10;
            this.f18338f = str2;
            this.f18339g = str3;
            this.f18340h = j12;
            this.f18341i = j13;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l10) {
            Long l11 = l10;
            if (this.f18336d > l11.longValue()) {
                return 1;
            }
            return this.f18336d < l11.longValue() ? -1 : 0;
        }
    }

    public b(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, a aVar, List<a> list, List<String> list2) {
        super(str);
        long j13;
        this.f18319b = i10;
        this.f18321d = j11;
        this.f18322e = z10;
        this.f18323f = i11;
        this.f18324g = i12;
        this.f18325h = i13;
        this.f18326i = j12;
        this.f18327j = z11;
        this.f18328k = z12;
        this.f18329l = aVar;
        this.f18330m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            a aVar2 = list.get(list.size() - 1);
            this.f18332o = aVar2.f18336d + aVar2.f18334b;
        } else {
            this.f18332o = 0L;
        }
        if (j10 == -9223372036854775807L) {
            j13 = -9223372036854775807L;
        } else {
            j13 = j10 >= 0 ? j10 : this.f18332o + j10;
        }
        this.f18320c = j13;
        this.f18331n = Collections.unmodifiableList(list2);
    }
}
