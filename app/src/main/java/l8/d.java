package l8;

import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;

/* compiled from: AudioAttributes.java */
/* loaded from: classes2.dex */
public final class d implements j8.g {

    /* renamed from: g  reason: collision with root package name */
    public static final d f33779g = new C0441d().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f33780a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33781b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33782c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33783d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33784e;

    /* renamed from: f  reason: collision with root package name */
    private AudioAttributes f33785f;

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes2.dex */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes2.dex */
    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            try {
                builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: AudioAttributes.java */
    /* renamed from: l8.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0441d {

        /* renamed from: a  reason: collision with root package name */
        private int f33786a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f33787b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f33788c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f33789d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f33790e = 0;

        public d a() {
            return new d(this.f33786a, this.f33787b, this.f33788c, this.f33789d, this.f33790e);
        }
    }

    public AudioAttributes a() {
        if (this.f33785f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f33780a).setFlags(this.f33781b).setUsage(this.f33782c);
            int i10 = n0.f29709a;
            if (i10 >= 29) {
                b.a(usage, this.f33783d);
            }
            if (i10 >= 32) {
                c.a(usage, this.f33784e);
            }
            this.f33785f = usage.build();
        }
        return this.f33785f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f33780a == dVar.f33780a && this.f33781b == dVar.f33781b && this.f33782c == dVar.f33782c && this.f33783d == dVar.f33783d && this.f33784e == dVar.f33784e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f33780a) * 31) + this.f33781b) * 31) + this.f33782c) * 31) + this.f33783d) * 31) + this.f33784e;
    }

    private d(int i10, int i11, int i12, int i13, int i14) {
        this.f33780a = i10;
        this.f33781b = i11;
        this.f33782c = i12;
        this.f33783d = i13;
        this.f33784e = i14;
    }
}
