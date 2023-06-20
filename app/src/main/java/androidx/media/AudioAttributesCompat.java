package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import g1.b;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements b {

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f3469b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f3470c;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f3471a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final AudioAttributesImpl.a f3472a;

        public a() {
            if (AudioAttributesCompat.f3470c) {
                this.f3472a = new AudioAttributesImplBase.a();
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                this.f3472a = new AudioAttributesImplApi26.a();
            } else if (i10 >= 21) {
                this.f3472a = new AudioAttributesImplApi21.a();
            } else {
                this.f3472a = new AudioAttributesImplBase.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f3472a.build());
        }

        public a b(int i10) {
            this.f3472a.a(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3469b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        } else if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        } else {
            switch (i11) {
                case 0:
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z10 ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (z10) {
                        throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
                    }
                    return 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat c(Object obj) {
        if (f3470c) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i10 >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.f3471a;
            if (audioAttributesImpl == null) {
                return audioAttributesCompat.f3471a == null;
            }
            return audioAttributesImpl.equals(audioAttributesCompat.f3471a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3471a.hashCode();
    }

    public String toString() {
        return this.f3471a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f3471a = audioAttributesImpl;
    }
}
