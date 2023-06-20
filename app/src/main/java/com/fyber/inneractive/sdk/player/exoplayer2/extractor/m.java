package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final long f18412a;

        public a(long j10) {
            this.f18412a = j10;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j10) {
            return 0L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            return this.f18412a;
        }
    }

    long a(long j10);

    boolean a();

    long c();
}
