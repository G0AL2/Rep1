package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f3476a;

    /* renamed from: b  reason: collision with root package name */
    public int f3477b;

    /* renamed from: c  reason: collision with root package name */
    public int f3478c;

    /* renamed from: d  reason: collision with root package name */
    public int f3479d;

    /* loaded from: classes.dex */
    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        private int f3480a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f3481b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f3482c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f3483d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private a b(int i10) {
            switch (i10) {
                case 0:
                    this.f3481b = 1;
                    break;
                case 1:
                    this.f3481b = 4;
                    break;
                case 2:
                    this.f3481b = 4;
                    break;
                case 3:
                    this.f3481b = 2;
                    break;
                case 4:
                    this.f3481b = 4;
                    break;
                case 5:
                    this.f3481b = 4;
                    break;
                case 6:
                    this.f3481b = 1;
                    this.f3482c |= 4;
                    break;
                case 7:
                    this.f3482c = 1 | this.f3482c;
                    this.f3481b = 4;
                    break;
                case 8:
                    this.f3481b = 4;
                    break;
                case 9:
                    this.f3481b = 4;
                    break;
                case 10:
                    this.f3481b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f3480a = AudioAttributesImplBase.e(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f3481b, this.f3482c, this.f3480a, this.f3483d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: c */
        public a a(int i10) {
            if (i10 != 10) {
                this.f3483d = i10;
                return b(i10);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
        this.f3476a = 0;
        this.f3477b = 0;
        this.f3478c = 0;
        this.f3479d = -1;
    }

    static int e(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    public int a() {
        return this.f3477b;
    }

    public int b() {
        int i10 = this.f3478c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f3479d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f3478c, this.f3476a);
    }

    public int d() {
        return this.f3476a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f3477b == audioAttributesImplBase.a() && this.f3478c == audioAttributesImplBase.b() && this.f3476a == audioAttributesImplBase.d() && this.f3479d == audioAttributesImplBase.f3479d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3477b), Integer.valueOf(this.f3478c), Integer.valueOf(this.f3476a), Integer.valueOf(this.f3479d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3479d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3479d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f3476a));
        sb2.append(" content=");
        sb2.append(this.f3477b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3478c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f3476a = 0;
        this.f3477b = 0;
        this.f3478c = 0;
        this.f3479d = -1;
        this.f3477b = i10;
        this.f3478c = i11;
        this.f3476a = i12;
        this.f3479d = i13;
    }
}
