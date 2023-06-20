package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* compiled from: NativeTimer.java */
/* loaded from: classes3.dex */
public final class cc {

    /* renamed from: a  reason: collision with root package name */
    public a f24895a;

    /* renamed from: b  reason: collision with root package name */
    public a f24896b;

    /* compiled from: NativeTimer.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f24897a;

        /* renamed from: b  reason: collision with root package name */
        private long f24898b;

        /* renamed from: c  reason: collision with root package name */
        private String f24899c;

        /* renamed from: d  reason: collision with root package name */
        private bx f24900d;

        public a(long j10, long j11, String str, bx bxVar) {
            this.f24897a = j10;
            this.f24898b = j11;
            this.f24899c = str;
            this.f24900d = bxVar;
        }

        public final long a() {
            String b10;
            long j10 = this.f24897a;
            bt b11 = this.f24900d.b(this.f24899c);
            if ((b11 instanceof cg) && (b10 = ((cg) b11).b().b()) != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b10);
                j10 = (long) (j10 + (((this.f24898b * 1.0d) / 100.0d) * (Integer.valueOf(mediaMetadataRetriever.extractMetadata(9)).intValue() / 1000)));
                mediaMetadataRetriever.release();
            }
            if (j10 >= 0) {
                return j10;
            }
            return 0L;
        }
    }

    public cc(a aVar, a aVar2) {
        this.f24895a = aVar;
        this.f24896b = aVar2;
    }
}
