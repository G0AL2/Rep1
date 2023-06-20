package l8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import ea.n0;
import java.util.Arrays;
import jb.s;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f33792c = new e(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final e f33793d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f33794e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f33795a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33796b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioCapabilities.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static int[] a() {
            int[] iArr;
            s.a n10 = jb.s.n();
            for (int i10 : e.f33794e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    n10.a(Integer.valueOf(i10));
                }
            }
            n10.a(2);
            return mb.d.l(n10.h());
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f33795a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f33795a = new int[0];
        }
        this.f33796b = i10;
    }

    private static boolean b() {
        if (n0.f29709a >= 17) {
            String str = n0.f29711c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static e c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static e d(Context context, Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f33793d;
        }
        if (n0.f29709a >= 29 && (n0.x0(context) || n0.s0(context))) {
            return new e(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f33792c;
    }

    public int e() {
        return this.f33796b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return Arrays.equals(this.f33795a, eVar.f33795a) && this.f33796b == eVar.f33796b;
        }
        return false;
    }

    public boolean f(int i10) {
        return Arrays.binarySearch(this.f33795a, i10) >= 0;
    }

    public int hashCode() {
        return this.f33796b + (Arrays.hashCode(this.f33795a) * 31);
    }

    public String toString() {
        int i10 = this.f33796b;
        String arrays = Arrays.toString(this.f33795a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
