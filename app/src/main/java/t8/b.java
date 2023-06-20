package t8;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* compiled from: MotionPhotoDescription.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f37173a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f37174b;

    /* compiled from: MotionPhotoDescription.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f37175a;

        /* renamed from: b  reason: collision with root package name */
        public final long f37176b;

        /* renamed from: c  reason: collision with root package name */
        public final long f37177c;

        public a(String str, String str2, long j10, long j11) {
            this.f37175a = str;
            this.f37176b = j10;
            this.f37177c = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f37173a = j10;
        this.f37174b = list;
    }

    public MotionPhotoMetadata a(long j10) {
        long j11;
        if (this.f37174b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f37174b.size() - 1; size >= 0; size--) {
            a aVar = this.f37174b.get(size);
            boolean equals = "video/mp4".equals(aVar.f37175a) | z10;
            if (size == 0) {
                j11 = j12 - aVar.f37177c;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= aVar.f37176b;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j13, j14, this.f37173a, j15, j16);
    }
}
