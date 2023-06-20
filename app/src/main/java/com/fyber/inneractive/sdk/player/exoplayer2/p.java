package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f19218a = new a();

    /* loaded from: classes.dex */
    public class a extends p {
        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int a() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int a(Object obj) {
            return -1;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public c a(int i10, c cVar, boolean z10, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public int b() {
            return 0;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.p
        public b a(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f19219a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19220b;

        /* renamed from: c  reason: collision with root package name */
        public int f19221c;

        /* renamed from: d  reason: collision with root package name */
        public long f19222d;

        /* renamed from: e  reason: collision with root package name */
        public long f19223e;
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f19224a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19225b;

        /* renamed from: c  reason: collision with root package name */
        public int f19226c;

        /* renamed from: d  reason: collision with root package name */
        public int f19227d;

        /* renamed from: e  reason: collision with root package name */
        public long f19228e;

        /* renamed from: f  reason: collision with root package name */
        public long f19229f;

        /* renamed from: g  reason: collision with root package name */
        public long f19230g;
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i10, b bVar, boolean z10);

    public final c a(int i10, c cVar) {
        return a(i10, cVar, false, 0L);
    }

    public abstract c a(int i10, c cVar, boolean z10, long j10);

    public abstract int b();

    public final boolean c() {
        return b() == 0;
    }
}
